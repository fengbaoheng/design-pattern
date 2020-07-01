package database;


import database.department.Department;
import database.department.MySqlDepartment;
import database.department.OracleDepartment;
import database.user.MySqlUser;
import database.user.OracleUser;
import database.user.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {
    private String mysql = "database.factory.MysqlFactory";
    private String oracle = "database.factory.OracleFactory";

    @Test
    public void insertMysql() {
        Client client = new Client(mysql);
        User user = client.insertUser();
        Department department = client.insertDepartment();

        assertEquals(MySqlUser.class, user.getClass());
        assertEquals(MySqlDepartment.class, department.getClass());
    }

    @Test
    public void insertOracle() {
        Client client = new Client(oracle);
        User user = client.insertUser();
        Department department = client.insertDepartment();

        assertEquals(OracleUser.class, user.getClass());
        assertEquals(OracleDepartment.class, department.getClass());
    }
}