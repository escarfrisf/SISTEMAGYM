package Dto;

public class Matricula {
	private int idmatricula;
    private String fechaInicio ;
    private String fechaFin;
    private String tipodepago;
    private int servicios_idservicios;
	
    public Matricula(String fechaInicio, String fechaFin, String tipodepago, int servicios_idservicios) {

		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipodepago = tipodepago;
		this.servicios_idservicios = servicios_idservicios;
	}
	public Matricula(int idmatricula, String fechaInicio, String fechaFin, String tipodepago,
			int servicios_idservicios) {
		super();
		this.idmatricula = idmatricula;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipodepago = tipodepago;
		this.servicios_idservicios = servicios_idservicios;
	}
	public Matricula() {
		super();
	}
	public int getIdmatricula() {
		return idmatricula;
	}
	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getTipodepago() {
		return tipodepago;
	}
	public void setTipodepago(String tipodepago) {
		this.tipodepago = tipodepago;
	}
	public int getServicios_idservicios() {
		return servicios_idservicios;
	}
	public void setServicios_idservicios(int servicios_idservicios) {
		this.servicios_idservicios = servicios_idservicios;
	}
    
    
    
	
	
}
