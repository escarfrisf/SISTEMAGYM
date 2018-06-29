package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Config.Conexion;

import Dto.TipoCliente;
import Interfaz.Operaciones;

public class TipoClienteDao implements Operaciones<TipoCliente> {

	 private Connection cx;
     private PreparedStatement ps;
     private ResultSet rs;
     private String SQLcreate = "INSERT  INTO cliente(tipoc,apellidosc,dnic,telefono,gmail,tipocliente_idtipocliente,matricula_idmatricula) values(?,?,?,?,?,?,?)";
     private String SQLupdate = "update cliente set nombrec=? ,apellidosc=?, dnic=? ,gmail=?, telefono=? ,estado=? where idcliente=?";
     private String SQLdelete = "DELETE FROM cliente WHERE idcliente=?";
     private String SQLREADALL = "select * from tipocliente";
     private String SQLREAD= "select idcliente,nombrec,apellidosc,dnic,telefono,estado,tipocliente_idtipocliente,matricula_idmatricula FROM cliente where idcliente=?";
    
	
	@Override
	public int create(TipoCliente m) {
		// TODO Auto-generated method stub
		
		 
	        return 0;
	
	}

	@Override
	public int update(TipoCliente m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoCliente read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoCliente> readAll() {
		// TODO Auto-generated method stub
		 List<TipoCliente> lista= new ArrayList<TipoCliente>();		         
    try {
   	 cx = Conexion.getConexion();
        ps = cx.prepareStatement(SQLREADALL);
        rs = ps.executeQuery();
        while (rs.next()) {
       	TipoCliente ob= new TipoCliente();
       	 ob.setIdtipocliente(rs.getInt("IDTIPOCLIENTE"));
         ob.setEstado(rs.getString("ESTADO"));
            ob.setTipoc(rs.getString("TIPOC"));
            
              
               lista.add(ob);
        }

    } catch (SQLException ex) {
        Logger.getLogger(TipoClienteDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    return lista;
	}

	@Override
	public int create(TipoCliente m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
