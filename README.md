#Gradle Cucumber runner + Starting from the terminal

## Запуск ТОЛЬКО через таску gradle работает, а через junit-овский класс RunCucumberTest не работает - Стек ошибки ниже.... 


### Запуск таски с параметром пути к папке с тест-кейсами
```
    gradle -PpathToFeatureFiles=src/test/resources/dira cucumber
```
### Запуск таски без папаметров
```
    gradle cucumber
```

Полезные ссылки

Gradle - Tasks - [https://www.tutorialspoint.com/gradle/gradle_tasks.htm]()

Gradle – [Учебник Gradle](https://coderlessons.com/tutorials/raznoe/vyuchit-gradle/gradle-kratkoe-rukovodstvo)

Инструкции по настройке запускатора ( ► ) - [https://cucumber.io/docs/cucumber/api/#from-the-command-line]()

The Gradle Wrapper - [https://docs.gradle.org/current/userguide/gradle_wrapper.html]()

Руководство: Cucumber + Java - [https://habr.com/ru/post/332754/]()

Передача аргументов при вызове Gradle - [https://stackoverflow.com/questions/20410854/how-to-pass-parameters-or-arguments-into-a-gradle-task/26510706#26510706]()

Основня ссылка была - [https://cucumber.io/docs/tools/java/#gradle]()

Рус. текст в Jenkins - [https://medium.com/pacroy/how-to-fix-jenkins-console-log-encoding-issue-on-windows-a1f4b26e0db4]()

Selenium with Cucumber and Gradle - [https://softwareautomata.wordpress.com/2017/08/05/selenium-with-cucumber-and-gradle/]()

https://cucumber.io/docs/installation/java/

Таблица Alt-кодов - [https://htmlweb.ru/html/alt-codes.htm]()

Для того, что бы появился стандартный отчет cucumber в такске "cucumber" нужно заменить 'pretty' на 'html:cucumber-html-report'

The complete, and updated, instructions are availabe at the 
[plugin portal](https://plugins.gradle.org/plugin/se.thinkcode.cucumber-runner).



#
##### Стек ошибки при запуске по unit-овскому классу RunCucumberTest...
```

Classes annotated with @RunWith(Cucumber.class) must not define any
Step Definition or Hook methods. Their sole purpose is to serve as
an entry point for JUnit. Step Definitions and Hooks should be defined
in their own classes. This allows them to be reused across features.
Offending class: class com.example.RunCucumberTest

io.cucumber.core.exception.CucumberException: 
```
##
### На потом
#### Запуск определенного теста по тегу - !!!!??!?!?!?! под вопросом решение
#### gradlew -Dcucumber.options="--tags @QA" clean cucumber
###### Меняем "import io.cucumber.java.en.*;" на "import cucumber.api.java.en.*;"
###### Меняем "import io.cucumber.java.en.*;" на "import cucumber.api.java.en.*;"
```
import io.cucumber.java.en.*;

    testImplementation 'io.cucumber:cucumber-java:5.1.3'
    testCompile group: 'io.cucumber', name: 'cucumber-junit', version: '2.3.1'
    testImplementation 'io.cucumber:cucumber-junit:5.1.3'
```

1 - [qwerty]()
