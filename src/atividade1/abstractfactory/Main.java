package atividade1.abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        UIComponentFactory fabricaClara = new LightThemeFactory();
        Application appClaro = new Application(fabricaClara);
        appClaro.render();

        System.out.println();
        System.out.println("=== Tema Escuro ===");
        UIComponentFactory fabricaEscura = new DarkThemeFactory();
        Application appEscuro = new Application(fabricaEscura);
        appEscuro.render();
    }
}
