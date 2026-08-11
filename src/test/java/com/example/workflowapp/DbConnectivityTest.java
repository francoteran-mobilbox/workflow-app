package com.example.workflowapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootTest(properties = {
		"spring.datasource.url=jdbc:postgresql://192.168.18.18:5432/uniboxInfor_20250612",
		"spring.datasource.username=postgres",
		"spring.datasource.password=mbx@7",
		"spring.jpa.hibernate.ddl-auto=none"
})
class DbConnectivityTest {

	@Autowired
	private DataSource dataSource;

	@Test
	void checkConnectionAndTables() throws Exception {
		try (Connection conn = dataSource.getConnection()) {
			System.out.println("CONNECTED: " + conn.getMetaData().getURL());
			try (Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(
							"SELECT table_name FROM information_schema.tables WHERE table_schema='public' ORDER BY table_name")) {
				while (rs.next()) {
					System.out.println("TABLE: " + rs.getString(1));
				}
			}
		}
	}
}
