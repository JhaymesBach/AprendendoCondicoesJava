import java.util.Scanner;

public class ExemploCondicao2 {

    public static void main(String[] args) {

        double valorBruto = 3000;
        double desconto = 0d;

        //operadores logicos
        // && e
        // || ou

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do bruto: ");

        valorBruto = scanner.nextDouble();

        if(valorBruto > 1000 && valorBruto <= 2000){
             desconto = valorBruto * 0.10;
        } else if(valorBruto > 2000 && valorBruto < 3000){
             desconto = valorBruto * (20 / 100);
        } else if(valorBruto >= 3000){
             desconto = valorBruto * (30. / 100);
        }

        System.out.println("valor Bruto é: " + valorBruto);
        System.out.println("Valor do desconto é: " + desconto);
        System.out.println("Valor Liquído é: " + (valorBruto - desconto));

        }


    }


