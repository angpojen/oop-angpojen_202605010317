
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // Add 3 tasks
        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = input.nextLine();
            tasks.add(task);
        }

        // Display tasks
        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save tasks to file
        try {
            FileWriter writer = new FileWriter("task.txt");

            for (String task : tasks) {
                writer.write(task + "\n");
            }

            writer.close();

            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Read tasks from file
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        try {
            File file = new File("task.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
