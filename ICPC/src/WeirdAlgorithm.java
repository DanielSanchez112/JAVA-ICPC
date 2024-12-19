import java.text.DecimalFormat;
import java.util.Scanner;

public class WeirdAlgorithm {

    public static void suma(double n){
        StringBuilder builder = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.##");
        while(n != 1){
            builder.append(df.format(n));
            builder.append(" ");
            if ((n%2) == 0.0){
                n = n/2;
            } else {
                n = (n*3) + 1;
            }
        }

        builder.append(1);
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
