package JDBC.t1_shop_mySQL_workbanch;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseHandler dbh = new DatabaseHandler();
        dbh.getDbConnection();
    }
    }
