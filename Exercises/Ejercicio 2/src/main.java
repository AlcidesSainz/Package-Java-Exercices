import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b,x,y;
        //Pidiendo datos al usuario
        System.out.println("Ingrese el valor del limite(b): ");
        b = sc.nextInt();
        System.out.println("Ingrese el valor de la incognita x: ");
        x = sc.nextInt();
        System.out.println("Ingrese el valor de la incognita y: ");
        y = sc.nextInt();
        float resultado = 0;
        float sumatoria = 0;
        for (int a = 0; a <=b ; a++) {
        resultado = 1/(x+(a*y));
        sumatoria+=resultado;
        }
        System.out.println("El resultado de la sumatoria es: "+ sumatoria);

    }
}
