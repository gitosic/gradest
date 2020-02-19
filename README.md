#Gradle Cucumber runner + Starting from the terminal


## Запуск определенного теста по тегу.
```
gradlew -Dcucumber.options="--tags @QA" clean cucumber
```

Меняем "import io.cucumber.java.en.*;" на "import cucumber.api.java.en.*;"
Меняем "import io.cucumber.java.en.*;" на "import cucumber.api.java.en.*;"
```
import io.cucumber.java.en.*;

    testImplementation 'io.cucumber:cucumber-java:5.1.3'
    testCompile group: 'io.cucumber', name: 'cucumber-junit', version: '2.3.1'
    testImplementation 'io.cucumber:cucumber-junit:5.1.3'
```

Полезные ссылки

Gradle – [Учебник Gradle](https://coderlessons.com/tutorials/raznoe/vyuchit-gradle/gradle-kratkoe-rukovodstvo)

Инструкции по настройке запускатора ( ► ) - [https://cucumber.io/docs/cucumber/api/#from-the-command-line]()

The Gradle Wrapper - [https://docs.gradle.org/current/userguide/gradle_wrapper.html]()

Руководство: Cucumber + Java - [https://habr.com/ru/post/332754/]()

Основня ссылка была - [https://cucumber.io/docs/tools/java/#gradle]()

Рус. текст в Jenkins - [https://medium.com/pacroy/how-to-fix-jenkins-console-log-encoding-issue-on-windows-a1f4b26e0db4]()

Selenium with Cucumber and Gradle - [https://softwareautomata.wordpress.com/2017/08/05/selenium-with-cucumber-and-gradle/]()

https://cucumber.io/docs/installation/java/

Таблица Alt-кодов - [https://htmlweb.ru/html/alt-codes.htm]()


The complete, and updated, instructions are availabe at the 
[plugin portal](https://plugins.gradle.org/plugin/se.thinkcode.cucumber-runner).
1 - [qwerty]()
