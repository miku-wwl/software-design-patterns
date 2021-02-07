public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consleLogger);

        return errorLogger;

    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.LogMessage(AbstractLogger.INFO, "This is an information");
        loggerChain.LogMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.LogMessage(AbstractLogger.ERROR, "This is an error information");
    }
}
