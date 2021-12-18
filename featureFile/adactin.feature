 Feature: Booking Hotel in Adactin 
 
 Scenario Outline: Hotel booking in Adactin
Given Enter the url for Adactin
When  user enter the "<username>" and "<password>"
And   Click the login button
When  user go to search hotel page
And   select the location 
And   select the hotel
And   select the room type
And   select Number of room
And   enter the check in and check out date
When  select the number of adult per room
And   select the number of child per room
Then  click the search button
When  user go to the select hotel page
And   click radio button of the hotel
And   click continue button 
Then  User go to the booking page
When  user enter the first and last name
Then  User enter the address
And   enter the card number and card type
Then  select month and year of card expiry
And   enter cvv number
Then  Click the booknow button

Examples:
   |username|password|
   |mukil2318|Mukil231995|
