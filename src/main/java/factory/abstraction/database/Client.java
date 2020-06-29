package factory.abstraction.database;

import factory.abstraction.database.department.Department;
import factory.abstraction.database.factory.DatabaseFactory;
import factory.abstraction.database.user.User;

public class Client {
    private final DatabaseFactory factory;

    public Client(String factoryClazz) {
        factory = createFactory(factoryClazz);
    }

    /**
     * 通过反射从配置字符串中实例化对应的具体工厂
     *
     * @param factoryClazz 具体工厂类字符串
     * @return 具体工厂类
     */
    private DatabaseFactory createFactory(String factoryClazz) {
        try {
            return (DatabaseFactory) Class.forName(factoryClazz).newInstance();
        } catch (Exception e) {
            return null;
        }
    }

    public User insertUser() {
        return factory.insertUser();
    }

    public Department insertDepartment() {
        return factory.insertDepartment();
    }
}
