package com.company;

class Machine
{
    private String name;
    private int code;

    public Machine()
    {
        System.out.println("Primer constructor");
        //name = "Arnie";
        //Puedes inicializar un constructor dentro de otro, para eso utilizas la palabra this() con paréntesis
        this("nhombre",1111); //Debe ser la prmer línea de código el constructor dentro de otro
    }
    public Machine(String name)// EL CONSTRUCTOR SE USA PARA INICIALIZAR VARIABLES DE INSTANCIA, pero cada constructor debe tener parámetros diferentes
    {
        this.name = name;//Puede ir desupues del system.out
        System.out.println("Segundo constructor");
    }
    public Machine(String name,int code)
    {
        this.name = name;
        this.code = code;
        System.out.println("Tercer constructor");
    }
}

public class Main
{

    public static void main(String[] args)
    {
	    Machine maquina1 = new Machine();
	    Machine maquina2 = new Machine("Bertie");
        Machine maquina3 = new Machine("Chalky", 13);
    }
}
