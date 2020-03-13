Feature: Test_001
    @TestCaseKeyExample
    Scenario: Example_001

        When compare text with reference
            |Stream launched 2019-10-2315:40 by admin|
            |Stream launched 2019-10-2315:40 by admin|
            |Stream launched ignoring_String by admin|

        Then В аудите появится не статичное сообщение: "\"Детали\""
        Then В аудите появится не статичное сообщение: "\"Детали\":\"Запущена send_dates-процедура Терадаты для дат:" [YYYY-MM-DD]", по коду 00-109\""


