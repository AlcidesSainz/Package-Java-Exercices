import java.util.Scanner;

/*Averiguar numero del Tarot
* Se necesita:
* Fecha de nacimiento
* Reducirlo a un unico digito
* Ejemplo:
* 17 de octubre de 1970
* 17 + 10 + 1970 = 1997 ->1+9+9+7 = 26 -> 2 + 6 = 8 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        //Pidiendo datos al usuario
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = sc.nextInt();
        //Sumando los numeros de la fecha de cumpleanos y guardando el resultado en la variable suma
        suma = dia+mes+anio;

        //Descompones el numero
        int u,d,c,m;
        u = suma%10;
        suma/=10;
        d = suma%10;
        suma/=10;
        c = suma%10;
        suma/=10;
        m =suma%10;
        suma = u+d+c+m;

        if (suma<10 & suma>0){
            System.out.println("Tu numero del tarot es: "+ suma);
        }else {
            u = suma%10;
            suma/=10;
            d = suma%10;
            suma = u+d;
            System.out.println("Tu numero del tarot es: "+suma);
        }





    }
}
