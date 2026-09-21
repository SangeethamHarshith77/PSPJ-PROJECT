import java.util.Scanner;

public class WeeklyMealPlannerGroceryGenerator{

    static Scanner sc = new Scanner(System.in);

    // CO-3: 1D Array - Days of the Week
    static String[] days = {
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    };

    // CO-3: 1D Array - Meal Types
    static String[] mealTypes = {
        "Breakfast", "Lunch", "Dinner"
    };

    // CO-3: 1D Array - Available Meals
    static String[] meals = {
        "Eggs and Toast",
        "Chicken Rice",
        "Vegetable Pasta",
        "Oatmeal",
        "Dal Rice"
    };

    // CO-3: Single 1D Array
    // 7 days x 3 meals = 21
    static String[] mealPlan = new String[21];


    public static void main(String[] args) {

        int choice;

        do {

            displayMenu();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createMealPlan();
                    break;

                case 2:
                    viewMealPlan();
                    break;

                case 3:
                    generateGroceryList();
                    break;

                case 4:
                    System.out.println("\nThank you for using Weekly Meal Planner!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please enter 1-4.");

            }

        } while (choice != 4);

        sc.close();
    }


    // CO-3: Method
    public static void displayMenu() {

        System.out.println("\n==================================");
        System.out.println("       WEEKLY MEAL PLANNER");
        System.out.println("==================================");
        System.out.println("1. Create Meal Plan");
        System.out.println("2. View Meal Plan");
        System.out.println("3. Generate Grocery List");
        System.out.println("4. Exit");
        System.out.println("==================================");

    }


    // CO-3: Method
    public static void displayMeals() {

        System.out.println("\nAvailable Meals:");

        for (int i = 0; i < meals.length; i++) {

            System.out.println((i + 1) + ". " + meals[i]);

        }
    }


    // CO-3: Method
    public static void createMealPlan() {

        System.out.println("\n==================================");
        System.out.println("         CREATE MEAL PLAN");
        System.out.println("==================================");

        // CO-2: Nested for loops
        for (int day = 0; day < days.length; day++) {

            System.out.println("\n--- " + days[day] + " ---");

            for (int meal = 0; meal < mealTypes.length; meal++) {

                System.out.println("\nSelect " + mealTypes[meal] + ":");

                displayMeals();

                System.out.print("Enter meal number: ");
                int selectedMeal = sc.nextInt();

                if (selectedMeal >= 1 && selectedMeal <= meals.length) {

                    // Convert day and meal position into 1D index
                    int index = day * 3 + meal;

                    mealPlan[index] = meals[selectedMeal - 1];

                } else {

                    System.out.println("Invalid meal number!");
                    meal--;

                }
            }
        }

        System.out.println("\nMeal plan created successfully!");

    }


    // CO-3: Method
    public static void viewMealPlan() {

        System.out.println("\n==================================");
        System.out.println("       YOUR WEEKLY MEAL PLAN");
        System.out.println("==================================");

        for (int day = 0; day < days.length; day++) {

            System.out.println("\n" + days[day]);

            for (int meal = 0; meal < mealTypes.length; meal++) {

                int index = day * 3 + meal;

                if (mealPlan[index] == null) {

                    System.out.println(
                        mealTypes[meal] + ": Not Selected"
                    );

                } else {

                    System.out.println(
                        mealTypes[meal] + ": " + mealPlan[index]
                    );
                }
            }
        }
    }


    // CO-3: Method
    public static void generateGroceryList() {

        int eggs = 0;
        int bread = 0;
        int chicken = 0;
        int rice = 0;
        int pasta = 0;
        int vegetables = 0;
        int oats = 0;
        int milk = 0;
        int dal = 0;

        // CO-2: for loop
        for (int i = 0; i < mealPlan.length; i++) {

            String selectedMeal = mealPlan[i];

            if (selectedMeal == null) {

                continue;

            }

            else if (selectedMeal.equals("Eggs and Toast")) {

                eggs = eggs + 2;
                bread = bread + 2;

            }

            else if (selectedMeal.equals("Chicken Rice")) {

                chicken = chicken + 200;
                rice = rice + 100;

            }

            else if (selectedMeal.equals("Vegetable Pasta")) {

                pasta = pasta + 100;
                vegetables = vegetables + 100;

            }

            else if (selectedMeal.equals("Oatmeal")) {

                oats = oats + 50;
                milk = milk + 200;

            }

            else if (selectedMeal.equals("Dal Rice")) {

                dal = dal + 100;
                rice = rice + 100;

            }
        }


        System.out.println("\n==================================");
        System.out.println("          GROCERY LIST");
        System.out.println("==================================");

        if (eggs > 0)
            System.out.println("Eggs: " + eggs + " pieces");

        if (bread > 0)
            System.out.println("Bread: " + bread + " slices");

        if (chicken > 0)
            System.out.println("Chicken: " + chicken + " grams");

        if (rice > 0)
            System.out.println("Rice: " + rice + " grams");

        if (pasta > 0)
            System.out.println("Pasta: " + pasta + " grams");

        if (vegetables > 0)
            System.out.println("Vegetables: " + vegetables + " grams");

        if (oats > 0)
            System.out.println("Oats: " + oats + " grams");

        if (milk > 0)
            System.out.println("Milk: " + milk + " ml");

        if (dal > 0)
            System.out.println("Dal: " + dal + " grams");

        System.out.println("==================================");
        System.out.println("Grocery list generated successfully!");

    }
}