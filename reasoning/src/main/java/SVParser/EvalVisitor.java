package SVParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.*;


public class EvalVisitor extends DhlBaseVisitor<ObsrNode>{
    Map<String, Integer> memory = new HashMap<String, Integer>();
    Logger logger = Logger.getLogger("mylogger");
    List<ObsrNode> node_list = new ArrayList<ObsrNode>();
    Boolean EndFlag = false;
    String originText;

    public EvalVisitor(String origin){
        originText = origin;
    }

    @Override
    public ObsrNode visitNewNode(DhlParser.NewNodeContext ctx) {
        visitChildren(ctx);

        //if(EndFlag == false)
        //    ;
        //else{
            NodeConnector nc = new NodeConnector(node_list, originText);
            nc.doConnect();
        //}

        return null;
    }

    @Override
    public ObsrNode visitBlank(DhlParser.BlankContext ctx) {
        // TODO Auto-generatedmethod stub
        EndFlag = true;
        return super.visitBlank(ctx);
    }

    @Override
    public ObsrNode visitAttackStage(DhlParser.AttackStageContext ctx) {
        // TODO Auto-generatedmethod stub

        ObsrNode node = visit(ctx.obsr());
        String stage = ctx.stage().getText();

        node.stage = stage;
        //System.out.println("[Debug] node: " + node.toString());

        return node;
    }

    @Override
    public ObsrNode visitSingleObsr(DhlParser.SingleObsrContext ctx) {
        ObsrNode node = visit(ctx.obsr());

        //System.out.println("[Debug] Singelobsr: " + node.toString());

        node_list.add(node);

        return node;
    }

    @Override
    public ObsrNode visitSingleEffect(DhlParser.SingleEffectContext ctx) {
        // TODO Auto-generatedmethod stub
        ObsrNode node = visit(ctx.domain());
        ObsrNode pmn = visit(ctx.getChild(2));
        node.primitive = pmn.primitive;

        return node;
    }

    @Override
    public ObsrNode visitLocalCause(DhlParser.LocalCauseContext ctx) {
        ObsrNode node = new ObsrNode();
        node.preCondition.add(visit(ctx.obsr(0)));
        node.consequence.add(visit(ctx.obsr(1)));

        for(int i = 0; i < node.preCondition.size(); i++){
            if(node.preCondition.get(i).stage.equals("toe")){
                node.stage = "toe";
                return node;
            }
        }

        for(int i = 0; i < node.consequence.size(); i++){
            if(node.consequence.get(i).stage.equals("final")){
                node.stage = "final";
                return node;
            }
        }

        return node;
    }

    @Override
    public ObsrNode visitOrEffect(DhlParser.OrEffectContext ctx) {
        ObsrNode node = new ObsrNode();

        node.consequence.add(visit(ctx.obsr(0)));
        node.consequence.add(visit(ctx.obsr(1)));

        node.orFlag = true;

        return node;
        }

    @Override
    public ObsrNode visitAndEffect(DhlParser.AndEffectContext ctx) {
        ObsrNode node = new ObsrNode();

        node.consequence.add(visit(ctx.obsr(0)));
        node.consequence.add(visit(ctx.obsr(1)));

        return node;
    }

    @Override
    public ObsrNode visitDesc(DhlParser.DescContext ctx) {
        return visit(ctx.primitive());
    }

    @Override
    public ObsrNode visitParens(DhlParser.ParensContext ctx) {
        return visit(ctx.obsr());
    }


    @Override
    public ObsrNode visitReadVar(DhlParser.ReadVarContext ctx) {
        ObsrNode node = new ObsrNode();
        PrimitiveNode pnode = node.primitive;

        pnode.op_type = 0;
        pnode.var_name = ctx.var().getText();

        node.primitive = pnode;

        //logger.info("[Debug] " + pnode.var_name);

        return node;
    }

    @Override
    public ObsrNode visitWriteVar(DhlParser.WriteVarContext ctx) {
        // System.out.println("[Info] write var: "+ ctx.getText());
        ObsrNode node = new ObsrNode();
        PrimitiveNode pnode = node.primitive;

        pnode.op_type = 1;
        pnode.var_name = ctx.var().getText();

        node.primitive = pnode;

        //logger.info("[Debug] " + pnode.var_name);

        return node;
    }

//    @Override
////    public ObsrNode visitExecVar(DhlParser.ExecVarContext ctx) {
////        // System.out.println("[Info] exec var: "+ ctx.getText());
////        ObsrNode node = new ObsrNode();
////        PrimitiveNode pnode = node.primitive;
////
////        pnode.op_type = 2;
////        pnode.var_name = ctx.var().getText();
////
////        node.primitive = pnode;
////
////        //logger.info("[Debug] " + pnode.var_name);
////
////        return node;
////    }

    @Override
    public ObsrNode visitCrashVar(DhlParser.CrashVarContext ctx) {
        // System.out.println("[Info] crash var: "+ ctx.getText());
        ObsrNode node = new ObsrNode();
        PrimitiveNode pnode = node.primitive;

        pnode.op_type = 3;
        pnode.var_name = ctx.var().getText();

        node.primitive = pnode;

        node.stage = "final";

        //logger.info("[Debug] " + pnode.var_name);

        return node;
    }

//    @Override
//    public ObsrNode visitWebVar(DhlParser.WebVarContext ctx) {
//        // System.out.println("[Info] web var: "+ ctx.getText());
//        ObsrNode node = new ObsrNode();
//        PrimitiveNode pnode = node.primitive;
//
//        pnode.op_type = 4;
//        pnode.var_name = ctx.var().getText();
//
//        node.primitive = pnode;
//
//        //logger.info("[Debug] " + pnode.var_name);
//
//        //super.visitChildren(ctx);
//
//        return node;
//    }

    @Override
    public ObsrNode visitSingleVar(DhlParser.SingleVarContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public ObsrNode visitNormalPath(DhlParser.NormalPathContext ctx) {
        return visit(ctx.pid());
    }

    @Override
    public ObsrNode visitFuzzMatch(DhlParser.FuzzMatchContext ctx) {
        ObsrNode node = visit(ctx.domain());
        node.domain.fuzzy = true;

        //System.out.println("[debug] visitchildren: " + node.domain.pid.path.toString());

        return node;
    }


    @Override
    public ObsrNode visitFileSystemPath(DhlParser.FileSystemPathContext ctx) {
        ObsrNode node = visit(ctx.dic());

        node.domain.domain_type = "fs";

        return node;
    }

    @Override
    public ObsrNode visitWebPath(DhlParser.WebPathContext ctx) {
        ObsrNode node = visit(ctx.dic());

        node.domain.domain_type = "net_state";

        return node;
    }

//    @Override
//    public ObsrNode visitProcessPath(DhlParser.ProcessPathContext ctx) {
//        ObsrNode node = visit(ctx.dic());
//
//        node.domain.domain_type = "sys_process";
//
//        return node;
//    }

    @Override
    public ObsrNode visitDbPath(DhlParser.DbPathContext ctx) {
        ObsrNode node = visit(ctx.dic());

        node.domain.domain_type = "db";

        return node;
    }

//    @Override
//    public ObsrNode visitCodePath(DhlParser.CodePathContext ctx) {
//        ObsrNode node = visit(ctx.dic());
//
//        node.domain.domain_type = "code_var";
//
//        return node;
//    }

//    @Override
//    public ObsrNode visitSvcPath(DhlParser.SvcPathContext ctx) {
//
//        ObsrNode node = visit(ctx.dic());
//
//        node.domain.domain_type = "net_svc";
//
//        return node;
//    }

    @Override
    public ObsrNode visitDpPath(DhlParser.DpPathContext ctx) {
        ObsrNode node = visit(ctx.dic());

        node.domain.domain_type = "proto_msg";

        node.stage = "toe";

        return node;
    }

//    @Override
//    public ObsrNode visitFileSystemPathVar(DhlParser.FileSystemPathVarContext ctx) {
//        ObsrNode node = new ObsrNode();
//        DicNode dicnode = new DicNode();
//
//        dicnode.path.add(ctx.var().getText());
//        node.domain.pid = dicnode;
//
//        node.domain.domain_type = "fs";
//
//        return node;
//    }

    @Override
    public ObsrNode visitMultiPath(DhlParser.MultiPathContext ctx) {
        ObsrNode node = visit(ctx.dic());
        DicNode dicnode = node.domain.pid;

        dicnode.path.add(ctx.NAME().getText());
        node.domain.pid = dicnode;

        return node;
    }

    @Override
    public ObsrNode visitNotPath(DhlParser.NotPathContext ctx) {
        ObsrNode node = visit(ctx.dic());

        node.domain.pid.notFlag = true;

        return node;
    }

    @Override
    public ObsrNode visitRootDic(DhlParser.RootDicContext ctx) {
        ObsrNode node = new ObsrNode();
        DicNode dicnode = new DicNode();

        dicnode.path.add(".");
        node.domain.pid = dicnode;

        return node;
    }

    @Override
    public ObsrNode visitSinglePath(DhlParser.SinglePathContext ctx) {
        ObsrNode node = new ObsrNode();
        DicNode dicnode = new DicNode();

        dicnode.path.add(ctx.NAME().getText());
        node.domain.pid = dicnode;

        return node;
    }


}

