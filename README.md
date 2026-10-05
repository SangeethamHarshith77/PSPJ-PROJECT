# 🍽️ Weekly Meal Planner & Grocery Generator

A menu-driven Java console application that helps users plan meals for an entire week and automatically generate a consolidated grocery list.

---

## 📌 Abstract

The **Weekly Meal Planner & Grocery Generator** is a Java console application developed to simplify weekly meal planning and grocery preparation.

The application allows users to create a structured **7-day meal plan** containing breakfast, lunch, and dinner. Users can select meals through a menu-driven interface, view their weekly meal plan, and generate a consolidated grocery list based on the selected meals.

The project demonstrates fundamental Java programming concepts such as **Scanner, variables, conditional statements, switch statements, loops, methods, and two-dimensional arrays** to implement a practical real-world application.

---

## 🎯 Objectives

* Create a seven-day meal plan containing breakfast, lunch, and dinner.
* Provide a simple menu-driven interface.
* Store and display selected meal information.
* Organize meal data using a two-dimensional array.
* Associate meals with their required ingredients.
* Automatically generate a consolidated grocery list.
* Apply PSPJ CO-1, CO-2 and CO-3 Java concepts.
* Provide a foundation for future improvements such as GUI and database integration.

---

## ⭐ Advantages

* **Easy weekly planning** – Organizes meals for all seven days.
* **Time saving** – Reduces manual meal and grocery planning.
* **Automatic grocery generation** – Generates ingredients based on selected meals.
* **Reduced duplication** – Repeated ingredients are combined in the grocery list.
* **Better organization** – Displays meals according to day and meal type.
* **Simple operation** – Uses an easy console-based menu.
* **Practical learning** – Connects Java concepts with a real-world application.
* **Expandable** – Can be extended with GUI, database, nutrition and budget features.

---

## 🛠️ Technologies Used

* **Language:** Java
* **Input:** Scanner
* **Data Structures:** One-dimensional and two-dimensional arrays
* **Control Statements:** if/else, switch
* **Loops:** for, do-while
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

The program accepts user choices for meals and processes the selected information.

---

### CO-2: Decision Making & Iteration

Used concepts:

* if/else
* switch
* for loop
* do-while loop
* break
* continue
* Menu-driven execution
* Input validation

The `switch` statement controls the main menu, while loops are used for creating, displaying and processing the weekly meal plan.

---

### CO-3: Methods & Two-Dimensional Arrays

Used concepts:

* Methods
* Two-dimensional arrays
* Array processing
* Data organization
* Modular programming

The weekly meal plan is stored using a **two-dimensional array**:

```java
String[][] mealPlan = new String[7][3];
```

The structure represents:

```text
Rows    → 7 days
Columns → 3 meal types
```

The array can be viewed as:

```text
                 Breakfast       Lunch       Dinner

Monday              [0][0]       [0][1]       [0][2]
Tuesday             [1][0]       [1][1]       [1][2]
Wednesday           [2][0]       [2][1]       [2][2]
Thursday            [3][0]       [3][1]       [3][2]
Friday              [4][0]       [4][1]       [4][2]
Saturday            [5][0]       [5][1]       [5][2]
Sunday              [6][0]       [6][1]       [6][2]
```

This allows the program to directly associate each meal with a particular **day and meal type**.

---

## 🔄 System Flow

```text
Start
  ↓
Display Main Menu
  ↓
Select an Option
  ↓
Create Meal Plan
  ↓
Select Day
  ↓
Select Meal Type
  ↓
Select Meal
  ↓
Store Meal in 2D Array
  ↓
Repeat for All Days and Meals
  ↓
View Weekly Meal Plan
  ↓
Generate Grocery List
  ↓
Process Selected Meals
  ↓
Combine Required Ingredients
  ↓
Display Grocery List
  ↓
Exit
```

---

## 📂 Main Modules

| Module                  | Purpose                                               | CO         |
| ----------------------- | ----------------------------------------------------- | ---------- |
| **Main Menu**           | Displays available actions                            | CO-1, CO-2 |
| **Meal Selection**      | Selects meals for each day and meal type              | CO-1, CO-2 |
| **Weekly Meal Storage** | Stores meals using a 2D array                         | CO-3       |
| **Meal Display**        | Displays the complete weekly meal plan                | CO-2, CO-3 |
| **Ingredient Mapping**  | Associates meals with required ingredients            | CO-1, CO-3 |
| **Grocery Generator**   | Calculates and displays the consolidated grocery list | CO-2, CO-3 |

---

## 🧩 Main Java Methods

The application is divided into separate methods for better organization:

### `main()`

Controls the overall execution of the program and displays the menu repeatedly until the user chooses Exit.

### `displayMenu()`

Displays the main menu options.

### `displayMeals()`

Displays the available meal choices.

### `createMealPlan()`

Allows the user to select meals for breakfast, lunch and dinner for all seven days and stores them in the 2D array.

### `viewMealPlan()`

Displays the complete weekly meal plan by reading data from the 2D array.

### `generateGroceryList()`

Processes the selected meals from the 2D array and calculates the required ingredients.

---

## 📊 Data Structure

The main meal plan is stored using:

```java
static String[][] mealPlan = new String[7][3];
```

### Why a 2D array?

A two-dimensional array is suitable because the application has two related dimensions:

* **Rows → Days**
* **Columns → Meal Types**

Therefore:

```text
7 days × 3 meals = 21 meal positions
```

Each position stores the selected meal for that particular day and meal type.

---

## 🍽️ Available Meals

The application currently provides the following meal options:

1. Eggs and Toast
2. Chicken Rice
3. Vegetable Pasta
4. Oatmeal
5. Dal Rice

Meal types:

* Breakfast
* Lunch
* Dinner

Days:

* Monday
* Tuesday
* Wednesday
* Thursday
* Friday
* Saturday
* Sunday

---

## 🛒 Grocery Generation

The grocery generator processes every selected meal in the 2D meal-plan array.

For example:

```text
Eggs and Toast
      ↓
Eggs + Bread

Chicken Rice
      ↓
Chicken + Rice

Vegetable Pasta
      ↓
Pasta + Vegetables

Oatmeal
      ↓
Oats + Milk

Dal Rice
      ↓
Dal + Rice
```

If the same ingredient is required by multiple meals, its quantity is accumulated.

For example, **Rice** can be required by both:

* Chicken Rice
* Dal Rice

The program combines their quantities into one grocery-list entry.

---

## 📸 Sample Outputs

### 1. Main Menu


<img width="332" height="351" alt="Screenshot 2026-10-05 090137" src="https://github.com/user-attachments/assets/8ff9f975-a3c6-4d3d-b49c-9e1c62a4d3cb" />

### 2. Day & Meal Selection

<img width="378" height="357" alt="Screenshot 2026-10-05 090202" src="https://github.com/user-attachments/assets/8fb7039a-ede1-46e3-943c-47d9bc075fad" />


### 3. Weekly Meal Plan

<img width="327" height="357" alt="Screenshot 2026-10-05 090219" src="https://github.com/user-attachments/assets/ec515710-8923-4d1e-a84b-a1c8b165f5a7" />


### 4. Grocery List


<img width="487" height="248" alt="Screenshot 2026-10-05 090232" src="https://github.com/user-attachments/assets/981f97bf-c762-44ac-9354-acf60a6a4213" />

### 5. Invalid Input Handling

<img width="417" height="248" alt="Screenshot 2026-10-05 090242" src="https://github.com/user-attachments/assets/5a5da5f6-bab1-4bdd-9993-0ff8c7e8bb59" />


---

## 🎓 CO Mapping

| Course Outcome | Concepts Demonstrated                             | Application                                              |
| -------------- | ------------------------------------------------- | -------------------------------------------------------- |
| **CO-1**       | Variables, data types, operators, Scanner and IPO | Accepts and processes day and meal selections            |
| **CO-2**       | if/else, switch, loops, break and continue        | Controls menus, validates choices and repeats operations |
| **CO-3**       | Methods, 2D arrays and array processing           | Stores the weekly meal plan and processes meal data      |

---

## 🚀 Future Enhancements

Future versions of the application can include:

* Graphical User Interface (GUI)
* Database connectivity
* Nutritional information
* Budget estimation
* User accounts
* Personalized meal recommendations
* More meal choices
* Custom user-created meals

---

## 🧪 Testing & Validation

The application handles different user inputs and checks whether selected options are valid.

### Valid Input

The program accepts menu choices from **1 to 4** and meal selections from the available meal list.

### Invalid Main Menu Input

If the user enters a value other than 1–4:

```text
Invalid choice! Please enter 1-4.
```

### Invalid Meal Input

If the user selects a meal number outside the available range:

```text
Invalid meal number!
```

The program then allows the user to enter the meal selection again.

---

## ✅ Conclusion

The **Weekly Meal Planner & Grocery Generator** is a practical Java console application that combines weekly meal scheduling and grocery preparation into one system.

The project demonstrates how fundamental Java programming concepts can be applied to solve a real-world problem. It uses **input handling, decision-making, loops, methods and two-dimensional arrays** to create and manage a weekly meal plan.

The use of a **2D array** provides a clear structure for representing the seven days and three meal types. The grocery generation feature further demonstrates how stored data can be processed to produce a useful real-world result.

The application also provides a foundation for future development through features such as GUI, database connectivity, nutrition information and budget management.
