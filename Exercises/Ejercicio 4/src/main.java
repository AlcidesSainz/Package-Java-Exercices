/*Programa que genera una secuencia de digitos
    El numero de filas esta comprendida entre 11 y 20 y el resultado aparece en la pantalla
                    1
                   232
                  34543
                 4567654
                567898765
               67890109876
*/


import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int n = sc.nextInt();

        int [] arreglo = new int[n];
        Arrays.fill(arreglo,' ');

        for (int i = 1; i <=arreglo.length; i++) {
            arreglo[n-i] = 1;
            System.out.println(arreglo[i]);

        }

    }
}
