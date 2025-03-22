//importando scanner
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


       //Instanciando classe
        Scanner scanner = new Scanner(System.in);


        //Concatenando char
        System.out.println("Digite três caracteres: ");
        //Utilizando o Scanner para capturar dados pelo terminal de forma dinâmica
        char num = scanner.next().charAt(0);
        char num1 = scanner.next().charAt(0);
        char num2 = scanner.next().charAt(0);

        System.out.println("Os números digitados foram: "+ num + " - "+ num1 + " - "+ num2);
        System.out.println("A junção dos caracteres é: "+ num+num1+num2);

        //Somando números
        System.out.println("Digite dois números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Os números digitados foram: "+ n1 + " - "+ n2);
        System.out.println("A soma dos números é:  "+ (n1+n2));





        }
}
