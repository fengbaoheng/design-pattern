package factory.abstraction.database.factory;

import factory.abstraction.database.department.Department;
import factory.abstraction.database.department.MySqlDepartment;
import factory.abstraction.database.user.MySqlUser;
import factory.abstraction.database.user.User;

/**
 * Mysql工厂
 * 具体工厂
 */
public class MysqlFactory implements DatabaseFactory {
    @Override
    public User insertUser() {
        return new MySqlUser();
    }

    @Override
    public Department insertDepartment() {
        return new MySqlDepartment();
    }
}
