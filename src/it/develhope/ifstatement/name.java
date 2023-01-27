package it.develhope.ifstatement;

import java.util.Scanner;

public class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name-");
        String myName= sc.next();
        if (myName.length() %2==0)
        {
            System.out.println("the numbers of letters is even");
        }
        else
        {
            System.out.printf("the numbers of letters is odd");
        }
    }

}
