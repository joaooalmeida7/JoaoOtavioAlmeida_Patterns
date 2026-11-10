package atividade1.abstractfactory;

public class Application {
    private UIComponentFactory fabrica;

    public Application(UIComponentFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void render() {
        // Os três componentes vêm da mesma fábrica.
        Button botao = fabrica.createButton();
        TextField campoTexto = fabrica.createTextField();
        Checkbox caixaSelecao = fabrica.createCheckbox();

        botao.render();
        campoTexto.render();
        caixaSelecao.render();
    }
}
