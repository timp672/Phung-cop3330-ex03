/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //Prompt quote
        System.out.println( "What is the quote? " );
        String quote = scan.nextLine();
        //Prompt who said the quote
        System.out.println( "Who said it? " );
        String saidQuote = scan.nextLine();

        System.out.println( saidQuote+ " says, " + "\"" +quote+ "\" " );
    }
}
