package com.example;

import io.cucumber.java.en.*;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    @When("compare text with reference")
    public void compareTextWithReference(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        String text = "Stream launched 2019-10-2315:40 by admin";
        assertTrue(text.equals(rows.get(0).get(0)));
        assertTrue(text.equals(rows.get(1).get(0)));//todo --> Make a check so that the text "ignoring_String" from the second line of the T001.feature file is ignored and gives a positive answer.
    }

    @When("In the text {string} there are all these lines")
    public void inTheTextThereAreAllTheseLines(String text, io.cucumber.datatable.DataTable dataTable) {
        String exampleText = "Stream launched 2019-10-2315:40 by admin";
        ArrayList list = new ArrayList();
        List<List<String>> rows = dataTable.asLists(String.class);
        list.add(rows.get(0).get(0));
        list.add(rows.get(0).get(1));
        assertThat(exampleText, allOf(startsWith(rows.get(0).get(0)), containsString(rows.get(0).get(1))));
    }
}
