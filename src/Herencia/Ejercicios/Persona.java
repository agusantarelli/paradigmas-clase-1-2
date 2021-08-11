package Herencia.Ejercicios;

public class Persona {
    protected String Nombre;
    protected int Edad;

    Persona(String nombre, int edad){
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public void setData(String n, int e){
        this.Nombre = n;
        this.Edad = e;
    }

    public void imprimir(){
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Edad: " + this.Edad);
    }
}
