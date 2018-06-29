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
import Dto.Usuario;
import Interfaz.Operaciones;

public class UsuarioDao implements Operaciones<Usuario>{

	   private Connection cx;
	    private PreparedStatement ps;
	    private ResultSet rs;
	    private String SQLcreate = "INSERT  INTO usuario(idusuario,usuario,clave,idrol,asistente_idasistente)values(null,?,?,?,?,?)";
	     private String SQLupdate = "update usuario set clave=? where idusuario=?";
	     private String SQLdelete = "DELETE FROM usuario WHERE idusuario=?";
	     private String SQLREADALL = "select IDUSUARIO,USUARIO,CLAVE,IDROL,IDPERSONA,asistente_idasistente FROM USUARIO";
	      private String SQLREAD= "select IDUSUARIO,USUARIO,CLAVE,IDROL,IDPERSONA,asistente_idasistente FROM USUARIO where idusuario=?";
	    
	    
	@Override
	public int create(Usuario m) {
		// TODO Auto-generated method stub
		int x = 0;
        cx = Conexion.getConexion();
        try {
            ps = cx.prepareStatement(SQLcreate);
            ps.setString(1, m.getNombre_usuario());
            ps.setString(2, m.getClave());           
            ps.setString(3, m.getEstado());
            ps.setString(4, m.getIdRol());
            ps.setInt(5, m.getAsistente_idasistente());
            
            rs = ps.executeQuery();	
            while (rs.next()) {
                x = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
	}

	@Override
	public int update(Usuario m) {
		// TODO Auto-generated method stub
		int x = 0;
        cx = Conexion.getConexion();
        try {
            ps = cx.prepareStatement(SQLupdate);
            ps.setString(1, m.getIdUsuario());
            ps.setString(2, m.getClave());
           
            rs = ps.executeQuery();
            while (rs.next()) {
                x = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return x;
	}

	@Override
	public Usuario read(int key) {
		// TODO Auto-generated method stub
		 Usuario ob= new Usuario();

         cx = Conexion.getConexion();
     try {
         ps = cx.prepareStatement(SQLREAD);
         ps.setInt(1, key);
         rs = ps.executeQuery();
         
         
         while (rs.next()) {
         
            ob.setIdUsuario(rs.getString("IDUSUARIO"));
             ob.setNombre_usuario(rs.getString("USUARIO"));
              ob.setClave(rs.getString("CLAVE"));
              ob.setEstado(rs.getString("ESTADO"));
               ob.setIdRol(rs.getString("IDROL"));
        
                ob.setAsistente_idasistente(rs.getInt("IDASISTENTE_IDASISTENTE"));
                
         }

     } catch (SQLException ex) {
         Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     
     return ob;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		 List<Usuario> lista= new ArrayList<Usuario>();
         cx = Conexion.getConexion();
     try {
         ps = cx.prepareStatement(SQLREADALL);
         rs = ps.executeQuery();
         while (rs.next()) {
            Usuario ob= new Usuario();
            ob.setIdUsuario(rs.getString("IDUSUARIO"));
             ob.setNombre_usuario(rs.getString("USUARIO"));
              ob.setClave(rs.getString("CLAVE"));
               ob.setEstado(rs.getString("ESTADO"));
                ob.setIdRol(rs.getString("IDROL"));
             
                 ob.setAsistente_idasistente(rs.getInt("IDASISTENTE_IDASISTENTE"));
                lista.add(ob);
         }

     } catch (SQLException ex) {
         Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     
     return lista;
	}
	 public int validar(String user, String clave) {
	        String url = "SELECT * from usuario where Nombre_usuario=? AND Clave=?";
	        int x = 0;
	        try {
	            cx = Conexion.getConexion();
	            ps = cx.prepareStatement(url);
	            ps.setString(1, user);
	            ps.setString(2, clave);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                x = 1;
	            }
	        } catch (SQLException e) {
	            System.out.println("error" + e);
	        }
	        return x;
	    }

	@Override
	public int create(Usuario m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}
}
