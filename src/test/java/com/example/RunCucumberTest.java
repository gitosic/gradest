package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/
import org.junit.runner.RunWith;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import exceptions.QAException;

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
    @BeforeClass
    public static void connectDB(){
        System.out.println("BeforeClass");
        throw new QAException("QAException_BeforeClass777");
    }

    @AfterClass
    public static void disconnectDB(){
        System.out.println("AfterClass");
        throw new QAException("QAException_AfterClass777");
    }
}