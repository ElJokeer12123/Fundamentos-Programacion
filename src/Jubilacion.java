import java.util.Scanner;

public class Jubilacion {//Algoritmo

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int EDAD_JUBILACION = 65;
        final int MAYORIA_DE_EDAD = 18;
        String nombre;
        int edad = 0;
        System.out.println("Escribe tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = scanner.nextInt();

        if (edad >= EDAD_JUBILACION){
            System.out.println(nombre + " Tiene " + edad + " Años y esta listo para jubilarse");
        } else if (edad >=MAYORIA_DE_EDAD && edad < EDAD_JUBILACION) {
            System.out.printf(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
            System.out.println(nombre + " Tiene " + edad + " Años y todavia no puede jubilarse");
            System.out.println("Le faltan " + (EDAD_JUBILACION-edad) + " Para jubilarse");
        }
    }
}//Fin de algoritmo
