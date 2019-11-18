package com.brownj;

public class Factor {
    private Variable myVar;
    private Expression myExpression;
    private int number;
    private String myString;

    public Factor(){
        myExpression = new Expression();
        myVar = new Variable();
    }

    public String getFactor(){
        int index = 0;
        String var = myVar.getVariableName(index);
        this.number = 23;
        this.myString = "Hello, there!";

        return myString;
    }


}//end class
