Feature: Two bananas scanned separately
 Scenario: Checkout two bananas
  Given the price of a "banana" is 40c
  When I checkout 1 "banana"
  And I checkout 1 "banana"
  Then the total price should be 80c