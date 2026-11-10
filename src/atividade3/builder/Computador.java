package atividade3.builder;

public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    Computador(String processador, String memoriaRAM, String armazenamento,
               String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    @Override
    public String toString() {
        String video = "N/A";
        String sistema = "N/A";

        if (placaDeVideo != null) {
            video = placaDeVideo;
        }

        if (sistemaOperacional != null) {
            sistema = sistemaOperacional;
        }

        return "Processador: " + processador
                + "\nRAM: " + memoriaRAM
                + "\nArmazenamento: " + armazenamento
                + "\nPlaca de vídeo: " + video
                + "\nSistema operacional: " + sistema;
    }
}
