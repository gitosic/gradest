package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/
import org.junit.runner.RunWith;

//import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.example",//Только имя пакета
        features = "src/test/resources/dira", //Основной
        tags = "@QA",
//        dryRun = false,
//        snippets = CAMELCASE,
        snippets = CucumberOptions.SnippetType.CAMELCASE,//под зависимость import io.cucumber.junit.Cucumber;//import io.cucumber.junit.CucumberOptions;
        strict = true //Todo Подсказки
//        name = "^Отображение.*"
        /*(plugin =
        {"pretty", "summary"},
        snippets = CAMELCASE,
        dryRun=true)*/
)
public class RunCucumberTest {
}