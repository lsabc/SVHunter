package SVParser;

import java.util.ArrayList;

public class SensitiveMethod {
    private String methodName;
    private String lineNumber;
    private String consequence;
    private boolean specialCase;
    private ArrayList<SourceData> sourceDataList;

    public SensitiveMethod(){
        methodName = "";
        lineNumber = "";
        consequence = "";
        specialCase = false;
        sourceDataList = new ArrayList<>();
    }

    public SensitiveMethod(SensitiveMethod sm, SourceData sd){
        methodName = sm.getMethodName();
        lineNumber = sm.getLineNumber();
        consequence = String.format("%s -> %s $var_",sm.getConsequence().split("\\.")[0],"write");
        specialCase = false;
        sourceDataList = new ArrayList<>();
        sourceDataList.add(sd);
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public boolean getSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(String sensitiveUsage) {
        if (sensitiveUsage.contains("void write(byte[],java.io.File)"))
            this.specialCase = true;
    }

    public String getConsequence() {
        return String.format("%s# [ %s at Line %s ]", consequence, methodName, lineNumber);
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public ArrayList<SourceData> getSourceDataList() {
        return sourceDataList;
    }

    public void addSinkData(SourceData sourceData) {
        this.sourceDataList.add(sourceData);
    }


}
