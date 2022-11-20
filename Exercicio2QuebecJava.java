import java.util.Scanner;

class Exercicio2QuebecJava {
     public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);

            String b1, b2, b3, b4, b5;

            System.out.println("Responda sim ou não para as seguintes perguntas: ");
            
            System.out.println("Telefonou para a vítima?");

            b1 = scan.next();

            System.out.println("O suspeito esteve no local do crime? ");
            
            b2 = scan.next();
            
            System.out.println("O suspeito mora perto da vítima? ");

            b3 = scan.next();
            
            System.out.println("O suspeito devia para a vítima? ");

            b4 = scan.next();

            System.out.println("O suspeito já trabalhou com a vítima? " );

            b5 = scan.next();
            
            System.out.println("O suspeito telefonou para a vítima? " + b1);
            System.out.println("O suspeito esteve no local do crime? " + b2);
            System.out.println("O suspeito mora perto da vítima? " + b3);
            System.out.println("O suspeito devia para a vítima? " + b4);
            System.out.println("O suspeito já trabalhou com a vítima? " + b5);

            System.out.println("Teste");

            System.out.println("Hello!");

        
        
        
     }



}