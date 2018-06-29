package Interfaz;

import java.util.List;

public interface Operaciones<Model> {
	public int create(Model m,int idcliente);
	  public int create(Model m);
	    public int update(Model m);
	    public int delete(int key);
	    public Model read(int key);
	    public List<Model> readAll();
	    
}
