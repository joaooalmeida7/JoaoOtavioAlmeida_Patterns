package atividade1.abstractfactory;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema escuro");
    }
}
