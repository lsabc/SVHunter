package SVParser;

import java.util.ArrayList;
import java.util.List;

public class DangerousNode {
    ObsrNode content;

    String stage;

    List<DangerousNode> preNode;
    List<DangerousNode> nextNode;

    public DangerousNode(ObsrNode obsr){
        content = obsr;
        stage = obsr.stage;
        preNode = new ArrayList<DangerousNode>();
        nextNode = new ArrayList<DangerousNode>();
    }

    public Boolean addPreNode(DangerousNode newPreNode){
        try {
            preNode.add(newPreNode);

            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public Boolean addNextNode(DangerousNode newNextNode){
        try {
            nextNode.add(newNextNode);

            return true;
        } catch(Exception e) {
            return false;
        }
    }

}
