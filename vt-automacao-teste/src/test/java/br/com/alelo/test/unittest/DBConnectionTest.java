package br.com.alelo.test.unittest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import br.com.alelo.config.DBConnectionFactory;

/**
 * Teste Unitário da Conexão com o Banco de Dados
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class DBConnectionTest {

	@Test
	@DisplayName("Teste Positivo de Conexão com o Banco de Dados.")
	public void getConnectionTest() throws SQLException {
		Connection connection = new DBConnectionFactory().getConnection();
		System.out.println("Conexão Aberta");
		connection.close();
		assertTrue(connection.isClosed());
	}

}