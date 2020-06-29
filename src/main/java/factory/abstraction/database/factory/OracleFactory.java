package factory.abstraction.database.factory;

import factory.abstraction.database.department.Department;
import factory.abstraction.database.department.OracleDepartment;
import factory.abstraction.database.user.OracleUser;
import factory.abstraction.database.user.User;

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
