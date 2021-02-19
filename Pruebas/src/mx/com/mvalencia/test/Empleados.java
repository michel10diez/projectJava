package mx.com.mvalencia.test;

import mx.com.mvalencia.usuario.empleado.EmpleadoReadView;

public class Empleados extends Personas implements EmpleadoReadView{
	private String apellidoPaterno;
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}



	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}



	public String getApellidoMaterno() {
		return apellidoMaterno;
	}



	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	private String apellidoMaterno;
	private String departamento;
	private int idEmpleado;
	public Empleados(String name, int edad) {
		super(name, edad);
		// TODO Auto-generated constructor stub
	}
	


	public Empleados(String name, int edad, String apellidoPaterno,
			String apellidoMaterno, String departamento,
			int idEmpleado) {
		super(name, edad);
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
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

	@Override
	public void obtenerNombreCompleto(String name, String apellidoPaterno, String apellidoMaterno) {
		// TODO Auto-generated method stub
		System.out.println(name + " " + apellidoPaterno + " " + apellidoMaterno );
		
	}
	
	public int calcularNomina(int sueldo) {
		sueldo = sueldo * 30;
		
		return sueldo;
		
	}
}
