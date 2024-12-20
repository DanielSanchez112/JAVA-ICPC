import java.util.Scanner;

public class IncreasingArray {
    public static void n1(int max, String str) {
        long sum = 0;
        String[] str2 = str.split(" ");
        var array = new int[max];

        for (int i = 0; i < str2.length; i++) {
            array[i] = Integer.parseInt(str2[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sum += array[i] - array[i + 1];
                array[i + 1] = array[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        long inicio = System.nanoTime();

        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        n1(max, str);

//        long fin = System.nanoTime();
//        long tiempo = fin - inicio;
//        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
//        System.out.println("Tiempo de ejecución: " + (tiempo / 1_000_000) + " milisegundos");

    }
}
