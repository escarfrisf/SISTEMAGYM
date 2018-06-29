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

import Dto.FichaMed;
import Interfaz.Operaciones;

public class FichaMedDao implements Operaciones<FichaMed> {
	 private Connection cx;
     private PreparedStatement ps;
     private ResultSet rs;
     private String SQLcreate = "INSERT INTO fichamedica(discapacidadFisica,enfermedadActual,peso,talla,masacorporal,cliente_idcliente) values(?,?,?,?,?,?)";
     private String SQLupdate = "update fichamedica set discapacidadFisica=? ,enfermedadActual=?, peso=? ,talla, masacorporal=? ,cliente_idcliente=? where idfichamedica=?";
     private String SQLdelete = "DELETE FROM fichamedica WHERE idfichamedica=?";
     private String SQLREADALL = "select idfichamedica,discapacidadFisica,enfermedadActual,peso,talla,masacorporal,cliente_idcliente FROM cliente";
     private String SQLREAD= "select idfichamedica,discapacidadFisica,enfermedadActual,peso,talla,masacorporal,cliente_idcliente FROM cliente where idcliente=?";
    
     
	@Override
	public int create(FichaMed m) {
		// TODO Auto-generated method stub
		
		  int x = 0;
	        cx = Conexion.getConexion();
	        try {
	            ps = cx.prepareStatement(SQLcreate);
	            ps.setString(1, m.getDiscapacidadFisica());
	            ps.setString(2, m.getEnfermedadActual());
	            ps.setString(3, m.getPeso());
	            ps.setString(4, m.getTalla());
	            ps.setString(5, m.getMasaCorporal());
	            ps.setInt(6, m.getCliente_idcliente());
	        

	            x = ps.executeUpdate();	

	        } catch (SQLException e) {
	        	System.out.println("Error: " + e);}
	        return x;
	}

	@Override
	public int update(FichaMed m) {
		// TODO Auto-generated method stub
				 int x = 0;
			        cx = Conexion.getConexion();
			        try {
			            ps = cx.prepareStatement(SQLupdate);
			            ps.setInt(1,m.getIdfichamedica());
			            ps.setString(2, m.getDiscapacidadFisica());
			            ps.setString(2, m.getEnfermedadActual());
			            ps.setString(3, m.getPeso());
			            ps.setString(4, m.getTalla());
			            ps.setString(5, m.getMasaCorporal());
			            ps.setInt(5, m.getCliente_idcliente());
			          
			            rs = ps.executeQuery();
			            while (rs.next()) {
			                x = 1;
			            }

			        } catch (SQLException ex) {
			            Logger.getLogger(FichaMedDao.class.getName()).log(Level.SEVERE, null, ex);
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
			            Logger.getLogger(FichaMedDao.class.getName()).log(Level.SEVERE, null, ex);
			        }
			        return x;
			
			}

	@Override
	public FichaMed read(int key) {
		// TODO Auto-generated method stub
				 FichaMed ob= new FichaMed();

		         cx = Conexion.getConexion();
		     try {
		         ps = cx.prepareStatement(SQLREAD);
		         ps.setInt(1, key);
		         rs = ps.executeQuery();
		         
		         
		         while (rs.next()) {
		         
		            ob.setIdfichamedica(rs.getInt("IDFICHAMEDICA"));
		             ob.setDiscapacidadFisica(rs.getString("DISCAPACIDADFISICA"));
		              ob.setEnfermedadActual(rs.getString("ENFERMEDADACTUAL"));
		              ob.setPeso(rs.getString("PESO"));
		              ob.setTalla(rs.getString("TALLA"));
		               ob.setMasaCorporal(rs.getString("MASACORPORAL"));                      
		                ob.setCliente_idcliente(rs.getInt("CLIENTE_IDCLIENTE"));
		               
		               
		         }

		     } catch (SQLException ex) {
		         Logger.getLogger(FichaMedDao.class.getName()).log(Level.SEVERE, null, ex);
		     }
		     
		     
		     return ob;
			}
	@Override
	public List<FichaMed> readAll() {
		// TODO Auto-generated method stub
		 List<FichaMed> lista= new ArrayList<FichaMed>();
        cx = Conexion.getConexion();
    try {
        ps = cx.prepareStatement(SQLREADALL);
        rs = ps.executeQuery();
        while (rs.next()) {
        	FichaMed ob= new FichaMed();
       	 ob.setIdfichamedica(rs.getInt("IDFICHAMEDICA"));
         ob.setDiscapacidadFisica(rs.getString("DISCAPACIDADFISICA"));
          ob.setEnfermedadActual(rs.getString("ENFERMEDADACTUAL"));
          ob.setPeso(rs.getString("PESO"));
          ob.setTalla(rs.getString("TALLA"));
           ob.setMasaCorporal(rs.getString("MASACORPORAL"));                      
            ob.setCliente_idcliente(rs.getInt("CLIENTE_IDCLIENTE"));
           
              
               lista.add(ob);
        }

    } catch (SQLException ex) {
        Logger.getLogger(FichaMedDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    return lista;
	}

	@Override
	public int create(FichaMed m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
