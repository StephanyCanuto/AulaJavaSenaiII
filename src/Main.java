//importando scanner

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//       Instanciando classe
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


        //Conversão de Tipos Automática
        int numeroInt = 10;
        double numeroDouble = numeroInt; // Promoção automática
        System.out.println(numeroDouble); // Saída: 10.0

        //Conversão de Tipos com Casting Explpicito
        double numDouble = 123.456;
        int numInt = (int) numDouble; // Casting explícito
        System.out.println(numInt); // Saída: 123 (perda da parte decimal)

        //Parsing de String
        String numeroTexto = "42";
        int nInt = Integer.parseInt(numeroTexto);
        System.out.println(nInt); // Saída: 42

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String inputInt = scanner1.nextLine();

        try {
            int nmrInt = Integer.parseInt(inputInt);
            System.out.println("Número inteiro convertido: " + nmrInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para inteiro: " + e.getMessage());
        }

        System.out.print("Digite um número decimal: ");
        String inputDouble = scanner1.nextLine();

        try {
            double nmrDouble = Double.parseDouble(inputDouble);
            System.out.println("Número decimal convertido: " + nmrDouble);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para decimal: " + e.getMessage());
        }

    }
}
