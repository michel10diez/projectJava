

import mx.com.mvalencia.test.Empleados;

public class MyClass {
	public static void main(String args[]) {
		Empleados Michel = new Empleados("Michel",30,"Valencia","Hernández","Sistemas",1);
		Michel.obtenerNombreCompleto(Michel.getName(), Michel.getApellidoPaterno(), Michel.getApellidoMaterno());
		System.out.println("Tu sueldo es de: " + Michel.calcularNomina(300));
	}
}
