package com.company;
//GETTERS Y SETTERS SIRVEN PARA ENCAPSULAMIENTO
class Rana
{
    private String nombre; // this.nombre APUNTA A ESTE
    private int edad;

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNombre(String nombre) // si  en ves de poner String nomnbre ponemos String nuevoNombr3
    {
        this.nombre = nombre;  // aquí se coloca como nombre = nuevoNombre
    }

    public void setEdad(int edad)
    {
        this.edad = edad;  //THIS APUNTA A LA EDAD DE HASTA ARRIBA, QUE ES UNA INSTANCIA
    }
}

public class Main
{

    public static void main(String[] args)
    {
	Rana rana1 = new Rana();
	rana1.setNombre("Bertie"); // Transformó la línea comentada rana1.nombre = "Bertie"; a la línea rana1.setnombre("Bertie");
	rana1.setEdad(12);  //Lo mismo sucedió con esta

        System.out.println("El nombre de la rana es " + rana1.getNombre() + ", su edad es " + rana1.getEdad());
    }
}
