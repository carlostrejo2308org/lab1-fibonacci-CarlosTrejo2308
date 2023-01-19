import java.util.Scanner;

public class FiboRecursivo {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingresa el indice: ");
        n = s.nextInt();

        if (n < 1) {
            System.out.println("Valor incorrecto");

        } else if (n == 1) {
            System.out.println(n);
        } else {
            a = (n - 1) + (n - 2);
            System.out.println("El indice apunta a: " + a);
        }
    }
}
