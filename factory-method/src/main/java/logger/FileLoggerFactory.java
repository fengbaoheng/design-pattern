package logger;

/**
 * 文件日志记录器工厂
 * 子工厂
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger get() {
        return new FileLogger();
    }
}
