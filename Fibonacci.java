import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);
        Scanner scan = new Scanner(System.in);
        int i,seq,num;

        System.out.println("Defina o tamanho da sequência de Fibonacci: ");
        seq = scan.nextInt();

        for (i = 1; i < seq; i++) {
            fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));
        }
        
        System.out.println("Digite um numero para ser encontrado na sequencia: ");
        num = scan.nextInt();
        scan.close();

        System.out.println("\n------------------------------\n");
        
        System.out.println("Procurando o numero na lista...");
        System.out.println("...");
        System.out.println("...");
        for(i = 0; i < fibonacci.size(); i++) {
            if(fibonacci.get(i)==num) {
                System.out.println("O numero informado esta na lista!");
                System.out.println("O numero "+num+" se encontra na posição "+(i+1)+" da sequência.");
            }
        }

        System.out.println("\n------------------------------\n");

        System.out.println("Lista gerada: "+ fibonacci);

    }
}