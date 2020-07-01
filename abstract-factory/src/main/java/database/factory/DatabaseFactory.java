package database.factory;

import database.department.Department;
import database.user.User;

/**
 * 定义每个数据库需要创建的产品族对象接口
 * 抽象工厂
 */
public interface DatabaseFactory {
    User insertUser();

    Department insertDepartment();
}
