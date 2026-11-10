package atividade2.adapter;

public class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.info("Iniciando aplicação");
        logger.error("Falha ao conectar no banco");
    }
}
