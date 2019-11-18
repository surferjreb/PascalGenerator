package com.brownj;

public class Word {

    private String[] keyWordsToSet = {"program", "uses", "type", "begin", "end.", "var", "end"};
    private String[] randomIdentifiers = {"myItem", "name", "temp", "value", "ice", "blue"};
    private String[] randomVariables = {"char", "integer", "real", "boolean", "string"};

    public Word(){}//end constructor

    public String getIdentifier(int index){
        return randomIdentifiers[index];
    }

    public String getKeyWordsToSet(int index){
        return keyWordsToSet[index];
    }

    public String getRandomVariables(int index){
        return randomVariables[index];
    }


}//end class
