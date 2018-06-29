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
import Dto.Servicios;

import Interfaz.Operaciones;

public class ServiciosDao implements Operaciones<Servicios> {

	private Connection cx;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQLcreate = "INSERT  INTO cliente(tipoc,apellidosc,dnic,telefono,gmail,tipocliente_idtipocliente,matricula_idmatricula) values(?,?,?,?,?,?,?)";
	private String SQLupdate = "update cliente set nombrec=? ,apellidosc=?, dnic=? ,gmail=?, telefono=? ,estado=? where idcliente=?";
	private String SQLdelete = "DELETE FROM cliente WHERE idcliente=?";
	private String SQLREADALL = "select * from servicios";
	private String SQLREADALLUNIC = "select * from servicios where tiposervicio = 1;";
	private String SQLREAD = "select idcliente,nombrec,apellidosc,dnic,telefono,estado,tipocliente_idtipocliente,matricula_idmatricula FROM cliente where idcliente=?";

	@Override
	public int create(Servicios m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Servicios m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Servicios read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Servicios> readAll() {
		// TODO Auto-generated method stub
		List<Servicios> lista = new ArrayList<Servicios>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQLREADALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Servicios ob = new Servicios();
				ob.setIdservicios(rs.getInt("IDSERVICIOS"));
				ob.setNombres(rs.getString("NOMBRES"));
				ob.setTiempoS(rs.getString("TIEMPOS"));
				ob.setCosto(rs.getString("COSTO"));
				ob.setBeneficiosauna(rs.getString("BENEFICIOSAUNA"));
				ob.setEstadoS(rs.getString("ESTADOS"));

				lista.add(ob);
			}

		} catch (SQLException ex) {
			Logger.getLogger(ServiciosDao.class.getName()).log(Level.SEVERE, null, ex);
		}

		return lista;
	}
	
	public List<Servicios> readAllUnic() {
		// TODO Auto-generated method stub
		List<Servicios> lista = new ArrayList<Servicios>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQLREADALLUNIC);
			rs = ps.executeQuery();
			while (rs.next()) {
				Servicios ob = new Servicios();
				ob.setIdservicios(rs.getInt("IDSERVICIOS"));
				ob.setNombres(rs.getString("NOMBRES"));
				ob.setTiempoS(rs.getString("TIEMPOS"));
				ob.setCosto(rs.getString("COSTO"));
				ob.setBeneficiosauna(rs.getString("BENEFICIOSAUNA"));
				ob.setEstadoS(rs.getString("ESTADOS"));

				lista.add(ob);
			}

		} catch (SQLException ex) {
			Logger.getLogger(ServiciosDao.class.getName()).log(Level.SEVERE, null, ex);
		}

		return lista;
	}

	@Override
	public int create(Servicios m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
