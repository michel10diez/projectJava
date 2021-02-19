
import java.util.*;

import mx.com.mvalencia.test.Clientes;

public class MyClass {
	public static void main(String args[]) {
		Clientes avansys = new Clientes("Michel",30,1,new Date());
		HashMap<Clientes, String> mapaClientes = new HashMap<Clientes,String>();
		HashMap<Clientes, Date> mapaClientes2 = new HashMap<Clientes,Date>();
		
		mapaClientes.put(avansys, avansys.getName());
		mapaClientes2.put(avansys, avansys.getFechaRegistro());
		
		Collection<Date> cliente = mapaClientes2.values();
		System.out.println(cliente);
		
	}
}
