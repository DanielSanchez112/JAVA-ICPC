import java.util.Scanner;

public class WeirdAlgorithm {

    public static void suma(int n){
        var x = 0;
        StringBuilder builder = new StringBuilder();
        while(x != 1){
            builder.append(n);
            builder.append(" ");
            if (n == 1){
                x = 1;
            }
            if ((n%2) == 0){
                n /= 2;

            } else if ((n%2) != 0) {
                n = (n*3)+1;
            }
        }
        System.out.println(builder.toString().trim());
    }

    public static void main(String[] args) {
        long inicio = System.nanoTime();

        Scanner scan = new Scanner(System.in);
        suma(scan.nextInt());

        long fin = System.nanoTime();
        long tiempo = fin - inicio;
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
        System.out.println("Tiempo de ejecución: " + (tiempo / 1_000_000) + " milisegundos");
    }
}
