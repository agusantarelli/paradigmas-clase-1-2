package Herencia.Ejercicios;

public class Empleado extends Persona{
    private int Sueldo;

    Empleado(String nombre, int edad, int sueldo) {
        super(nombre, edad);
        this.Sueldo = sueldo;
    }

    public void cargarSueldo(int sueldo){
        this.Sueldo = sueldo;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Sueldo: " + this.Sueldo);
    }
}
