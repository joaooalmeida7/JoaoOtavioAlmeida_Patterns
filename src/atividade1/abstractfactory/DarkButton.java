package atividade1.abstractfactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando Botão com fundo cinza escuro");
    }
}
