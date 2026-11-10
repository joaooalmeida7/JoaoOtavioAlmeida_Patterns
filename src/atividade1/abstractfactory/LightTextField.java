package atividade1.abstractfactory;

public class LightTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Renderizando Caixa de Texto com borda cinza clara");
    }
}
