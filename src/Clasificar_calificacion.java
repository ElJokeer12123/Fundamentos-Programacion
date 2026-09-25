import java.util.Scanner;

public class Clasificar_calificacion {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double CALIFICACION = 100;

        System.out.println("Ingresa tu calificacion:");
        CALIFICACION = scanner.nextDouble();
        
        if (CALIFICACION >= 90 && CALIFICACION <=100) {
            System.out.println("Excelente");
        } else if (CALIFICACION >= 80 && CALIFICACION <=89) {
            System.out.println("Muy bien");
        } else if (CALIFICACION >= 70 && CALIFICACION <=79) {
            System.out.println("Bien");
        } else if (CALIFICACION >= 60 && CALIFICACION <=69) {
            System.out.println("Suficiente");
        } else if (CALIFICACION >= 0 && CALIFICACION <=59) {
            System.out.println("Reprobado");
        }
    }
}
