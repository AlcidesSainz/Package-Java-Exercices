import java.util.Scanner;

/*
Programa que solicite un texto debe de tener letras,espacios en blanco,comas y punto final
Cada caracter debe de estar modificado
ejemplo:
a = k, b = l, o = y, p = z, q = a, z = j e igual para minusculas
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese un texto de una linea: ");
        cadena = sc.nextLine();
        //Cambiar vocales
        cadena = cadena.replace('a', 'q');
        cadena = cadena.replace('A', 'Q');
        cadena = cadena.replace('e', 'd');
        cadena = cadena.replace('E', 'D');
        cadena = cadena.replace('i', 'k');
        cadena = cadena.replace('I', 'K');
        cadena = cadena.replace('o', 'l');
        cadena = cadena.replace('O', 'L');
        cadena = cadena.replace('u', 'j');
        cadena = cadena.replace('U', 'J');
        //Cambiar letras ,signos y numeros
       cadena = cadena.replace('w','s');
        cadena = cadena.replace('r','f');
        cadena = cadena.replace('g','t');
        cadena = cadena.replace('y','h');
        cadena = cadena.replace('p',':');
        cadena = cadena.replace('S','x');
        cadena = cadena.replace('R','Z');
        cadena = cadena.replace('9','M');
        cadena = cadena.replace('1','b');
        cadena = cadena.replace('2','?');
        cadena = cadena.replace('h','b');
        cadena = cadena.replace('.','+');
        cadena = cadena.replace(' ','=');
        cadena = cadena.replace(',','5');
        cadena = cadena.replace('P','"');
        cadena = cadena.replace('B','n');
        cadena = cadena.replace('M','>');
        cadena = cadena.replace('m','~');

        System.out.println(cadena);

    }
}

