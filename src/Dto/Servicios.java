package Dto;

public class Servicios {

	  private int idservicios;
	  private String nombres;
	  private String tiempoS;
	  private String costo;
	  private String beneficiosauna;
	  private String estadoS;
	public Servicios(String nombres, String tiempoS, String costo, String beneficiosauna, String estadoS) {
		super();
		this.nombres = nombres;
		this.tiempoS = tiempoS;
		this.costo = costo;
		this.beneficiosauna = beneficiosauna;
		this.estadoS = estadoS;
	}
	public Servicios(int idservicios, String nombres, String tiempoS, String costo, String beneficiosauna,
			String estadoS) {
		super();
		this.idservicios = idservicios;
		this.nombres = nombres;
		this.tiempoS = tiempoS;
		this.costo = costo;
		this.beneficiosauna = beneficiosauna;
		this.estadoS = estadoS;
	}
	public Servicios() {
		super();
	}
	public int getIdservicios() {
		return idservicios;
	}
	public void setIdservicios(int idservicios) {
		this.idservicios = idservicios;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTiempoS() {
		return tiempoS;
	}
	public void setTiempoS(String tiempoS) {
		this.tiempoS = tiempoS;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public String getBeneficiosauna() {
		return beneficiosauna;
	}
	public void setBeneficiosauna(String beneficiosauna) {
		this.beneficiosauna = beneficiosauna;
	}
	public String getEstadoS() {
		return estadoS;
	}
	public void setEstadoS(String estadoS) {
		this.estadoS = estadoS;
	}
	 
	
	  
	
}
