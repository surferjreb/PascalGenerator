package com.brownj;

import java.util.ArrayList;

public class StatementList {

    private static StatementList myStatements = null;
    private ArrayList<String> statements;

    private StatementList(){
       // System.out.println("StatementList created");
        statements = new ArrayList<>();
    }

    public static StatementList getStatementsInstance(){
        if(myStatements == null){
            myStatements = new StatementList();
        }

        return myStatements;
    }

    public String getStatements(int index){
        return statements.get(index);
    }

    public void addToStatement(String statement){
        statements.add(statement);
    }

    public void printStatementList() throws NullPointerException{
        if(!statements.isEmpty()) {
            for (String value : statements) {
                System.out.println(value);
            }
        }
        else{
            throw new NullPointerException();
        }
    }

}//end class
