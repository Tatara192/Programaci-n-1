import java.util.Scanner;

public class CuatroPuntoTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        // Encontrar el mayor
        int max = Math.max(a, Math.max(b, c));

        // Encontrar el menor
        int min = Math.min(a, Math.min(b, c));

        // El número central es la suma menos el mayor y el menor
        int central = (a + b + c) - max - min;

        System.out.println("El número central es: " + central);

        sc.close();
    }
}
