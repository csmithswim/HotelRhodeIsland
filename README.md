Maybe make a UML to help, use our bank project as a reference. 
Hotel breakdown:

Customer views what type of rooms, the price of rooms and their availability.
Customer sends a booking request.
Hotel receives their booking request and fulfills their request based upon
availability.
Customer sends a checkout request.
Hotel fulfills customer's request and changes the room in their database.

Classes to consider:

Hotel class
Room class
Customer class(possibly in a different package)
Console class

Fields to consider
Hotel:
String name
String address
Boolean/String occupancy if the boolean value is true then print a message to 
console that says there is occupancy, if false
print no occupancy. The value can test a list;
List<Rooms>

Room class:
String roomNumber
String roomType
String occupant
Boolean occupied

Console class:
Input fields related to scanner object.

Customer class:
String name
String age
String creditCard

Methods to consider
Hotel:
constructor to instantiate hotel object.
displayAvailable - returns all available rooms to screen.
checkIn - returns a new List<Rooms> when a customer checks in.
checkOut - returns a new List<Rooms> when a customer checks out.
checkCreditCard - returns a boolean value when a customer's credit card is passed
as a parameter.
toString method to print hotel objects to screen.

Room class: 
constructor to instantiate hotel object.
getter to get room fields.
setter to set room fields.
toString method to print room objects to screen.

Customer class:
constructor to instantiate customer object.
getter/setter for customer fields.

Console class:
bookRoom - prints a string to console that prompts user to input a string to book 
a room and then returns a string as 
a parameter passed to the hotel checkIn method.
returnRoom - prints a string to console that prompts user to input a string to 
return a room and then returns a string as 
xa parameter passed to the hotel checkIn method.
