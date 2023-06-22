package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// Страница регистрации пользователя (Создали page object — класс для страницы)
public class ProfilePage {

    private final WebDriver driver; // Добавили поле driver


    // Добавляем локаторы:
    private final By nameField = By.xpath(".//input[@value='Evgeniy']");


    // Добавили конструктор класса page object
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }


    // Методы:
    // метод вернуть заголовок "Имя"
    public By getNameField() {
        return nameField;
    }

}
