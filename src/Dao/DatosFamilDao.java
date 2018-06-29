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

import Dto.DatosFamil;
import Interfaz.Operaciones;

public class DatosFamilDao implements Operaciones<DatosFamil>{

	 private Connection cx;
     private PreparedStatement ps;
     private ResultSet rs;
     private String SQLcreate = "INSERT  INTO datosfamiliares(nombrePadre,apellidoPadre,telefonop, nombreMadre,apellidoMadre,telefonom,cliente_idcliente) values(?,?,?,?,?,?,?);";
     private String SQLupdate = "update datosfamiliares set nombrePadre=? ,apellidosPadre=?, telefonop=? ,nombreMadre=?, apellidosMadre=? ,telefonom=? where iddatosfamiliares=?";
     private String SQLdelete = "DELETE FROM datosfamiliares WHERE iddatosfamiliares=?";
     private String SQLREADALL = "select datosfamiliares,nombrePadre,apellidoPadre,telefonop, nombreMadre,apellidoMadre,telefonom,cliente_idcliente FROM iddatosfamiliares";
     private String SQLREAD= "select datosfamiliares,nombrePadre,apellidoPadre,telefonop, nombreMadre,apellidoMadre,telefonom,cliente_idcliente FROM datosfamiliares where iddatosfamiliares=?";
    
	
	@Override
	public int create(DatosFamil m) {

		  int x = 0;
	        cx = Conexion.getConexion();
	        try {
	            ps = cx.prepareStatement(SQLcreate);
	            ps.setString(1, m.getNombrePadre());
	            ps.setString(2, m.getApellidoPadre());
	            ps.setString(3, m.getTelefonop());	           
	            ps.setString(4, m.getNombreMadre());
	            ps.setString(5, m.getApellidoMadre());
	            ps.setString(6, m.getTelefonom());
	            ps.setInt(7, m.getCliente_idcliente());
	         
	           
	        
	            x = ps.executeUpdate();	

	        } catch (SQLException e) {
	        	System.out.println("Error: " + e);}
	        return x;
	}
	

	@Override
	public int update(DatosFamil m) {
		// TODO Auto-generated method stub
				 int x = 0;
			        cx = Conexion.getConexion();
			        try {
			            ps = cx.prepareStatement(SQLupdate);
			            ps.setInt(1,m.getIddatosfamiliares());
			            ps.setString(1, m.getNombrePadre());
			            ps.setString(2, m.getApellidoPadre());
			            ps.setString(3, m.getTelefonop());	           
			            ps.setString(4, m.getNombreMadre());
			            ps.setString(5, m.getApellidoMadre());
			            ps.setString(6, m.getTelefonom());
			            ps.setInt(7, m.getCliente_idcliente());
			          
			            rs = ps.executeQuery();
			            while (rs.next()) {
			                x = 1;
			            }

			        } catch (SQLException ex) {
			            Logger.getLogger(DatosFamilDao.class.getName()).log(Level.SEVERE, null, ex);
			        }
			        return x;
			}
	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
				 int x = 0;
			        cx = Conexion.getConexion();
			        try {
			            ps = cx.prepareStatement(SQLdelete);
			            ps.setInt(1, key);
			            rs = ps.executeQuery();
			            while (rs.next()) {
			                x = 1;
			            }

			        } catch (SQLException ex) {
			            Logger.getLogger(DatosFamilDao.class.getName()).log(Level.SEVERE, null, ex);
			        }
			        return x;
			
			}

	@Override
	public DatosFamil read(int key) {
		// TODO Auto-generated method stub
		DatosFamil ob= new DatosFamil();

		         cx = Conexion.getConexion();
		     try {
		         ps = cx.prepareStatement(SQLREAD);
		         ps.setInt(1, key);
		         rs = ps.executeQuery();
		         
		         
		         while (rs.next()) {
		        	 ob.setIddatosfamiliares(rs.getInt("IDDATOSFAMILIARES"));
		             ob.setNombrePadre(rs.getString("NOMBREPADRE"));
		              ob.setApellidoPadre(rs.getString("APELLIDOSPADRE"));
		              ob.setTelefonop(rs.getString("TELEFONOP"));
		              ob.setNombreMadre(rs.getString("NOMBREMADRE"));
		              ob.setApellidoMadre(rs.getString("APELLIDOSMADRE"));
		              ob.setTelefonom(rs.getString("TELEFONOM"));
		            
		         }

		     } catch (SQLException ex) {
		         Logger.getLogger(DatosFamilDao.class.getName()).log(Level.SEVERE, null, ex);
		     }
		     
		     
		     return ob;
			}

	@Override
	public List<DatosFamil> readAll() {
		// TODO Auto-generated method stub
		 List<DatosFamil> lista= new ArrayList<DatosFamil>();
        cx = Conexion.getConexion();
    try {
        ps = cx.prepareStatement(SQLREADALL);
        rs = ps.executeQuery();
        while (rs.next()) {
        	DatosFamil ob= new DatosFamil();
        	 ob.setIddatosfamiliares(rs.getInt("IDDATOSFAMILIARES"));
             ob.setNombrePadre(rs.getString("NOMBREPADRE"));
              ob.setApellidoPadre(rs.getString("APELLIDOSPADRE"));
              ob.setTelefonop(rs.getString("TELEFONOP"));
              ob.setNombreMadre(rs.getString("NOMBREMADRE"));
              ob.setApellidoMadre(rs.getString("APELLIDOSMADRE"));
              ob.setTelefonom(rs.getString("TELEFONOM"));
            
              
               lista.add(ob);
        }

    } catch (SQLException ex) {
        Logger.getLogger(DatosFamilDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    return lista;
	}


	@Override
	public int create(DatosFamil m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	

