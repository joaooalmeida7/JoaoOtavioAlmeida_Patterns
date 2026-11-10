package atividade3.builder;

public class Main {
    public static void main(String[] args) {
        ComputadorBuilder builderBasico = new ComputadorBuilder();
        Computador basico = builderBasico
                .setProcessador("Intel Core i5")
                .setMemoriaRAM("8GB")
                .setArmazenamento("256GB SSD")
                .build();

        ComputadorBuilder builderGamer = new ComputadorBuilder();
        Computador gamer = builderGamer
                .setProcessador("Intel Core i9")
                .setMemoriaRAM("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaDeVideo("NVIDIA RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        System.out.println(basico);

        System.out.println();
        System.out.println("=== Computador Gamer ===");
        System.out.println(gamer);
    }
}
