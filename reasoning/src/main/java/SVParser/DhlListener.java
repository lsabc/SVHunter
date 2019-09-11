// Generated from /Users/f3i/IdeaProjects/antlr/Dhl.g4 by ANTLR 4.7
package SVParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DhlParser}.
 */
public interface DhlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code newNode}
	 * labeled alternative in {@link DhlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterNewNode(DhlParser.NewNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newNode}
	 * labeled alternative in {@link DhlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitNewNode(DhlParser.NewNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleObsr}
	 * labeled alternative in {@link DhlParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSingleObsr(DhlParser.SingleObsrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleObsr}
	 * labeled alternative in {@link DhlParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSingleObsr(DhlParser.SingleObsrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link DhlParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(DhlParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link DhlParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(DhlParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orEffect}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterOrEffect(DhlParser.OrEffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orEffect}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitOrEffect(DhlParser.OrEffectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterParens(DhlParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitParens(DhlParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andEffect}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterAndEffect(DhlParser.AndEffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andEffect}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitAndEffect(DhlParser.AndEffectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEffect}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterSingleEffect(DhlParser.SingleEffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEffect}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitSingleEffect(DhlParser.SingleEffectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localCause}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterLocalCause(DhlParser.LocalCauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localCause}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitLocalCause(DhlParser.LocalCauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attackStage}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterAttackStage(DhlParser.AttackStageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attackStage}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitAttackStage(DhlParser.AttackStageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code desc}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void enterDesc(DhlParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code desc}
	 * labeled alternative in {@link DhlParser#obsr}.
	 * @param ctx the parse tree
	 */
	void exitDesc(DhlParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readVar}
	 * labeled alternative in {@link DhlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterReadVar(DhlParser.ReadVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readVar}
	 * labeled alternative in {@link DhlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitReadVar(DhlParser.ReadVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeVar}
	 * labeled alternative in {@link DhlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterWriteVar(DhlParser.WriteVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeVar}
	 * labeled alternative in {@link DhlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitWriteVar(DhlParser.WriteVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code crashVar}
	 * labeled alternative in {@link DhlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterCrashVar(DhlParser.CrashVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code crashVar}
	 * labeled alternative in {@link DhlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitCrashVar(DhlParser.CrashVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code finalStage}
	 * labeled alternative in {@link DhlParser#stage}.
	 * @param ctx the parse tree
	 */
	void enterFinalStage(DhlParser.FinalStageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code finalStage}
	 * labeled alternative in {@link DhlParser#stage}.
	 * @param ctx the parse tree
	 */
	void exitFinalStage(DhlParser.FinalStageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toeStage}
	 * labeled alternative in {@link DhlParser#stage}.
	 * @param ctx the parse tree
	 */
	void enterToeStage(DhlParser.ToeStageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toeStage}
	 * labeled alternative in {@link DhlParser#stage}.
	 * @param ctx the parse tree
	 */
	void exitToeStage(DhlParser.ToeStageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code harvestStage}
	 * labeled alternative in {@link DhlParser#stage}.
	 * @param ctx the parse tree
	 */
	void enterHarvestStage(DhlParser.HarvestStageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code harvestStage}
	 * labeled alternative in {@link DhlParser#stage}.
	 * @param ctx the parse tree
	 */
	void exitHarvestStage(DhlParser.HarvestStageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVar}
	 * labeled alternative in {@link DhlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterSingleVar(DhlParser.SingleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVar}
	 * labeled alternative in {@link DhlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitSingleVar(DhlParser.SingleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPath}
	 * labeled alternative in {@link DhlParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterNormalPath(DhlParser.NormalPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPath}
	 * labeled alternative in {@link DhlParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitNormalPath(DhlParser.NormalPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fuzzMatch}
	 * labeled alternative in {@link DhlParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterFuzzMatch(DhlParser.FuzzMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fuzzMatch}
	 * labeled alternative in {@link DhlParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitFuzzMatch(DhlParser.FuzzMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fileSystemPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void enterFileSystemPath(DhlParser.FileSystemPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fileSystemPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void exitFileSystemPath(DhlParser.FileSystemPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code webPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void enterWebPath(DhlParser.WebPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code webPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void exitWebPath(DhlParser.WebPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dbPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void enterDbPath(DhlParser.DbPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dbPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void exitDbPath(DhlParser.DbPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dpPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void enterDpPath(DhlParser.DpPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dpPath}
	 * labeled alternative in {@link DhlParser#pid}.
	 * @param ctx the parse tree
	 */
	void exitDpPath(DhlParser.DpPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiPath}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void enterMultiPath(DhlParser.MultiPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiPath}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void exitMultiPath(DhlParser.MultiPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notPath}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void enterNotPath(DhlParser.NotPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notPath}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void exitNotPath(DhlParser.NotPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rootDic}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void enterRootDic(DhlParser.RootDicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootDic}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void exitRootDic(DhlParser.RootDicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlePath}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void enterSinglePath(DhlParser.SinglePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singlePath}
	 * labeled alternative in {@link DhlParser#dic}.
	 * @param ctx the parse tree
	 */
	void exitSinglePath(DhlParser.SinglePathContext ctx);
}