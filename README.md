# BikesRental - explain design, the development practices you applied and how run the tests
The classes have comments all over to indicate the purpose of each class, method, properties, etc.

To Sum up, the main class is RentalBill which will handle the calculation of the charges to the client.

Each item to include in the billing calculation will be handled by BikeRentalItem class which will be responsible to hold the complete information for the rental of each bike, the client who rented it, the type of rent assigned, the starttime and due date and time of devolution, the actual date and time of devolution. Is designed so that in the future with a database, there can be found all the BikeRentalItem from the same RentalBill, reports about OVERDUE status rentals, bikes available and bikes rented, contact data of certain client, retals made by each client, etc.

ActiveDiscounts Singleton is meant to hold the active discounts and is a Singleton because we only need one instance of it running. It needs to be filled with the active discounts with the method addActiveDiscounts. Maybe it can be filled from database or from a properties file.

The same with FamilyDiscountStrategy Singleton class that will manage the calculation of the discount for a RentalBilling. This singleton implements the DiscountStrategyInterface wich will force each class that implements it, to implement the CalculateDiscount method so we can have different discount implementations for the same RentalBill.

And about the Rental Types the classes implementing RentalBase are the different types of rental, each one will hold the fixed price, name and code in the constructor and need to be provided with the amount of units requested to do the calculation of the total price of the corresponding BikeRentalItem. So there will be one rental type per rental item. 

Regarding the Tests, they are JUnits. I created a maven proyect and put the dependenciens there. To run the tests they can be ran from any IDE. Importing maven project and selecting test package and select the available option to run all tests.

I haven't been able to meassure the coverage percentage but all the 11 model classes are executed in the 13 tests created. 

Please refer to the code for more detail, there are comments there too. If not enough, please let me know.

Thanks and Regards.

Paula Burgos
