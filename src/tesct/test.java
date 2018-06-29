package tesct;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import Config.Conexion;
import Dao.ClienteDao;
import Dao.DatosFamilDao;
import Dao.FichaMedDao;
import Dao.MatriculasDao;
import Dao.TipoClienteDao;
import Dto.Cliente;
import Dto.DatosFamil;
import Dto.FichaMed;
import Dto.Matricula;
import Dto.TipoCliente;

public class test {
	static Gson g = new Gson();
	static ClienteDao aO = new ClienteDao();
	static FichaMedDao fO = new FichaMedDao();
	static TipoClienteDao tO = new TipoClienteDao();
	static DatosFamilDao dO = new DatosFamilDao();
	static MatriculasDao mO = new MatriculasDao();

	public static void main(String[] args) {
		// TODO code application logic here

		// listar();
	 crear();
//		create2();
		// validar();
		// listar2();
		// save();
		// edit();
		// read();
		// readall();
		// delete();
		// crear();
		//crearm();
//		listarcliente();
	}

	public static void conex() {
		if (Conexion.getConexion() != null) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
	}

	static void crearm() {
		Matricula c = new Matricula("as", "as", "as", 1);
		if (mO.create(c, 17) == 1) {
			System.out.println("si");
			System.out.println("idmatricula" + mO.getId());
		} else {
			System.out.println("no");
		}
	}

	static void crear() {
		Cliente c = new Cliente("nombres2","apellidos2","dnic2","gmail2","343",0, 1);
		if (aO.create(c) == 1) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		// System.out.println(aO.create(new
		// Cliente("nombrec","apellidosc","dnic","telefono","gmail","estado","tipocliente_idtipocliente","matricula_idmatricula")));
	}

	static void listar() {
		// System.out.println(aO.id());
	}

	static void listar2() {
		List<TipoCliente> lista2 = new ArrayList<>();
		lista2 = tO.readAll();
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i).getTipoc());
		}

	}

	static void create2() {
		DatosFamil a = new DatosFamil("asss", "asss", "sss", "sss", "sss", "224", 53);
		if (dO.create(a) == 1) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		// System.out.println(aO.create(new
		// Cliente("nombrec","apellidosc","dnic","telefono","gmail","estado","tipocliente_idtipocliente","matricula_idmatricula")));
	}

	static void listarcliente() {
		System.out.println(g.toJson(aO.readAllWithServices()));
	}

}
