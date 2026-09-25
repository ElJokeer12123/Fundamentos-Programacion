import java.util.Scanner;

public class Aprobado_Reprobado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double calificacion;

        System.out.println("Ingresa tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Calificacion:");
        calificacion = scanner.nextDouble();

        if (calificacion >= 70){
            System.out.println(nombre + " Tiene " + calificacion + " Has aprobado la materia");
        }
        if (calificacion <=70) {
            System.out.println(nombre + " Tiene " + calificacion + " Has reprobado la materia");
        }
    }
}
