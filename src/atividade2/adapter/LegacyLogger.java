package atividade2.adapter;

// Adaptee: simulação da biblioteca legada, mantida sem alterações pelo Adapter.
public class LegacyLogger {
    public void log(String level, String text) {
        System.out.println("[" + level + "] " + text);
    }
}
