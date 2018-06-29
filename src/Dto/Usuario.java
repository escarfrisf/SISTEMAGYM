package Dto;

public class Usuario {
	private String idUsuario;
    private String Nombre_usuario;
    private String Clave;
    private String idRol;
    private String idEmpleado;
    private String estado;
	private int asistente_idasistente;
	public Usuario(String nombre_usuario, String clave, String idRol, String idEmpleado, String estado,
			int asistente_idasistente) {
		super();
		Nombre_usuario = nombre_usuario;
		Clave = clave;
		this.idRol = idRol;
		this.idEmpleado = idEmpleado;
		this.estado = estado;
		this.asistente_idasistente = asistente_idasistente;
	}
	public Usuario(String idUsuario, String nombre_usuario, String clave, String idRol, String idEmpleado,
			String estado, int asistente_idasistente) {
		super();
		this.idUsuario = idUsuario;
		Nombre_usuario = nombre_usuario;
		Clave = clave;
		this.idRol = idRol;
		this.idEmpleado = idEmpleado;
		this.estado = estado;
		this.asistente_idasistente = asistente_idasistente;
	}
	public Usuario() {
		super();
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre_usuario() {
		return Nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getAsistente_idasistente() {
		return asistente_idasistente;
	}
	public void setAsistente_idasistente(int asistente_idasistente) {
		this.asistente_idasistente = asistente_idasistente;
	}
	
	
    
    
}