package Herencia.Ejercicios;

public class Main {

    public static void main(String[] args) {
        Persona person1 = new Persona("Pepe", 22);
        Empleado empleado1 = new Empleado(person1.Nombre,person1.Edad,70000);
        empleado1.imprimir();
        System.out.println("-------Vamos a ajustar el sueldo a 100000--------");
        empleado1.cargarSueldo(100000);
        empleado1.imprimir();
    }
}
