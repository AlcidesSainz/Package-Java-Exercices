import java.util.ArrayList;
import java.util.Scanner;

/*Programa que calcule los centros numericos entre 1 y n
Ejemplo
n = 6
Numeros menores a 6 [1,2,3,4,5] = 15
Numeros mayores a 6 [7 y 8] = 15
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        //Creando una lista
        ArrayList<Integer>menoresN = new ArrayList();
        //Pidiendo el valor de n al usuario
        System.out.println("Ingrese el valor de n del centro numerico: ");
        n = sc.nextInt();


        //Almacenando dentro de la lista menoresN los numeros menores a n
        for (int i = 1; i < n; i++) {
            menoresN.add(i);
        }
        System.out.println(menoresN);
        //Sumando los numeros de la lista menoresN
        int sumaMenores = 0;
        for (int i = 0; i < menoresN.size(); i++) {
            sumaMenores+= menoresN.get(i);
        }
        System.out.println("Resultado de la suma menores: "+sumaMenores);


        //Declarando ArrayList para almacenar los valores mayores a n que van a sumar lo mismo que la ArrayList menoresN
        ArrayList<Integer>mayoresN = new ArrayList();
        int sumaMayores = 0;

        for (int i = n+1;i<n*2 ; i++) {
            mayoresN.add(i);
            sumaMayores+= i;

            if (sumaMayores==sumaMenores){
                break;
            }


        }
        System.out.println(mayoresN);
        System.out.println("Resultado de la suma mayores: " + sumaMayores);
    }
}
