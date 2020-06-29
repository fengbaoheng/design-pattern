package factory.abstraction.database.factory;

import factory.abstraction.database.department.Department;
import factory.abstraction.database.user.User;

/**
 * 定义每个数据库需要创建的产品族对象接口
 * 抽象工厂
 */
public interface DatabaseFactory {
    User insertUser();

    Department insertDepartment();
}
