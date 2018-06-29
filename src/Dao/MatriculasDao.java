package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Config.Conexion;
import Dto.Cliente;
import Dto.Matricula;
import Dto.Usuario;
import Interfaz.Operaciones;

public class MatriculasDao implements Operaciones<Matricula> {

	private Connection cx;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQLcreate = "INSERT  INTO matricula(fechaInicio,fechaFin,tipodepago,servicios_idservicios) values(?,?,?,?)";
	private String SQLupdate = "update cliente set nombrec=? ,apellidosc=?, dnic=? ,gmail=?, telefono=? ,estado=? where idcliente=?";
	private String SQLdelete = "DELETE FROM cliente WHERE idcliente=?";
	private String SQLREADALL = "select idcliente,nombrec,apellidosc,dnic,gmail,telefono,estado,idmatricula,tipocliente_idtipocliente FROM cliente";
	private String SQLREAD = "select idcliente,nombrec,apellidosc,dnic,telefono,estado,tipocliente_idtipocliente,matricula_idmatricula FROM cliente where idcliente=?";

	@Override
	public int create(Matricula m, int idcliente) {
		// TODO Auto-generated method stub
		int id = 0;
		int x = 0;
		cx = Conexion.getConexion();
		try {
			ps = cx.prepareStatement(SQLcreate);
			ps.setString(1, m.getFechaInicio());
			ps.setString(2, m.getFechaFin());
			ps.setString(3, m.getTipodepago());
			ps.setInt(4, m.getServicios_idservicios());

			// x = ps.executeUpdate();

			x = ps.executeUpdate();
			System.out.println("idmatricula?: " + getId());
			Cliente cliente = new Cliente();
			cliente.setIdcliente(idcliente);
			cliente.setIdmatricula(getId());
			update(cliente);
			// rs=ps.executeQuery();

		} catch (SQLException e) {
			System.out.println("Error: " + e);
		}
		return x;
	}
	public int update(Cliente cliente) {
		// TODO Auto-generated method stub
		int x = 0;
        cx = Conexion.getConexion();
        try {
            ps = cx.prepareStatement("update cliente set idmatricula=? where idcliente=?");
         
            ps.setInt(1, cliente.getIdmatricula());
            
            ps.setInt(2, cliente.getIdcliente());
           
            int i = ps.executeUpdate();
           x=i;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    
	}
	public int getId() {
//		// TODO Auto-generated method stub
				 int ultimo= 0;
		         
		     try {
		    	 cx = Conexion.getConexion();
		         ps = cx.prepareStatement("select max(idmatricula) as idmatricula from matricula");
		         rs = ps.executeQuery();
		         while (rs.next()) {
		        	 ultimo = rs.getInt("idmatricula");
		         }

		     } catch (SQLException ex) {
		         Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		     }
		     
		     
		     return ultimo;
			}

	@Override
	public int create(Matricula m) {
		// TODO Auto-generated method stub
		int id = 0;
		int x = 0;
		cx = Conexion.getConexion();
		try {
			ps = cx.prepareStatement(SQLcreate);
			ps.setString(1, m.getFechaInicio());
			ps.setString(2, m.getFechaFin());
			ps.setString(3, m.getTipodepago());
			ps.setInt(4, m.getServicios_idservicios());

			// x = ps.executeUpdate();

			x = ps.executeUpdate();
			// rs=ps.executeQuery();

		} catch (SQLException e) {
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public int update(Matricula m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Matricula read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
