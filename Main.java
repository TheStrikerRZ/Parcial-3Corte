package Parcial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GestionEstudiante gestionEstudiantes = new GestionEstudiante(5);
        int opcion;
        
        do{
            System.out.println("--------EduPilo.S.A.--------");
            System.out.println("--Menu Gestion Estudiantes--");
            System.out.println("seleccione una de las siguientes opciones");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar Estudiante por nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir del menu");
            opcion=sc.nextInt();
            sc.nextLine();
        
            switch (opcion) {
                case 1:
                    System.out.print("Escriba el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    double promedio = sc.nextDouble();
                    gestionEstudiantes.agregarEstudiante(nombre, edad, promedio);
                    break;
                case 2:
                    gestionEstudiantes.mostrarEstudiante();
                    break;
                case 3:
                    System.out.print("Ingrese el estudiante a buscar");
                    String nombreBuscar = sc.nextLine();
                    gestionEstudiantes.buscarPorNombre(nombreBuscar);
                    break;
                case 4:
                    gestionEstudiantes.calcularPromedioGeneral();
                    break;
                case 5:
                    System.out.println("Saliste del menu.");
                    break;
                default:
                    System.out.println("ingresaste una opcion invalida, intenta denuevo");
            }
        }while(opcion!=5);
        
    }
    
}
