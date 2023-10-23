package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {

	/** módulo de conexão - parametros de localização **/
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "root";

	/** Método de conexão **/
	private Connection conectar() {

		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// teste de conexão
	public void testeConexão() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//	CRUD CREATE
	public void inserirContato(JavaBeans contato) {
		String create = "insert into contatos (nome,fone,email) values (?,?,?)";

		try {
			// abrir a conexão com o banco
			Connection con = conectar();
			// preparar a query para execução no bd
			PreparedStatement pst = con.prepareStatement(create);
			// susbstiuir os parametros (?) pelo conteudo das varivaveis.

			pst.setNString(1, contato.getNome());
			pst.setNString(2, contato.getFone());
			pst.setNString(3, contato.getEmail());

			// executar a query
			pst.executeUpdate();
			// encerrar a conexão com o banco
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
