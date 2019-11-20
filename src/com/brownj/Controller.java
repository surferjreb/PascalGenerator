package com.brownj;

public class Controller {
    private StatementGenerator myGenerator;
    private StatementList myList;

    public Controller(){
        myGenerator = new StatementGenerator();
        System.out.println("Controller created");

    }

    public void runController(){
        //this will start the program

        try {
            System.out.println("Controller running");
            myList = StatementList.getStatementsInstance();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}//End class

