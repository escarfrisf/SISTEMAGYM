package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;

import Config.Conexion;
import Dto.Cliente;

import Interfaz.Operaciones;

public class ClienteDao implements Operaciones<Cliente> {
	private Connection cx;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQLcreate = "INSERT  INTO cliente(nombrec,apellidosc,dnic,telefono,gmail,idmatricula,tipocliente_idtipocliente) values(?,?,?,?,?,?,?)";
	private String SQLupdate = "update cliente set nombrec=? ,apellidosc=?, dnic=? ,gmail=?, telefono=? ,estado=? where idcliente=?";
	private String SQLdelete = "DELETE FROM cliente WHERE idcliente=?";
	private String SQLREADALL = "select idcliente,nombrec,apellidosc,dnic,gmail,telefono,estado,idmatricula,tipocliente_idtipocliente FROM cliente";
	private String SQLREAD = "select idcliente,nombrec,apellidosc,dnic,telefono,estado,tipocliente_idtipocliente,matricula_idmatricula FROM cliente where idcliente=?";
	private String SQLCS = "select \r\n" + 
			"cl.idcliente,\r\n" + 
			"cl.nombrec,\r\n" + 
			"cl.apellidosc,\r\n" + 
			"cl.dnic,\r\n" + 
			"cl.gmail,\r\n" + 
			"cl.telefono,\r\n" + 
			"cl.estado,\r\n" + 
			"cl.idmatricula,\r\n" + 
			"cl.tipocliente_idtipocliente,\r\n" + 
			"se.idservicios as idservicio,\r\n" + 
			"se.nombres as servicio_nombre,\r\n" + 
			"se.costo servicio_costo,\r\n" + 
			"\"0\" as servicio_descuento\r\n" + 
			"FROM cliente cl , matricula ma, servicios se \r\n" + 
			"where cl.idmatricula = ma.idmatricula and se.idservicios = ma.servicios_idservicios\r\n" + 
			"\r\n" + 
			"union\r\n" + 
			"\r\n" + 
			"select \r\n" + 
			"idcliente,\r\n" + 
			"nombrec,\r\n" + 
			"apellidosc,\r\n" + 
			"dnic,\r\n" + 
			"gmail,\r\n" + 
			"telefono,\r\n" + 
			"estado,\r\n" + 
			"idmatricula,\r\n" + 
			"tipocliente_idtipocliente,\r\n" + 
			"\"0\" as idservicio,\r\n" + 
			"\"0\" as servicio_nombre,\r\n" + 
			"\"0\" servicio_costo,\r\n" + 
			"\"0\" as servicio_descuento\r\n" + 
			"FROM cliente where idmatricula = 0 ;";

	private String SQLID = "SELECT LAST_INSERT_ID() as idcliente";
	private String SQLID1 = "SELECT MAX(idcliente) as idcliente from cliente";

	@Override
	public int create(Cliente m) {
		// TODO Auto-generated method stub

		int x = 0;
		cx = Conexion.getConexion();
		try {
			ps = cx.prepareStatement(SQLcreate);
			ps.setString(1, m.getNombrec());
			ps.setString(2, m.getApellidosc());
			ps.setString(3, m.getDnic());
			ps.setString(4, m.getTelefono());
			ps.setString(5, m.getGmail());
			ps.setInt(6, m.getIdmatricula());
			ps.setInt(7, m.getTipocliente_idtipocliente());

			x = ps.executeUpdate();
			

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return x;
	}

	@Override
	public int update(Cliente m) {
		// TODO Auto-generated method stub
		int x = 0;
		cx = Conexion.getConexion();
		try {
			ps = cx.prepareStatement(SQLupdate);
			ps.setInt(1, m.getIdcliente());
			ps.setString(2, m.getNombrec());
			ps.setString(3, m.getApellidosc());
			ps.setString(5, m.getDnic());
			ps.setString(6, m.getTelefono());
			ps.setString(4, m.getGmail());
			ps.setString(5, m.getEstado());
			ps.setInt(6, m.getIdmatricula());
			ps.setInt(7, m.getTipocliente_idtipocliente());

			rs = ps.executeQuery();
			while (rs.next()) {
				x = 1;
			}

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
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
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return x;

	}

	@Override
	public Cliente read(int key) {
		// TODO Auto-generated method stub
		Cliente ob = new Cliente();

		cx = Conexion.getConexion();
		try {
			ps = cx.prepareStatement(SQLREAD);
			ps.setInt(1, key);
			rs = ps.executeQuery();

			while (rs.next()) {

				ob.setIdcliente(rs.getInt("IDCLIENTE"));
				ob.setNombrec(rs.getString("NOMBREC"));
				ob.setApellidosc(rs.getString("APELLIDOSC"));
				ob.setDnic(rs.getString("DNIC"));
				ob.setTelefono(rs.getString("TELEFONO"));
				ob.setGmail(rs.getString("GMAIL"));
				ob.setEstado(rs.getString("ESTADO"));
				ob.setTipocliente_idtipocliente(rs.getInt("TIPOCLIENTE_IDTIPOCLIENTE"));
				ob.setIdmatricula(rs.getInt("IDMATRICULA"));

			}

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}

		return ob;

	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		List<Cliente> lista8 = new ArrayList<Cliente>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQLREADALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cliente oj = new Cliente();
				oj.setIdcliente(rs.getInt("IDCLIENTE"));
				oj.setNombrec(rs.getString("NOMBREC"));
				oj.setApellidosc(rs.getString("APELLIDOSC"));
				oj.setDnic(rs.getString("DNIC"));
				oj.setGmail(rs.getString("GMAIL"));
				oj.setTelefono(rs.getString("TELEFONO"));
				oj.setEstado(rs.getString("ESTADO"));

				// oj.setIdmatricula(rs.getInt("IDMATRICULA"));
				// oj.setTipocliente_idtipocliente(rs.getInt("TIPOCLIENTE_IDTIPOCLIENTE"));

				lista8.add(oj);
			}

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
			try {
				cx.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Gson g = new Gson();
		System.out.println("desde el daoo" + g.toJson(lista8));

		return lista8;
	}
	
	public List<Map<String, Object>> readAllWithServices() {
		
		
		 ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQLCS);
			rs = ps.executeQuery();
			while (rs.next()) {
				Map<String,Object> clientsServices = new HashMap<>();
				clientsServices.put("idcliente",rs.getInt("idcliente"));
				clientsServices.put("nombrec",rs.getString("nombrec"));
				clientsServices.put("apellidosc",rs.getString("apellidosc"));
				clientsServices.put("dnic",rs.getString("dnic"));
				clientsServices.put("gmail",rs.getString("gmail"));
				clientsServices.put("telefono",rs.getString("telefono"));
				clientsServices.put("estado",rs.getString("estado"));
				clientsServices.put("idmatricula",rs.getInt("idmatricula"));
				clientsServices.put("tipocliente_idtipocliente",rs.getInt("tipocliente_idtipocliente"));
				clientsServices.put("idservicio",rs.getInt("idservicio"));
				clientsServices.put("servicio_nombre",rs.getString("servicio_nombre"));
				clientsServices.put("servicio_costo",rs.getDouble("servicio_costo"));
				clientsServices.put("servicio_descuento",rs.getDouble("servicio_descuento"));	
				list.add(clientsServices);
				System.out.println("items: "+ rs.getString("nombrec"));
			}

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
			try {
				cx.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return list;
	}
	
	

	public String id() {
		// // TODO Auto-generated method stub
		String ultimo = new String();

		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQLID1);
			rs = ps.executeQuery();
			while (rs.next()) {
				ultimo = rs.getString("idcliente");
			}

		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}

		return ultimo;
	}

	@Override
	public int create(Cliente m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
