import java.util.Scanner;

public class MissingNumber {

    public static int n1(int n){
        int sum = 0;
        for(var i = 0; i < n; i++){
           sum += i+1;
        }
        return sum;
    }

    public static int n2(String n){
        int sum = 0;
        int number;
        String[] numbers = n.split(" ");
        for(String num : numbers){
            number = Integer.parseInt(num);
            sum += number;
        }
        return sum;
    }


    public static void main(String[] args) {
//        long inicio = System.nanoTime();

        Scanner scan = new Scanner(System.in);
        var sum1 = n1(scan.nextInt());
        scan.nextLine();
        var str = scan.nextLine();
        var sum2 = n2(str);

        System.out.println(sum1 - sum2);

/*
        long fin = System.nanoTime();
        long tiempo = fin - inicio;
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
        System.out.println("Tiempo de ejecución: " + (tiempo / 1_000_000) + " milisegundos");
*/

    }
}
