package org.fasttrackit;
import java.lang.*;
import java.util.Scanner;
public class Exercitiu13 {
    public static void main(String[] args)
    {
        double p;
        double t;
        double r;
        double n;
        double z;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduceti suma: ");
        p = s.nextDouble();
        System.out.print("Introduceti numarul de ani : ");
        t = s.nextDouble();
        System.out.print("Introduceti rata dobanzii anuale : ");
        r = s.nextDouble();
        System.out.print("De cate ori se plateste dobanda pe an : ");
        n = s.nextDouble();

        z  = p * Math.pow(1.0 + r /100, n);
        System.out.println("Suma: " + p);
        System.out.println("Nr ani: " + t);
        System.out.println("Dobanda : " + r);
        System.out.println("Dobanda compusa : " + z);
    }
}
