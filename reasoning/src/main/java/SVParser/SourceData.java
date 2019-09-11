package SVParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SourceData {
    private String dataType;
    private String operation;
    private String pid;
    private boolean specialCase;
    private String DFMethod;

    public SourceData(){
        dataType = "";
        operation = "";
        pid = "";
        specialCase = false;
        DFMethod = "";
    }

    public SourceData(SensitiveMethod sm, String DFMethod){
        Matcher matcher = Pattern.compile("\\$(.+)::(.+) ->(.+)").matcher(sm.getConsequence());
        matcher.find();
        dataType = matcher.group(1);
        operation = "read";
        pid = matcher.group(2);
        specialCase = false;
        this.DFMethod = DFMethod;
    }

    public String getDFMethod() {
        return DFMethod;
    }

    public boolean setDFMethod(SensitiveMethod sm, String DFMethod) {
        this.DFMethod = DFMethod;
        if ((DFMethod.contains("getSwitchFeaturesReply") || DFMethod.contains("getDevices")) && sm.getConsequence().contains("net_state")) return true;
        return false;
    }

    public String getDataType() {
        return dataType;
    }

    public Boolean getSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(String sinkData) {
        if (sinkData.split(", ").length == 2)
            this.specialCase = true;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCondition(){
        return String.format("$%s::%s -> %s $var_#",dataType,pid,operation);
    }
}
