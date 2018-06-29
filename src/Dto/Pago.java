package Dto;

public class Pago {
	private int idpago;
    private String montototal ;
    private String estadoP;
    private int cliente_idcliente;
    private String fecha;
	public Pago(String montototal, String estadoP, int cliente_idcliente, String fecha) {
		super();
		this.montototal = montototal;
		this.estadoP = estadoP;
		this.cliente_idcliente = cliente_idcliente;
		this.fecha = fecha;
	}
	public Pago(int idpago, String montototal, String estadoP, int cliente_idcliente, String fecha) {
		super();
		this.idpago = idpago;
		this.montototal = montototal;
		this.estadoP = estadoP;
		this.cliente_idcliente = cliente_idcliente;
		this.fecha = fecha;
	}
	public Pago() {
		super();
	}
	public Pago(int idpago, String montototal, int cliente_idcliente, String fecha) {
		super();
		this.idpago = idpago;
		this.montototal = montototal;
		this.cliente_idcliente = cliente_idcliente;
		this.fecha = fecha;
	}
	public int getIdpago() {
		return idpago;
	}
	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}
	public String getMontototal() {
		return montototal;
	}
	public void setMontototal(String montototal) {
		this.montototal = montototal;
	}
	public String getEstadoP() {
		return estadoP;
	}
	public void setEstadoP(String estadoP) {
		this.estadoP = estadoP;
	}
	public int getCliente_idcliente() {
		return cliente_idcliente;
	}
	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

    
}
