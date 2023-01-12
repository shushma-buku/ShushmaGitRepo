@weatherPredictionFeature

Feature: Predicting the meta weather, based on the response from two APIs
  Scenario Outline : To predict the weather, in a city
    Given The '<city>' of which we need weather
    When The woeid of the City is fetched by City
    Then print min_tem and max_temp with score >= '<score>'
    Examples:
      | city      | score |
      | Bangalore | 75    |