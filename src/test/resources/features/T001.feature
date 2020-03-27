Feature: Test_001
    @TestCaseKeyExample
    Scenario: Example_001

        When compare text with reference
            |Stream launched 2019-10-2315:40 by admin|
            |Stream launched ignoring_String by admin|

        #Alternative solution
        When In the text "Stream launched 2019-10-2315: 40 by admin" there are all these lines
        |Stream launched|by admin|

