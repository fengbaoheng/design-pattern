package factory.method.logger;

/**
 * 客户端
 */
public class Client {
    /**
     * 工厂类名，实际中可通过配置文件读取
     * 用于创建子工厂
     */
    private static final String clazz = "factory.method.logger.FileLoggerFactory";


    public static void main(String[] args) throws Exception {
        // 依据反射创建子工厂
        LoggerFactory factory = (LoggerFactory) Class.forName(clazz).newInstance();
        Logger logger = factory.get();

        logger.log();
    }
}
