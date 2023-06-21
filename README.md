# Diplom_3

Задание 3: веб-приложение

В последнем задании тебе нужно протестировать веб-приложение Stellar Burgers. (https://stellarburgers.nomoreparties.site/)

Что нужно сделать
Опиши элементы, которые будешь использовать в тестах, с помощью Page Object.
Протестируй функциональность в Google Chrome и Яндекс.Браузере. Подключи Allure-отчёт.

1. Регистрация
Проверь:
 - Успешную регистрацию.
 - Ошибку для некорректного пароля. Минимальный пароль — шесть символов.

2. Вход
Проверь:
 - вход по кнопке «Войти в аккаунт» на главной,
 - вход через кнопку «Личный кабинет»,
 - вход через кнопку в форме регистрации,
 - вход через кнопку в форме восстановления пароля.

3. Переход в личный кабинет
Проверь переход по клику на «Личный кабинет».

4. Переход из личного кабинета в конструктор
Проверь переход по клику на «Конструктор» и на логотип Stellar Burgers.

5. Выход из аккаунта
Проверь выход по кнопке «Выйти» в личном кабинете.

6. Раздел «Конструктор»
Проверь, что работают переходы к разделам:
 - «Булки»,
 - «Соусы»,
 - «Начинки».

Как выполнить и сдать работу
Напиши код в IDEA и запушь ветку develop3 на GitHub. Сделай пул-реквест. 



МОИ ШАГИ:

Создал отдельный репозиторий для тестов веб-приложения, с помощью Page Object.
Создал Maven-проект.
Подключил JUnit 4, Selenium, WebDriverManager (для Подключение Selenium), RestAssured и Allure.

Проект:
1. Cоздать класс PathAPI с эндпоинтами (ручками).

2. Cоздать классы для пользователя UserRegistration, UserLogin.
* Начать описывать - Сериализацию — преобразовать объект в JSON
*
* Как использовать сериализацию, если нужно отправить запрос с JSON:
*  1) Создать класс, поля которого соответствуют ключам JSON. Добавить конструктор с параметрами и конструктор без параметров.
*  2) В тесте создать объект класса с нужными значениями — через конструктор.
*  3) Сериализовать объект, то есть преобразовать его в JSON. Для этого нужно подключить библиотеку Gson.

3. Описать общие шаги для пользователя и вынести их в класс User.
   Класс являются наследниками класса PathAPI, где хранятся ручки.

