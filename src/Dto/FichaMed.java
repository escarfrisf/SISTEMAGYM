package Dto;

public class FichaMed {
	
	
	private int idfichamedica; 
    private String discapacidadFisica;
    private String enfermedadActual;
    private String peso;
    private String talla;
    private String masaCorporal;
	private int cliente_idcliente;
	public FichaMed(String discapacidadFisica, String enfermedadActual, String peso, String talla, String masaCorporal,
			int cliente_idcliente) {
		super();
		this.discapacidadFisica = discapacidadFisica;
		this.enfermedadActual = enfermedadActual;
		this.peso = peso;
		this.talla = talla;
		this.masaCorporal = masaCorporal;
		this.cliente_idcliente = cliente_idcliente;
	}
	public FichaMed(int idfichamedica, String discapacidadFisica, String enfermedadActual, String peso, String talla,
			String masaCorporal, int cliente_idcliente) {
		super();
		this.idfichamedica = idfichamedica;
		this.discapacidadFisica = discapacidadFisica;
		this.enfermedadActual = enfermedadActual;
		this.peso = peso;
		this.talla = talla;
		this.masaCorporal = masaCorporal;
		this.cliente_idcliente = cliente_idcliente;
	}
	public FichaMed() {
		super();
	}
	public int getIdfichamedica() {
		return idfichamedica;
	}
	public void setIdfichamedica(int idfichamedica) {
		this.idfichamedica = idfichamedica;
	}
	public String getDiscapacidadFisica() {
		return discapacidadFisica;
	}
	public void setDiscapacidadFisica(String discapacidadFisica) {
		this.discapacidadFisica = discapacidadFisica;
	}
	public String getEnfermedadActual() {
		return enfermedadActual;
	}
	public void setEnfermedadActual(String enfermedadActual) {
		this.enfermedadActual = enfermedadActual;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getMasaCorporal() {
		return masaCorporal;
	}
	public void setMasaCorporal(String masaCorporal) {
		this.masaCorporal = masaCorporal;
	}
	public int getCliente_idcliente() {
		return cliente_idcliente;
	}
	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}
	
	
	
	
}