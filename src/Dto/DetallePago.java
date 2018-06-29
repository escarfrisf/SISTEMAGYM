package Dto;

public class DetallePago {
	private int iddetallepago;
    private String pago ;
    private String fecha;
    private int pago_idpago;
    private int servicios_idservicios;
    private String descuento ;
    private String costo;
    private String costorestante;
	public DetallePago(String pago, String fecha, int pago_idpago, int servicios_idservicios, String descuento,
			String costo, String costorestante) {
		super();
		this.pago = pago;
		this.fecha = fecha;
		this.pago_idpago = pago_idpago;
		this.servicios_idservicios = servicios_idservicios;
		this.descuento = descuento;
		this.costo = costo;
		this.costorestante = costorestante;
	}
	public DetallePago(int iddetallepago, String pago, String fecha, int pago_idpago, int servicios_idservicios,
			String descuento, String costo, String costorestante) {
		super();
		this.iddetallepago = iddetallepago;
		this.pago = pago;
		this.fecha = fecha;
		this.pago_idpago = pago_idpago;
		this.servicios_idservicios = servicios_idservicios;
		this.descuento = descuento;
		this.costo = costo;
		this.costorestante = costorestante;
	}
	public DetallePago() {
		super();
	}
	public int getIddetallepago() {
		return iddetallepago;
	}
	public void setIddetallepago(int iddetallepago) {
		this.iddetallepago = iddetallepago;
	}
	public String getPago() {
		return pago;
	}
	public void setPago(String pago) {
		this.pago = pago;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getPago_idpago() {
		return pago_idpago;
	}
	public void setPago_idpago(int pago_idpago) {
		this.pago_idpago = pago_idpago;
	}
	public int getServicios_idservicios() {
		return servicios_idservicios;
	}
	public void setServicios_idservicios(int servicios_idservicios) {
		this.servicios_idservicios = servicios_idservicios;
	}
	public String getDescuento(	) {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public String getCostorestante() {
		return costorestante;
	}
	public void setCostorestante(String costorestante) {
		this.costorestante = costorestante;
	}
   
   

}
