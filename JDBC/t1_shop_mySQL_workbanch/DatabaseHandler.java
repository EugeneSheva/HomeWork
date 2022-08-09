package JDBC.t1_shop_mySQL_workbanch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {

        public Connection getDbConnection() throws ClassNotFoundException, SQLException {
            String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
            System.out.println("Connection complete.");

            return dbConnection;
        }

}
