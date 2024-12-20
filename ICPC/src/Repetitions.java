import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Repetitions {
    public static void n1(String n){
        n = n+"0";
        int num = 0, sum = 0;

        for(int i = 0; i < n.length();i++){
            if (n.charAt(i) == '0'){
                break;
            }
            // System.out.println(n.charAt(i)+" "+ n.charAt(i+1));
            if(n.charAt(i) == n.charAt(i+1)){
                num += 1;
            }else {
                num += 1;
                if(num > sum){
                    sum = num;
                }
                num = 0;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        long inicio = System.nanoTime();

        Scanner scan = new Scanner(System.in);
        n1(scan.nextLine());

//        long fin = System.nanoTime();
//        long tiempo = fin - inicio;
//        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
//        System.out.println("Tiempo de ejecución: " + (tiempo / 1_000_000) + " milisegundos");

    }
}
