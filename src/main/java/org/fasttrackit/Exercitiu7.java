package org.fasttrackit;
//  / Calculati aria camerei
import java.util.Scanner;
public class Exercitiu7 {

        public static void main( String [] args){
            int arie;
            Scanner s= new Scanner( System.in);
            System.out.println("Cat este lungimea camerei ?");
            int lungime = s.nextInt();
            System.out.println("Cat este latimea camerei ?");
            int  latime = s.nextInt();
            arie = lungime* latime;
            System.out.println( "Aria camerei este " + arie);
        }
    }



