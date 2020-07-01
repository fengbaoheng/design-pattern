package database.factory;

import database.department.Department;
import database.department.OracleDepartment;
import database.user.OracleUser;
import database.user.User;

/**
 * Oracle工厂
 * 具体工厂
 */
public class OracleFactory implements DatabaseFactory {
    @Override
    public User insertUser() {
        return new OracleUser();
    }

    @Override
    public Department insertDepartment() {
        return new OracleDepartment();
    }
}
