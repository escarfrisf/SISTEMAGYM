package Dto;

public class DatosFamil {

	
	
	private int iddatosfamiliares;
	private String nombrePadre;
	private String apellidoPadre;
	private String 	telefonop;
	private String nombreMadre;
	private String apellidoMadre;
	private String telefonom;
	private int cliente_idcliente;
	public DatosFamil(String nombrePadre, String apellidoPadre, String telefonop, String nombreMadre,
			String apellidoMadre, String telefonom, int cliente_idcliente) {
		super();
		this.nombrePadre = nombrePadre;
		this.apellidoPadre = apellidoPadre;
		this.telefonop = telefonop;
		this.nombreMadre = nombreMadre;
		this.apellidoMadre = apellidoMadre;
		this.telefonom = telefonom;
		this.cliente_idcliente = cliente_idcliente;
	}
	public DatosFamil(int iddatosfamiliares, String nombrePadre, String apellidoPadre, String telefonop,
			String nombreMadre, String apellidoMadre, String telefonom, int cliente_idcliente) {
		super();
		this.iddatosfamiliares = iddatosfamiliares;
		this.nombrePadre = nombrePadre;
		this.apellidoPadre = apellidoPadre;
		this.telefonop = telefonop;
		this.nombreMadre = nombreMadre;
		this.apellidoMadre = apellidoMadre;
		this.telefonom = telefonom;
		this.cliente_idcliente = cliente_idcliente;
	}
	public DatosFamil() {
		super();
	}
	public int getIddatosfamiliares() {
		return iddatosfamiliares;
	}
	public void setIddatosfamiliares(int iddatosfamiliares) {
		this.iddatosfamiliares = iddatosfamiliares;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getApellidoPadre() {
		return apellidoPadre;
	}
	public void setApellidoPadre(String apellidoPadre) {
		this.apellidoPadre = apellidoPadre;
	}
	public String getTelefonop() {
		return telefonop;
	}
	public void setTelefonop(String telefonop) {
		this.telefonop = telefonop;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getApellidoMadre() {
		return apellidoMadre;
	}
	public void setApellidoMadre(String apellidoMadre) {
		this.apellidoMadre = apellidoMadre;
	}
	public String getTelefonom() {
		return telefonom;
	}
	public void setTelefonom(String telefonom) {
		this.telefonom = telefonom;
	}
	public int getCliente_idcliente() {
		return cliente_idcliente;
	}
	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}
	
	
}