# 🍽️ Weekly Meal Planner & Grocery Generator

A menu-driven Java console application that helps users plan their meals for an entire week and automatically generate a consolidated grocery list.

---

## 📌 Abstract

The **Weekly Meal Planner & Grocery Generator** is a Java console application developed to simplify weekly meal organization and grocery preparation.

The application allows users to create a structured **7-day meal plan** containing breakfast, lunch, and dinner. Users can select meals through a menu-driven interface, view their weekly plan, and generate a consolidated grocery list based on the selected meals.

The project uses Java concepts such as **Scanner, variables, conditional statements, switch statements, loops, methods, and arrays** to implement a practical real-world application.

---

## 🎯 Objectives

* Create a seven-day meal plan containing breakfast, lunch, and dinner.
* Provide a simple menu-driven interface.
* Store and display selected meal information.
* Associate meals with their required ingredients.
* Automatically generate a consolidated grocery list.
* Apply PSPJ CO-1, CO-2 and CO-3 Java concepts.
* Provide a foundation for future improvements such as GUI and database integration.

---

## ⭐ Advantages

* **Easy weekly planning** – Organizes meals for all seven days.
* **Time saving** – Reduces manual meal and grocery planning.
* **Automatic grocery generation** – Generates ingredients from selected meals.
* **Reduced duplication** – Repeated ingredients can be combined.
* **Better organization** – Displays meals according to day and meal type.
* **Simple operation** – Uses an easy console-based menu.
* **Practical learning** – Connects Java concepts with a real-world application.
* **Expandable** – Can be extended with GUI, database, nutrition and budget features.

---

## 🛠️ Technologies Used

* **Language:** Java
* **Input:** Scanner
* **Data Structures:** Arrays
* **Control Statements:** if/else, switch
* **Loops:** for, while, do-while
* **Methods:** Modular program design
* **Platform:** Java Console

---

## ⚙️ Implementation

The application follows an **Input → Processing → Output (IPO)** structure.

### CO-1: Basic Programming, Input & Processing

Used concepts:

* Variables
* Data types
* Operators
* Scanner
* User input
* Basic processing
* IPO model

### CO-2: Decision Making & Iteration

Used concepts:

* if/else
* Nested conditions
* switch
* for loop
* while loop
* do-while loop
* break
* continue
* Menu-driven execution

### CO-3: Methods & Arrays

Used concepts:

* Methods
* One-dimensional / two-dimensional arrays
* Array processing
* Data organization
* Modular programming

A two-dimensional array can represent the weekly meal plan:

```java
String[][] mealPlan = new String[7][3];
```

The **7 rows** represent the seven days, while the **3 columns** represent breakfast, lunch and dinner.

---

## 🔄 System Flow

```text
Start
  ↓
Display Menu
  ↓
Select Day
  ↓
Select Meal Type
  ↓
Select Meal
  ↓
Store Meal
  ↓
Repeat for the Week
  ↓
Collect Ingredients
  ↓
Combine Repeated Ingredients
  ↓
Display Grocery List
  ↓
Exit
```

---

## 📂 Main Modules

| Module              | Purpose                           | CO         |
| ------------------- | --------------------------------- | ---------- |
| Main Menu           | Displays available actions        | CO-1, CO-2 |
| Meal Selection      | Selects day, meal type and food   | CO-1, CO-2 |
| Weekly Meal Storage | Stores meals for seven days       | CO-3       |
| Meal Display        | Displays the weekly plan          | CO-2, CO-3 |
| Ingredient Mapping  | Associates meals with ingredients | CO-1, CO-3 |
| Grocery Generator   | Generates the final grocery list  | CO-2, CO-3 |

---

## 📸 Sample Outputs

### Main Menu

<img width="332" height="351" alt="Screenshot 2026-10-05 090137" src="https://github.com/user-attachments/assets/5a1f67dc-8835-4d3d-9622-9aa100e71154" />

### Day & Meal Selection

<img width="378" height="357" alt="Screenshot 2026-10-05 090202" src="https://github.com/user-attachments/assets/74c9f9b8-408d-458e-906c-6fcc46a5cd6e" />


### Weekly Meal Plan

<img width="327" height="357" alt="Screenshot 2026-10-05 090219" src="https://github.com/user-attachments/assets/cb63a306-33bb-44bd-9895-498af3086b30" />

### Grocery List

<img width="487" height="248" alt="Screenshot 2026-10-05 090232" src="https://github.com/user-attachments/assets/92f2ea7b-7290-46d3-8818-472d6cbe0cd7" />

### Invalid Input Handling


<img width="417" height="248" alt="Screenshot 2026-10-05 090242" src="https://github.com/user-attachments/assets/31dca8c1-afeb-4b20-a8c3-4684e0b84f7a" />


---

## 🎓 CO Mapping

| Course Outcome | Concepts Demonstrated                          | Application                                              |
| -------------- | ---------------------------------------------- | -------------------------------------------------------- |
| **CO-1**       | Variables, data types, operators, Scanner, IPO | Reads and stores meal/day/quantity information           |
| **CO-2**       | if/else, switch, loops, break, continue        | Controls menus, validates choices and repeats operations |
| **CO-3**       | Methods, arrays and array processing           | Organizes meal data and supports grocery generation      |

---

## 🚀 Future Enhancements

Future versions of the application can include:

* Graphical User Interface (GUI)
* Database connectivity
* Nutritional information
* Budget estimation
* User accounts
* Personalized meal recommendations

---

## ✅ Conclusion

The **Weekly Meal Planner & Grocery Generator** is a practical Java application that combines meal scheduling and grocery preparation into one system.

The project demonstrates how fundamental Java programming concepts can be applied to solve a real-world problem. It covers **CO-1, CO-2 and CO-3** through input handling, decision-making, loops, methods, arrays and structured data processing.

The application also provides a foundation for future development through features such as GUI, database connectivity, nutrition information and budget management.
