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
import Dto.Rol;
import Interfaz.Operaciones;

public class RolDao implements Operaciones<Rol>{
	 private Connection cx;
	    private PreparedStatement ps;
	    private ResultSet rs;
	    private String SQLcreate = "INSERT  INTO Rol(idrol,nombre)values(null,?)";
	     private String SQLupdate = "update rol set nombre=? where idrol=?";
	     private String SQLdelete = "DELETE FROM rol WHERE idrol=?";
	     private String SQLREADALL = "SELECT idrol,nombre FROM rol";
	      private String SQLREAD= " SELECT idrol,nombre FROM rol WHERE idrol=?";
		@Override
		public int create(Rol m) {
			// TODO Auto-generated method stub
			int x = 0;
	        cx = Conexion.getConexion();
	        try {
	            ps = cx.prepareStatement(SQLcreate);
	            ps.setString(1, m.getNombre());
	            rs = ps.executeQuery();	
	            while (rs.next()) {
	                x = 1;
	            }

	        } catch (SQLException ex) {
	            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return x;
		}
		@Override
		public int update(Rol m) {
			// TODO Auto-generated method stub
			int x = 0;
	        cx = Conexion.getConexion();
	        try {
	            ps = cx.prepareStatement(SQLupdate);
	            ps.setString(1, m.getIdrol());
	            ps.setString(2, m.getNombre());
	           
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                x = 1;
	            }

	        } catch (SQLException ex) {
	            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
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
		            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
		        }
		        return x;
		}
		@Override
		public Rol read(int key) {
			// TODO Auto-generated method stub
			 Rol ob= new Rol();

	            cx = Conexion.getConexion();
	        try {
	            ps = cx.prepareStatement(SQLREAD);
	            ps.setInt(1, key);
	            rs = ps.executeQuery();
	            
	            
	            while (rs.next()) {
	            
	               ob.setIdrol(rs.getString("IDROL"));
	                ob.setNombre(rs.getString("NOMBRE"));
	                
	                   
	            }

	        } catch (SQLException ex) {
	            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        
	        return ob;
	        
		}
		@Override
		public List<Rol> readAll() {
			// TODO Auto-generated method stub
			 List<Rol> lista= new ArrayList<Rol>();
	            cx = Conexion.getConexion();
	        try {
	            ps = cx.prepareStatement(SQLREADALL);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	               Rol ob= new Rol();
	               ob.setIdrol(rs.getString("IDROL"));
	                ob.setNombre(rs.getString("NOMBRE"));
	                
	                   lista.add(ob);
	            }

	        } catch (SQLException ex) {
	            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        
	        return lista;
		}
		@Override
		public int create(Rol m, int idcliente) {
			// TODO Auto-generated method stub
			return 0;
		}}
	