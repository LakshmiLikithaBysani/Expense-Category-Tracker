import java.util.Scanner;

public class ExpenseCategoryTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] categories = {
            "Food",
            "Travel",
            "Shopping",
            "Education",
            "Other"
        };

        double[] expenses = new double[5];

        while (true) {

            System.out.println("\n--- Expense Category Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Category Expenses");
            System.out.println("3. View Total Expense");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nCategories:");

                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i]);
                    }

                    System.out.print("Select category: ");
                    int category = sc.nextInt();

                    if (category >= 1 && category <= categories.length) {

                        System.out.print("Enter expense amount: ");
                        double amount = sc.nextDouble();

                        expenses[category - 1] =
                                expenses[category - 1] + amount;

                        System.out.println("Expense added successfully!");

                    } else {
                        System.out.println("Invalid category!");
                    }

                    break;

                case 2:

                    System.out.println("\n--- Category Expenses ---");

                    for (int i = 0; i < categories.length; i++) {

                        System.out.println(
                            categories[i] + " : ₹" + expenses[i]
                        );
                    }

                    break;

                case 3:

                    double total = 0;

                    for (double expense : expenses) {
                        total = total + expense;
                    }

                    System.out.println("Total Expense: ₹" + total);

                    break;

                case 4:

                    System.out.println(
                        "Thank you for using Expense Category Tracker!"
                    );

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}
