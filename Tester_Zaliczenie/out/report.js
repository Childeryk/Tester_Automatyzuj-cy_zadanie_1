$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("zadanie1.feature");
formatter.feature({
  "line": 1,
  "name": "Zadanie1",
  "description": "",
  "id": "zadanie1",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "dodawanie adresu do zarejestrowanego konta",
  "description": "",
  "id": "zadanie1;dodawanie-adresu-do-zarejestrowanego-konta",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "jako zarejestrowany użytkownik loguję się na stronę sklepu",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Kiedy jestem na stronie z moimi koncie, dodaję nowy adres do konta",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wypełniam formularz danymi: alias \u003calias\u003e adres \u003cadres\u003e city \u003ccity\u003e zip/postal code \u003czip/postal code\u003e country \u003ccountry\u003e phone \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "sprawdzam czy informacje są dodane",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "zadanie1;dodawanie-adresu-do-zarejestrowanego-konta;",
  "rows": [
    {
      "cells": [
        "alias",
        "adres",
        "city",
        "zip/postal code",
        "country",
        "phone"
      ],
      "line": 11,
      "id": "zadanie1;dodawanie-adresu-do-zarejestrowanego-konta;;1"
    },
    {
      "cells": [
        "One",
        "Some Street  13",
        "London",
        "12345",
        "United Kingdom",
        "123123123"
      ],
      "line": 12,
      "id": "zadanie1;dodawanie-adresu-do-zarejestrowanego-konta;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "dodawanie adresu do zarejestrowanego konta",
  "description": "",
  "id": "zadanie1;dodawanie-adresu-do-zarejestrowanego-konta;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "jako zarejestrowany użytkownik loguję się na stronę sklepu",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Kiedy jestem na stronie z moimi koncie, dodaję nowy adres do konta",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wypełniam formularz danymi: alias One adres Some Street  13 city London zip/postal code 12345 country United Kingdom phone 123123123",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "sprawdzam czy informacje są dodane",
  "keyword": "Then "
});
formatter.match({
  "location": "Zadanie1Steps.openWebSite()"
});
formatter.result({
  "duration": 3640262000,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.createNewAddressBtn()"
});
formatter.result({
  "duration": 463133900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "One",
      "offset": 34
    },
    {
      "val": "Some Street  13",
      "offset": 44
    },
    {
      "val": "London",
      "offset": 65
    },
    {
      "val": "12345",
      "offset": 88
    },
    {
      "val": "United Kingdom",
      "offset": 102
    },
    {
      "val": "123123123",
      "offset": 123
    }
  ],
  "location": "Zadanie1Steps.alias(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 772613300,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.checkData()"
});
formatter.result({
  "duration": 651637300,
  "status": "passed"
});
});