package logger;

/**
 * 数据库日志记录器工厂
 * 子工厂
 */
public class DatabaseLoggerFactory extends LoggerFactory {

    @Override
    public Logger get() {
        return new DatabaseLogger();
    }
}
