package mx.com.mvalencia.test;

public class Empleados extends Personas{
	private String departamento;
	private int idEmpleado;
	public Empleados(String name, int edad) {
		super(name, edad);
		// TODO Auto-generated constructor stub
	}
	
	public Empleados(String name, int edad, String departamento, int idEmpleado) {
		super(name,edad);
		this.departamento = departamento;
		this.idEmpleado = idEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public void informacion() {
		System.out.println("Nombre: "+ super.name + " edad: " + super.edad + " departamento: " + departamento);
	}
}
