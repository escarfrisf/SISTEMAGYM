package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Config.Conexion;
import Dto.Pago;
import Interfaz.Operaciones;

public class PagoDao implements Operaciones<Pago> {

	private Connection cx;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public int create(Pago m, int idcliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Pago m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Pago m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pago read(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pago> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int realizarPago(int idclienteP, double monto, String estado, String fecha,

			int itemServ, double descuento, double costo, double restante, double pago,

			int itemServExtra, double costoServExtra) {

		int id = 0;
		int x = 0;
		cx = Conexion.getConexion();
		try {
			ps = cx.prepareStatement("INSERT  INTO pago(montototal,estadoP,cliente_idcliente,fecha) values(?,?,?,?)");
			ps.setString(1, monto + "");
			ps.setString(2, estado);
			ps.setInt(3, idclienteP);
			ps.setString(4, fecha);
			x = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error: " + e);
		}
		int idpago = getId();
		realizarPagoDetalle(itemServ, descuento, costo, restante, pago, fecha,idpago);
		realizarPagoDetalle(itemServExtra, 0, costoServExtra, 0, 0, fecha,idpago);
		return x;

	}

	public int realizarPagoDetalle(int itemServ, double descuento , double costo, double restante, double pago,
			String fecha,int idpgo) {

		int id = 0;
		int x = 0;
		cx = Conexion.getConexion();
		System.out.println("params getId(): " +idpgo);

		System.out.println("params realizarPagoDetalle: " + "-"+ itemServ+ "-"+  descuento+ "-"+  costo+ "-"+  restante+ "-"+  pago+ "-"+  fecha);

		try {
			ps = cx.prepareStatement("INSERT  INTO detallepago (pago,fecha,pago_idpago,servicios_idservicios,descuento,costo,costorestante) values(?,?,?,?,?,?,?);");
			ps.setString(1, pago + "");
			ps.setString(2, fecha);
			ps.setInt(3,idpgo);
			ps.setInt(4, itemServ);
			ps.setString(5, descuento + "");
			ps.setString(6, costo + "");
			ps.setString(7, restante + "");
			x = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error realizarPagoDetalle: " + e);
		}
		return x;

	}
	
	

	public int getId() {
		// // TODO Auto-generated method stub
		int ultimo = 0;

		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("select max(idpago) as idpago FROM pago");
			rs = ps.executeQuery();
			while (rs.next()) {
				ultimo = rs.getInt("idpago");
			}

		} catch (SQLException ex) {
			Logger.getLogger(PagoDao.class.getName()).log(Level.SEVERE, null, ex);
		}

		return ultimo;
	}

}
