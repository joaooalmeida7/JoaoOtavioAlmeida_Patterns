package atividade2.adapter;

public class LegacyLoggerAdapter implements Logger {
    private final LegacyLogger legacy;

    public LegacyLoggerAdapter(LegacyLogger legacy) {
        this.legacy = legacy;
    }

    @Override
    public void info(String message) {
        legacy.log("INFO", message);
    }

    @Override
    public void error(String message) {
        legacy.log("ERROR", message);
    }
}
