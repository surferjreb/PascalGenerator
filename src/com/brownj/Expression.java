package com.brownj;

public class Expression {
    private SimpleExpression mySimpleExpression;
    private Factor myFactor;
    private String term;
    private String factor;

    public Expression(){
        mySimpleExpression = new SimpleExpression();
        myFactor = new Factor();
    }//end constructor

    public String getExpression(){
        String term1 = myFactor.getFactor();

        return term1;
    }
}//end class
