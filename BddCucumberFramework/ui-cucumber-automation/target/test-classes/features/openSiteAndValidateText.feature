Feature: Open a site and validate the text

  Scenario: Open Coviam site and validate the welcome message

    Given Open the Chrome and launch the application site as 'http://www.google.com'
    When Enter 'Coviam.com' in search box and click Enter
    Then Open 'website' and validate keyword 'INNOVATE DIGITAL'


