[![Build Status](https://github.com/GertmanMargarita/FirstProject/actions/workflows/main.yml/badge.svg)]
## Техническое задание №2 (ТЗ2)

Добавляем тесты и разворачиваем простейший CI/CD

## Задачи
в файле src/App.java
реализованы функции чтения из файла, поиска минимального числа, поиска максимального числа, сложения и умножения всех чисел из файла

в файле src/AppTest.java
реализованы:
тесты для проверки корректности функций поиска минимума, максимума, сложения и умножения
тесты для проверки скорости работы программы при увеличении размера входного файла (для каждой из функций: поиск минимума, максимума, сложение и умножение)
любой другой тест на ваше усмотрение - реализован GeneralTest()

настроить CI-систему для своего мини-проекта.

Реализовано:
заведите репозиторий для своего проекта на GitHub. Оформите простейший README.md
подключена к вашему проекту CI-систему GitHub Actions. запуска тестов в ручном режиме Actions -> Run tests
настроина CI таким образом, чтобы прогон тестов запускался автоматически при любом новом коммите в репозиторий вашего проекта
сделана интеграцию CI-системы и вашего репозитория на GitHub: сделайте бэйдж в README.md


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
