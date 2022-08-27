import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Pedir el valor de las variables al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a (NO puede ser un numero negativo): ");
        int a = sc.nextInt();
        System.out.println("Ingrese el valor de b (NO puede ser un numero negativo): ");
        int b = sc.nextInt();
        //Comprobar que los valores ingresados no son negativos
        if (a<0){
            System.out.println("Ingrese nuevamente el valor de a: ");
             a = sc.nextInt();
        }
        if (b<0){
            System.out.println("Ingrese nuevamente el valor de b: ");
            b = sc.nextInt();
        }
        //Comprobar que a es menor a b
        int aux=0;
        if (a>b){
            aux = a;
            a = b;
            b = aux;
            System.out.println("Los valores han sido intercambiados:");
            System.out.println("El nuevo valor de a es: " + a);
            System.out.println("El nuevo valor de b es: " + b);
        }
        //La variable resto se va a usar para separar los numeros que son multiplos de 5
        int resto;
        //La variable total se va a utilizar para guardar el total de la suma de los multiplos de 5
        int total = 0;
        //Hallar los multiplos de 5 y sumarlos
        for (int i = a; i <= b; i++) {
            resto = i%5;
            if (resto ==0){
                System.out.println(i + " es multiplo de 5");
                total+=i;
            }
        }
        if (total>0){
            System.out.println("El total de la suma de los multiplos de 5 es: " + total);
        }
        if (total == 0) {
            System.out.println("No existe ningun multiplo de 5 en el rango de numeros ingresados");
        }
    }
}
