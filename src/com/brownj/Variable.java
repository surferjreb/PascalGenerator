package com.brownj;

public class Variable {
    private Word myword;

    public Variable(){
        myword = new Word();
    }

    public String getVariableIdentifier(int index){

        return myword.getIdentifier(index);
    }

    public String getVariableType(int index){

        return myword.getRandomVariables(index);
    }

    public String getVariableName(int index){
        return myword.getIdentifier(index);
    }


}
