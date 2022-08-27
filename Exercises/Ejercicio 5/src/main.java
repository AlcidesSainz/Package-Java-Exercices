import java.util.Scanner;

/*Programa para acertar numero
* Generar un numer aleatorio y por cada intento fallido nos indicara si l numero ingresado es mayor o menor al deseado
* El numero pensado del ordenador se puede obtener multiplicando por una constante el valor devuelto por el metodo random de la
* clase math */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAle = (int)(Math.random()*100+1);
        int opcion;
        do {
            System.out.println("Bienvenido al juego de adivina el numero: ");
            System.out.println("Elija la dificultad deseada: ");
            System.out.println("1) Facil (10 intentos)");
            System.out.println("2) Media(5 intentos)");
            System.out.println("3) Dificil(3 intentos)");
            System.out.println("4) Práctica(intentos infinitos)");
            System.out.println("0) Salir");
            System.out.println("Elija la opcion deseada: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    facil(numAle);
                    break;
                case 2:
                    medio(numAle);
                    break;
                case 3:
                    dificil(numAle);
                    break;
                case 4:
                    practica(numAle);
                    break;

            }
        } while (opcion !=0);
    }

    public static void facil(int numAle){
    int nIntentos = 10;
    int num ;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Ingrese un numero del 1 al 100: ");
        num = sc.nextInt();
        if (num<numAle){
            System.out.println("El numero ingresado es menor al que se quiere adivinar");

        }
        if (num>numAle){
            System.out.println("El numero ingresado es mayor al que se quiere adivinar");
        }
        if(num==numAle){
            System.out.println("Numero Encontrado");
            System.out.println("Ganaste!!!!!");
            System.out.println("********************");
            System.out.println(" ");
            System.out.println(" ");
        }
        if (num!=numAle){
            nIntentos--;
            System.out.println("Intentos restantes: " + nIntentos);
        }
        if (nIntentos ==0) {
            System.out.println("Perdiste :(");
            System.out.println("*************");
            System.out.println(" ");
            System.out.println(" ");
            break;
        }
    }while (num!=numAle);
    }


    public static void medio(int numAle){
        int nIntentos = 5;
        int num ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero del 1 al 100: ");
            num = sc.nextInt();
            if (num<numAle){
                System.out.println("El numero ingresado es menor al que se quiere adivinar");

            }
            if (num>numAle){
                System.out.println("El numero ingresado es mayor al que se quiere adivinar");
            }
            if(num==numAle){
                System.out.println("Numero Encontrado");
                System.out.println("Ganaste!!!!!");
                System.out.println("********************");
                System.out.println(" ");
                System.out.println(" ");
            }
            if (num!=numAle){
                nIntentos--;
                System.out.println("Intentos restantes: " + nIntentos);
            }
            if (nIntentos ==0) {
                System.out.println("Perdiste :(");
                System.out.println("*************");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
        }while (num!=numAle);
    }

    public static void dificil(int numAle){
        int nIntentos = 3;
        int num ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero del 1 al 100: ");
            num = sc.nextInt();
            if (num<numAle){
                System.out.println("El numero ingresado es menor al que se quiere adivinar");

            }
            if (num>numAle){
                System.out.println("El numero ingresado es mayor al que se quiere adivinar");
            }
            if(num==numAle){
                System.out.println("Numero Encontrado");
                System.out.println("Ganaste!!!!!");
                System.out.println("********************");
                System.out.println(" ");
                System.out.println(" ");
            }
            if (num!=numAle){
                nIntentos--;
                System.out.println("Intentos restantes: " + nIntentos);
            }
            if (nIntentos ==0) {
                System.out.println("Perdiste :(");
                System.out.println("*************");
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
        }while (num!=numAle);
    }

    public static void practica(int numAle){
        int num ;
        int nIntentos = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero del 1 al 100: ");
            num = sc.nextInt();
            if (num<numAle){
                System.out.println("El numero ingresado es menor al que se quiere adivinar");

            }
            if (num>numAle){
                System.out.println("El numero ingresado es mayor al que se quiere adivinar");
            }
            if(num!=numAle){
                nIntentos++;
            }
            if(num==numAle){
                System.out.println("Numero Encontrado");
                System.out.println("Ganaste!!!!!");
                System.out.println("Numero de Intentos: "+ nIntentos);
                System.out.println("********************");
                System.out.println(" ");
                System.out.println(" ");
            }
        }while (num!=numAle);
    }

}


