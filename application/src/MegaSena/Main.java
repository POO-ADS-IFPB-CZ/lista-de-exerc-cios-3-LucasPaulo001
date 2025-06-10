package MegaSena;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        int count = 0;

        System.out.println("Informe os números: ");
        while(count < 6){
            int num = sc.nextInt();

            if(num < 1 || num > 60){
                System.out.println("Número não permitido, insira entre [1, 60]");
                continue;
            }
            boolean duplicado = false;
            for(int k = 0; k < count; k++){
                if(nums[k] == num){
                    duplicado = true;
                    break;
                }
            }
            if(duplicado){
                System.out.println("Número duplicado!");
            }
            else{
                nums[count] = num;
                count++;
            }
        }
        Arrays.sort(nums);
        System.out.println("Números ordenados: " + Arrays.toString(nums));
    }
}
