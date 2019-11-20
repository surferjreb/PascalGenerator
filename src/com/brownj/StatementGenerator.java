package com.brownj;

import org.jetbrains.annotations.Contract;

import java.util.Random;

public class StatementGenerator {

    private StatementList myList;
    private Random rand;

    public StatementGenerator(){
        myList = StatementList.getStatementsInstance();
        rand = new Random();
        //System.out.println("Statement Generator is created!!");
    }

    public void buildCodeBlock(){
        //begins to build a statement

        int numberOfStatements = rand.nextInt(11);
        myList.addToStatement("begin ");

        createStatementBlock(numberOfStatements);

        myList.addToStatement("end. ");
    }
//----------------------------------------------------------------
    private void createStatementBlock(int statementCount){
        int numberOfIndents = 1;

        String indent = "";

            for (int i = 0; i < numberOfIndents; i++) {
                indent = String.format("%s\t", indent);
            }

            compoundStatement(indent, statementCount);

    }//end codeStatementBlock
//----------------------------------------------------------------
    private void compoundStatement(String indent, int statementCount){
        //creates a compound statement
        int numberOfAssignments = rand.nextInt(10);

        if(statementCount != 0) {
            myList.addToStatement(indent + "begin ");
            assignmentStatement(indent, numberOfAssignments);
            myList.addToStatement(indent + "end; ");
            statementCount -= 1;
            compoundStatement(indent, statementCount);
        }//end if




    }//end compoundStatement
//----------------------------------------------------------------
    private void assignmentStatement(String indent, int numberOfAssignment){
        //creates an assignment statement

        String variable= generateWord();
        String assignment = ":= ";
        String expression = generateExpression(variable);
        String assignmentStatement;

        if(numberOfAssignment != 0) {
            indent = "\t" + indent;
            assignmentStatement = "\t\t" + variable + assignment + expression;

            myList.addToStatement(assignmentStatement);
            numberOfAssignment -= 1;
            assignmentStatement(indent, numberOfAssignment);
        }
    }//end assignmentStatement
//----------------------------------------------------------------
    private String generateWord(){
        String temp;
        int letters = 4;

        temp = word(letters);

        return temp;

    }//end generateWord
//----------------------------------------------------------------
    private String generateExpression(String variable){
        String temp;
        int numberOfFactors = rand.nextInt(5);
        int expressionType = rand.nextInt(5);

        temp = expression(variable, numberOfFactors, expressionType);

        return temp;
    }//end generateExpression
//----------------------------------------------------------------
    private String expression(String variable, int numberOfFactors,
                              int expressionType){
        String temp = "";

        String myString = getMyString();

        switch(expressionType){
            case 0:
                temp = getNumber(numberOfFactors);
                break;
            case 1:
                temp = "NOT " + generateWord();
                break;
            case 2:
                temp = getNumber(numberOfFactors) + " (" + getNumber(numberOfFactors) + ")";
                break;
            case 3:
                temp = variable + getOperand() + getNumber(numberOfFactors);
                break;
            case 4:
                temp = getMyString();
        }



        return temp + ";";
    }//end expression
//----------------------------------------------------------------
    private String getNumber(int numberOfFactors){
        int temp = rand.nextInt(4000);
        StringBuilder number = new StringBuilder();


        while(numberOfFactors != 0){

            number.append(String.valueOf(temp)).append(getOperand());
            numberOfFactors -= 1;
            getNumber(numberOfFactors);
        }



        return number.toString();
    }//end getNumber
//----------------------------------------------------------------
    private String getMyString(){
        String temp;

        temp = "Word to your mother!";

        return temp;
    }//end getMyString
//----------------------------------------------------------------
    private String getOperand(){
        int selector = rand.nextInt(5);
        String temp = "";

        switch(selector){
            case 0:
                    temp = " + ";
                    break;
            case 1:
                    temp = " - ";
                    break;
            case 2:
                    temp = " * ";
                    break;
            case 3:
                    temp = " / ";
                    break;
            case 4:
                    temp = " % ";
                    break;
        }//end switch

        return temp;
    }//end getOperand
//----------------------------------------------------------------
    private String word(int letterAmount){
        char letter = ' ';
        StringBuilder temp = new StringBuilder();
        int valueToChar = 0;

        for(int i = 0; i < letterAmount; i++){
            valueToChar = rand.nextInt(123);


                while(valueToChar < 97){
                    valueToChar = rand.nextInt(123);
                }
                letter = (char) valueToChar;

            temp.append(String.valueOf(letter));
           // if(!Character.isDigit(letter))

        }

        return temp + " ";

    }//end word
//----------------------------------------------------------------
}//end class

