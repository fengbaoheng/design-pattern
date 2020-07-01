package database.factory;

import database.department.Department;
import database.department.MySqlDepartment;
import database.user.MySqlUser;
import database.user.User;

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
