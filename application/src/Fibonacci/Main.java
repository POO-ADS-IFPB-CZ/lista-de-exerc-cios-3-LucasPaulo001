package Fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da série de Fibonacci: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
            return;
        }

        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.println("Série de Fibonacci com " + n + " termos:");
        System.out.println(Arrays.toString(fibonacci));
    }
}
