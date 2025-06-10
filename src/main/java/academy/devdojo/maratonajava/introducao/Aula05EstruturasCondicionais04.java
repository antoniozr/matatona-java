package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioAnual;
        double primeiraFaixa = 9.70 /100;
        double segundaFaixa = 37.35 /100;
        double terceiraFaixa = 49.50 /100;
        double valorImposto;
        System.out.println("Digite o valor do seu salário anual:");
        salarioAnual = sc.nextDouble();
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual *  segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("impsto a ser pago é: " + valorImposto);
    }

}
