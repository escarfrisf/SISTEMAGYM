package Dto;

public class Asistente {


	private int idasistente;
    private String nombreA;
    private String apellidosA;
    private String dniT;
	public Asistente(String nombreA, String apellidosA, String dniT) {
		super();
		this.nombreA = nombreA;
		this.apellidosA = apellidosA;
		this.dniT = dniT;
	}
	public Asistente(int idasistente, String nombreA, String apellidosA, String dniT) {
		super();
		this.idasistente = idasistente;
		this.nombreA = nombreA;
		this.apellidosA = apellidosA;
		this.dniT = dniT;
	}
	public Asistente() {
		super();
	}
	public int getIdasistente() {
		return idasistente;
	}
	public void setIdasistente(int idasistente) {
		this.idasistente = idasistente;
	}
	public String getNombreA() {
		return nombreA;
	}
	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}
	public String getApellidosA() {
		return apellidosA;
	}
	public void setApellidosA(String apellidosA) {
		this.apellidosA = apellidosA;
	}
	public String getDniT() {
		return dniT;
	}
	public void setDniT(String dniT) {
		this.dniT = dniT;
	}

    
    
    
}
