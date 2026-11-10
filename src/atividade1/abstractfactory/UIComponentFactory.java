package atividade1.abstractfactory;

public interface UIComponentFactory {
    Button createButton();

    TextField createTextField();

    Checkbox createCheckbox();
}
