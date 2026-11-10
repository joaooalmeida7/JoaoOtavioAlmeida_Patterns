package atividade1.abstractfactory;

public class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Renderizando Caixa de Texto com borda cinza escura");
    }
}
