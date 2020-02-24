package com.example;

import io.cucumber.java.en.*;

public class MyStepdefs {
    @Given("sample feature file is ready")
    public void sampleFeatureFileIsReady() {
        System.out.println("Hello World!");
    }

    @When("en")
    public void en() {
        System.out.println("Hi 111");
    }

    @When("рус")
    public void рус() {
        System.out.println("Привет 123");
    }


    @And("^В табл\\. приемника Терадаты \"([^\"]*)\" \"([^\"]*)\" очистки данных выполнить$")
    public void вТаблПриемникаТерадатыОчисткиДанныхВыполнить(String arg0, String arg1) throws Throwable {
        System.out.println("1");
    }

    @When("^В воркфлоу \"([^\"]*)\" нажать кнопку \"([^\"]*)\"$")
    public void вВоркфлоуНажатьКнопку(String arg0, String arg1) throws Throwable {
        System.out.println("1");
    }

    @Then("^В табл\\. приемника Терадаты \"([^\"]*)\" загружены записи, где все колонки одной строки заполнены$")
    public void вТаблПриемникаТерадатыЗагруженыЗаписиГдеВсеКолонкиОднойСтрокиЗаполнены(String arg0) throws Throwable {
        System.out.println("1");
    }

    @Then("^В табл\\. источника Дифсофт \"([^\"]*)\" все записи с полем \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void вТаблИсточникаДифсофтВсеЗаписиСПолем(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        System.out.println("1");
    }




    /*
    * Ниже шаги про кейс @QA
    * */
    @When("step {int}")
    public void step(int arg0) {
        System.out.println("Step " + arg0);
    }

    @Then("Шаг {int}")
    public void шаг(int arg0) {
        System.out.println("Шаг " + arg0);
    }

    @When("Выполнить скрипт {string}, наполненияффф бд {string} запис с полем {string} = {string}")
    public void выполнитьСкриптНаполненияфффБдЗаписСПолем(String arg0, String arg1, String arg2, String arg3) {
        System.out.println("Со скобками шаги пиши аккуратно / Write carefully with brackets");
    }
}
