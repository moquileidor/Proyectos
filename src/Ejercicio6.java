import java.util.Scanner;

public class Ejercicio6 {
    public void run() {
        int valor1, valor2, valor3, valor4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor entero: ");
        valor1 = sc.nextInt();
        System.out.println("Ingrese un segundo valor entero: ");
        valor2 = sc.nextInt();
        System.out.println("Ingrese un tercer valor entero: ");
        valor3 = sc.nextInt();
        System.out.println("Ingrese un cuarto valor entero: ");
        valor4 = sc.nextInt();


        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
            System.out.println("El valor " + valor1 + " es el mayor");
        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
            System.out.println("El valor " + valor2 + " es el mayor");
        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
            System.out.println("El valor " + valor3 + " es el mayor");
        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
            System.out.println("El valor " + valor4 + " es el mayor");
        } else {
            System.out.println("Los valores ingresados son iguales");
        }
    }
}
