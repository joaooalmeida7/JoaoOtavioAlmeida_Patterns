package atividade3.builder;

public class ComputadorBuilder {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public ComputadorBuilder setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        if (processador == null || processador.trim().isEmpty()) {
            throw new IllegalStateException("Processador é obrigatório.");
        }

        if (memoriaRAM == null || memoriaRAM.trim().isEmpty()) {
            throw new IllegalStateException("Memória RAM é obrigatória.");
        }

        if (armazenamento == null || armazenamento.trim().isEmpty()) {
            throw new IllegalStateException("Armazenamento é obrigatório.");
        }

        return new Computador(processador, memoriaRAM, armazenamento,
                placaDeVideo, sistemaOperacional);
    }
}
