package Dto;

public class Rol {
	private String idrol;
    private String nombre;

	public Rol(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Rol(String idrol, String nombre) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
	}
	public Rol() {
		super();
	}
	public String getIdrol() {
		return idrol;
	}
	public void setIdrol(String idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}
