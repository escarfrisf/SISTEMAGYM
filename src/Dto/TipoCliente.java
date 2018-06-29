package Dto;

public class TipoCliente {
  private int idtipocliente;
  private String estado;
  private String tipoc;
public TipoCliente(String estado, String tipoc) {
	super();
	this.estado = estado;
	this.tipoc = tipoc;
}
public TipoCliente(int idtipocliente, String estado, String tipoc) {
	super();
	this.idtipocliente = idtipocliente;
	this.estado = estado;
	this.tipoc = tipoc;
}
public TipoCliente() {
	super();
}
public int getIdtipocliente() {
	return idtipocliente;
}
public void setIdtipocliente(int idtipocliente) {
	this.idtipocliente = idtipocliente;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getTipoc() {
	return tipoc;
}
public void setTipoc(String tipoc) {
	this.tipoc = tipoc;
}

  
  
}
