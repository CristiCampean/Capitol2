package org.fasttrackit;
// spune cate bucati de pita primeste fiecare persoana
import java.util.Scanner;
public class Exercitiu8 {
    public static void main(String[] args) throws MyException{
        Scanner s = new Scanner(System.in);
        System.out.println( "Cate persoane sunteti?");
        int persoane = s.nextInt();
        System.out.println( "Cate 2pizza aveti de impartit?");
        int pizza = s.nextInt();

             if (pizza <= 0) {
             MyException e = new MyException();
              throw e;
         }
        double rezultat =0;
        int bucati = 0;
         bucati = pizza * 4;
         rezultat = bucati / persoane;
        System.out.println( "Fiecare persoana primeste " + rezultat + " bucati");



    }
}

