# PCCCS495 – Term II Project

## Project Title

Car Rental System (Java Console Application)

---

## Problem Statement (max 150 words)

The Car Rental System is a console-based application developed to manage basic car rental operations efficiently. It allows users to view all cars, check available cars, rent a car, and return a car using a unique car ID. The system ensures that only available cars can be rented and prevents duplicate rentals. It simplifies manual record-keeping and reduces errors by maintaining structured data within the program. This project demonstrates the application of Object-Oriented Programming (OOP) concepts such as encapsulation, abstraction, and modular design. The primary objective is to create a simple, user-friendly system that simulates real-world car rental functionality for academic learning purposes.

---

## Target User

* Small car rental shop owners
* Students learning Java and OOP
* Users needing a basic rental management system

---

## Core Features

* Add cars to the system
* Display all cars
* Display available cars
* Rent a car using ID
* Return a car using ID
* Menu-driven console interface

---

## OOP Concepts Used

* **Abstraction:**
  Only essential operations like renting and returning cars are exposed, while internal data handling is hidden.

* **Inheritance:**
  Not implemented in this project but can be extended for different car types.

* **Polymorphism:**
  Methods like `displayCar()` behave differently based on the car's availability status.

* **Exception Handling:**
  Basic validation using conditional checks for invalid inputs and unavailable cars.

* **Collections / Threads:**
  Array is used to store car objects. No multithreading is used.

---

## Proposed Architecture Description

The system follows a simple modular architecture:

* **Car Class:** Defines properties and behavior of a car
* **CarRentalSystem Class:** Handles storage and operations on cars
* **Main Class:** Manages user interaction through a menu

Flow:
User Input → Main Class → CarRentalSystem → Car Class → Output

---

## How to Run

1. Install Java (JDK 8 or above)
2. Save the file as `Main.java`
3. Compile the program:

   ```
   javac Main.java
   ```
4. Run the program:

   ```
   java Main
   ```
5. Use the menu options displayed in the console

---

## Git Discipline Notes

Minimum 10 meaningful commits are maintained in this project. Each commit represents a logical step in development such as class creation, method implementation, feature addition, and final integration. Commit messages are clear and descriptive to reflect the changes made.
