package com.curso.v7;

import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
	private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

    @Override
    public String toString() {
        return "Empleado[" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", sueldo=" + sueldo +
               ']';
    }
}
public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Herodion",17,20.98);
		Empleado e2 = new Empleado("Aristobulo",30,30.26);
		Empleado e3 = new Empleado("Urbano",25,18.16);
		Empleado e4 = new Empleado("Nereo",16,15.46);
		Empleado e5 = new Empleado("Epeneto",35,15.08);
		
		//List INMUTABLE
		List<Empleado> listaEmpleados = List.of(e1,e2,e3,e4,e5);
		
		//AVERIGUAR QUE OBJETO SE CREO
		//System.out.println(listaEmpleados.getClass().getName());
		//java.util.ImmutableCollections$ListN
		
		//List MUTABLE
		listaEmpleados = new ArrayList<>(listaEmpleados);
		listaEmpleados.remove(4);
		listaEmpleados.add(new Empleado("Andronico",35,15.08));
		
		for (Empleado e: listaEmpleados)
			System.out.println(e);
		
		
		//List INMUTABLE
		List<String> nombres = List.of(e1.getNombre(),
									   e2.getNombre(),
									   e3.getNombre(),
									   e4.getNombre(),
									   e5.getNombre());
		
		
		

	}
	
	static void show(List<Empleado> lista,Predicado pre) {
		for(Empleado e : lista) {
			boolean res = pre.probar(e); //EJECUCION DE LA LAMBDA
			System.out.println(e);
			System.out.println("Resultado: "+res);
		}
		
	}

}
