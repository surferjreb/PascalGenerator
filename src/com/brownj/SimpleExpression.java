package com.brownj;

public class SimpleExpression {
    private String[] operatorsArithmetic = {"+", "-", "*", "/", "%"};
    private String[] operatorsRelational = {"=", "<", ">", "<>", ">=", "<="};
    private String[] operatorsBoolean = {"and", "and then", "or", "or else", "not"};
    private String[] operatorsBitWise = {"&", "|", "!", "~", "<<", ">>"};

    public SimpleExpression(){

    }

    public String getOperatorsArithmetic(int index) {
        return operatorsArithmetic[index];
    }

    public String getOperatorsRelational(int index) {
        return operatorsRelational[index];
    }

    public String getOperatorsBoolean(int index) {
        return operatorsBoolean[index];
    }

    public String getOperatorsBitWise(int index) {
        return operatorsBitWise[index];
    }
}
