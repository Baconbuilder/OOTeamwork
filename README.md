# Object-Oriented Software Engineering Final Project

This project is a Java application that simulates an ordering system for pizzas and beverages. It demonstrates the use of five design patterns: Strategy, Singleton, Factory Method, Decorator, and Template Method.

## Design Patterns Used

- **Strategy**: This pattern is used to encapsulate different algorithms for selecting a pizza or a beverage, and to allow the user to choose the desired strategy at runtime.

- **Singleton**: This pattern is used to ensure that there is only one instance of the classes that store the inventory quantities of pizzas and beverages, and the total cost of the order.

- **Factory Method**: This pattern is used to define an interface for creating an object, but let subclasses decide which class to instantiate. It allows the creation of different types of pizzas and beverages based on the user's input.

- **Decorator**: This pattern is used to add additional features or behaviors to a pizza, such as crusts and toppings, without modifying the existing class hierarchy.

- **Template Method**: This pattern is used to define the skeleton of an algorithm for preparing a beverage, and let subclasses provide the specific steps for different types of beverages, such as hot or cold, and with or without condiments.