package Parcial;

public class GestionEstudiante {
    
    private Estudiante[] estudiantes;
    private int cantidadActual;
    private int capacidadMax;
    
    public GestionEstudiante(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.estudiantes = new Estudiante[capacidadMax];
        this.cantidadActual = 0;
    }
    
    public void agregarEstudiante(String nombre, int edad, double promedio){
        if(cantidadActual<capacidadMax){
            estudiantes[cantidadActual]=new Estudiante(nombre, edad, promedio);
            cantidadActual= cantidadActual+1;
            System.out.println("el estudiante ha sido agregado");
        } else {
            System.out.println("Error Capacidad maxima alcanzada.");
        }
    }
    
    public void mostrarEstudiante(){
        if (cantidadActual==0){
            System.out.println("no se ha registrado ningun estudiante");
            return;
        }
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println(estudiantes[i]);
        }
    }
    
    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(estudiantes[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("no se encontro el estudiante");
        }
    }
    
    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("no hay estudiantes que se hayan registrado");
            return;
        }
        double suma = 0;
        for (int i = 0; i < cantidadActual; i++) {
            suma += estudiantes[i].getPromedio();
        }
        double promedioGeneral = suma / cantidadActual;
        System.out.println("el promedio general de los estudiantes es: " + promedioGeneral);
    }
}
