package mx.com.mvalencia.test;

import java.util.Date;

public class Clientes extends Personas {
	private int idCliente;
	private Date fechaRegistro = new Date();
	public Clientes(String name, int edad) {
		super(name, edad);
		// TODO Auto-generated constructor stub
	}
	
	public Clientes(String name, int edad, int idCliente, Date fechaRegistro) {
		super(name,edad);
		this.idCliente = idCliente;
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
	
}
