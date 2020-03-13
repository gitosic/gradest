package com.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class MyTestStepdefs {
    @When("compare text with reference")
    public void compareTextWithReference(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        String text = "Stream launched 2019-10-2315:40 by admin";
        assertThat(text, allOf(startsWith("Stream"), containsString("by admin")));
        assertTrue(text.equals(rows.get(0).get(0)));
        assertTrue(text.equals(rows.get(1).get(0)));
    }

    @Then("В аудите появится не статичное сообщение: {string}")
    public void вАудитеПоявитсяНеСтатичноеСообщение(String arg0) {
        System.out.println("arg___0 ==== " + arg0);
    }

    @Then("В аудите появится не статичное сообщение: {string} [YYYY-MM-DD] {string}")
    public void вАудитеПоявитсяНеСтатичноеСообщениеDetailsLaunchedTeradataSend_datesProcedureForDatesByCode(String arg0, String arg1) {
        ArrayList list = new ArrayList();
        list.add(arg0);
        list.add(arg1);
        System.out.println("arg0== " + arg0);
        System.out.println("arg1== " + arg1);
        System.out.println("list== " + list);
        System.out.println("list2== " + list.get(0));
        assertThat(list.toString(), allOf(startsWith("[" + arg0), containsString(arg1)));
    }

    @Then("В аудите появится не статичное сообщение: {string} [YYYY-MM-DD]{string}")
    public void вАудитеПоявитсяНеСтатичноеСообщениеДеталиЗапущенаSend_datesПроцедураТерадатыДляДатПоКоду(String arg0, String arg1) {
        ArrayList list = new ArrayList();
        list.add(arg0);
        list.add(arg1);
        System.out.println("arg0== " + arg0);
        System.out.println("arg1== " + arg1);
        System.out.println("list== " + list);
        System.out.println("list2== " + list.get(0));
        assertThat(list.toString(), allOf(startsWith("[" + arg0), containsString(arg1)));
    }
}
