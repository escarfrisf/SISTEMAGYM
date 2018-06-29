package Dto;

public class Cliente {

	private int idcliente;
    private String nombrec;
    private String apellidosc;
    private String dnic;
    private String gmail;
    private String telefono;
    private String estado;
    private int idmatricula;
    private int tipocliente_idtipocliente;
	public Cliente(String nombrec, String apellidosc, String dnic, String gmail, String telefono, String estado,
			int idmatricula, int tipocliente_idtipocliente) {
		super();
		this.nombrec = nombrec;
		this.apellidosc = apellidosc;
		this.dnic = dnic;
		this.gmail = gmail;
		this.telefono = telefono;
		this.estado = estado;
		this.idmatricula = idmatricula;
		this.tipocliente_idtipocliente = tipocliente_idtipocliente;
	}
	public Cliente(int idcliente, String nombrec, String apellidosc, String dnic, String gmail, String telefono,
			String estado, int idmatricula, int tipocliente_idtipocliente) {
		super();
		this.idcliente = idcliente;
		this.nombrec = nombrec;
		this.apellidosc = apellidosc;
		this.dnic = dnic;
		this.gmail = gmail;
		this.telefono = telefono;
		this.estado = estado;
		this.idmatricula = idmatricula;
		this.tipocliente_idtipocliente = tipocliente_idtipocliente;
	}
	public Cliente(String nombrec, String apellidosc, String dnic, String gmail, String telefono, int idmatricula,
			int tipocliente_idtipocliente) {
		super();
		this.nombrec = nombrec;
		this.apellidosc = apellidosc;
		this.dnic = dnic;
		this.gmail = gmail;
		this.telefono = telefono;
		this.idmatricula = idmatricula;
		this.tipocliente_idtipocliente = tipocliente_idtipocliente;
	}
	public Cliente() {
		super();
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombrec() {
		return nombrec;
	}
	public void setNombrec(String nombrec) {
		this.nombrec = nombrec;
	}
	public String getApellidosc() {
		return apellidosc;
	}
	public void setApellidosc(String apellidosc) {
		this.apellidosc = apellidosc;
	}
	public String getDnic() {
		return dnic;
	}
	public void setDnic(String dnic) {
		this.dnic = dnic;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIdmatricula() {
		return idmatricula;
	}
	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}
	public int getTipocliente_idtipocliente() {
		return tipocliente_idtipocliente;
	}
	public void setTipocliente_idtipocliente(int tipocliente_idtipocliente) {
		this.tipocliente_idtipocliente = tipocliente_idtipocliente;
	}

    
    
	
	
    
}