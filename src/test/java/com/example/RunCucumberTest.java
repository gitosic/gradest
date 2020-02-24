package com.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import exceptions.QAException;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.example",//Только имя пакета
        features = "src/test/resources/dira", //Основной
//        tags = "@QA",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,//под зависимость import io.cucumber.junit.Cucumber;//import io.cucumber.junit.CucumberOptions;
        strict = true //Todo Подсказки
//        name = "^Отображение.*"
)
public class RunCucumberTest {
    @Before
    public static void connectDB(){
        System.out.println("Steps before starting");
        //throw new QAException("QAException_Before");
    }

    @After
    public static void disconnectDB(){
        System.out.println("Steps after starting");
        //throw new QAException("QAException_After");
    }
}