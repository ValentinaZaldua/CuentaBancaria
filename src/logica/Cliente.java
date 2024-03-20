package logica;

import java.util.HashMap;

public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private HashMap<Integer, Cuenta> cuentas;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public HashMap<Integer, Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(HashMap<Integer, Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public Cliente(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = new HashMap<Integer, Cuenta>();
	}
	
	@Override
	public String toString() {
		return this.id + "\t" + this.nombre + "\t" + this.apellido;
	}
	
	
	
}
