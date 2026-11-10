package atividade1.abstractfactory;

public class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema claro");
    }
}
