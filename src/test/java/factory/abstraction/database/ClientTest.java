package factory.abstraction.database;

import factory.abstraction.database.department.Department;
import factory.abstraction.database.department.MySqlDepartment;
import factory.abstraction.database.department.OracleDepartment;
import factory.abstraction.database.user.MySqlUser;
import factory.abstraction.database.user.OracleUser;
import factory.abstraction.database.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    private String mysql = "factory.abstraction.database.factory.MysqlFactory";
    private String oracle = "factory.abstraction.database.factory.OracleFactory";

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