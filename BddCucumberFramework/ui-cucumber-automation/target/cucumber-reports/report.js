$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("openSiteAndValidateText.feature");
formatter.feature({
  "line": 1,
  "name": "Open a site and validate the text",
  "description": "",
  "id": "open-a-site-and-validate-the-text",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open Coviam site and validate the welcome message",
  "description": "",
  "id": "open-a-site-and-validate-the-text;open-coviam-site-and-validate-the-welcome-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the Chrome and launch the application site as \u0027http://www.google.com\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter \u0027Coviam.com\u0027 in search box and click Enter",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Open \u0027website\u0027 and validate keyword \u0027INNOVATE DIGITAL\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com",
      "offset": 52
    }
  ],
  "location": "Steps.open_the_Chrome_and_launch_the_application(String)"
});
formatter.result({
  "duration": 4886077677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coviam.com",
      "offset": 7
    }
  ],
  "location": "Steps.enter_searchtext_in_search_box_click_enter(String)"
});
formatter.result({
  "duration": 2748812608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INNOVATE DIGITAL",
      "offset": 37
    }
  ],
  "location": "Steps.open_website_and_validate_keyword(String)"
});
formatter.result({
  "duration": 2587705168,
  "status": "passed"
});
});