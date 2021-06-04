package com.Beginner;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        ScientificCalc scientificCalc = new ScientificCalc();

        int a,b,m;
        double j,k;
        boolean exit = false;


        while (!exit){
            System.out.println("-------Calculations-----\n" +
                    "1:Addition\n" +
                    "2:Subtraction\n" +
                    "3:Multiplication\n" +
                    "4:Division\n" +
                    "5:Square root\n" +
                    "6:Square\n" +
                    "7:Cube\n" +
                    "8:Sine\n" +
                    "9:Cosine\n" +
                    "10:Tangent\n" +
                    "0:Exit\n");

            System.out.println("Choose Option: ");
            int userInput = input.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("Enter Numbers: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println("The answer is: " + calculator.getAddValue(a,b));
                    break;

                case 2:
                    System.out.println("Enter Numbers: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println("The answer is: " + calculator.getSubtractValue(a,b));
                    break;

                case 3:
                    System.out.println("Enter Numbers: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    if(a==0 && b==0){
                        System.out.println("Zero Multiplication Error!!");
                    }else {

                        System.out.println("The answer is: " + calculator.getMultiplyValue(a, b));
                    }
                    break;

                case 4:
                    System.out.println("Enter Numbers: ");
                    j = input.nextDouble();
                    k = input.nextDouble();
                    if(j==0 && k==0){
                        System.out.println("Zero Division Error!!");
                    }else{
                        System.out.println("The answer is: " + calculator.getDivideValue(j, k));
                    }
                    break;

                case 5:
                    System.out.println("Enter Number: ");
                    m=input.nextInt();
                    System.out.println("The answer is: " +scientificCalc.squareRoot(m));
                    break;
                case 6:
                    System.out.println("Enter Number: ");
                    m=input.nextInt();
                    System.out.println("The answer is: " +scientificCalc.square(m));
                    break;
                case 7:
                    System.out.println("Enter Number: ");
                    m=input.nextInt();
                    System.out.println("The answer is: " +scientificCalc.cube(m));
                    break;
                case 8:
                    System.out.println("Enter Number: ");
                    m=input.nextInt();
                    System.out.println("The answer is: " +scientificCalc.sin(m));
                    break;
                case 9:
                    System.out.println("Enter Number: ");
                    m=input.nextInt();
                    System.out.println("The answer is: " +scientificCalc.cos(m));
                    break;
                case 10:
                    System.out.println("Enter Number: ");
                    m=input.nextInt();
                    System.out.println("The answer is: " +scientificCalc.tan(m));
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid operation");


               

            }
        }


        }

    
    }
