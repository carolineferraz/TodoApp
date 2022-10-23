package TodoApp;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import util.ConnectionFactory;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
		
		Connection c = ConnectionFactory.getConnection();
		
		ConnectionFactory.closeConnection(c);
	}

}
