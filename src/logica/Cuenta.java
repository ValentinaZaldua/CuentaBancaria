package logica;

public class Cuenta {
	private int numero;
	private int saldo;
	private String tipo;
	private Cliente cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cuenta(int numero, int saldo, String tipo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
	public void consignar(int valor) {
		this.saldo += valor;
	}
	
	public void retirar(int valor) throws Exception {
		if(valor <= this.saldo) {
			this.saldo -= valor;			
		}else {
			throw new Exception("Saldo insuficiente");
		}
	}
	
	public void transferir(Cuenta cuentaDestino, int valor) throws Exception{
		this.retirar(valor);
		cuentaDestino.consignar(valor);
	}
	
	@Override
	public String toString() {
		return this.numero + "\t" + this.saldo + "\t" + this.tipo + "\t" + this.cliente;
	}
	
}
