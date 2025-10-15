import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Proj2 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: java Proj2 <input file> <number of lines>");
            System.exit(1);
        }

        String inputFileName = args[0];
        int numLines = Integer.parseInt(args[1]);

        // Read data from the CSV file into an ArrayList of Car objects
        ArrayList<Car> cars = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream(inputFileName);
             Scanner scanner = new Scanner(inputStream)) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Skip header
            }
            for (int i = 0; i < numLines && scanner.hasNextLine(); i++) {
                String line = scanner.nextLine();
                Car car = Car.fromCsvRow(line);
                if (car != null) {
                    cars.add(car);
                }
            }
        }

        // Create sorted and randomized ArrayLists
        ArrayList<Car> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);

        ArrayList<Car> randomizedCars = new ArrayList<>(cars);
        Collections.shuffle(randomizedCars);

        // --- Time Insertion ---

        // BST with sorted data
        BST<Car> bstSorted = new BST<>();
        long startTime = System.nanoTime();
        for (Car car : sortedCars) {
            bstSorted.insert(car);
        }
        long bstSortedInsertTime = System.nanoTime() - startTime;

        // AVL with sorted data
        AvlTree<Car> avlSorted = new AvlTree<>();
        startTime = System.nanoTime();
        for (Car car : sortedCars) {
            avlSorted.insert(car);
        }
        long avlSortedInsertTime = System.nanoTime() - startTime;

        // BST with randomized data
        BST<Car> bstRandom = new BST<>();
        startTime = System.nanoTime();
        for (Car car : randomizedCars) {
            bstRandom.insert(car);
        }
        long bstRandomInsertTime = System.nanoTime() - startTime;

        // AVL with randomized data
        AvlTree<Car> avlRandom = new AvlTree<>();
        startTime = System.nanoTime();
        for (Car car : randomizedCars) {
            avlRandom.insert(car);
        }
        long avlRandomInsertTime = System.nanoTime() - startTime;

        // --- Time Search ---

        // BST with sorted data
        startTime = System.nanoTime();
        for (Car car : cars) {
            bstSorted.contains(car);
        }
        long bstSortedSearchTime = System.nanoTime() - startTime;

        // AVL with sorted data
        startTime = System.nanoTime();
        for (Car car : cars) {
            avlSorted.contains(car);
        }
        long avlSortedSearchTime = System.nanoTime() - startTime;

        // BST with randomized data
        startTime = System.nanoTime();
        for (Car car : cars) {
            bstRandom.contains(car);
        }
        long bstRandomSearchTime = System.nanoTime() - startTime;

        // AVL with randomized data
        startTime = System.nanoTime();
        for (Car car : cars) {
            avlRandom.contains(car);
        }
        long avlRandomSearchTime = System.nanoTime() - startTime;

        // --- Print Results ---

        System.out.println("Number of lines: " + numLines);
        System.out.println("--- Insertion Times (nanoseconds) ---");
        System.out.println("BST (sorted): " + bstSortedInsertTime);
        System.out.println("AVL (sorted): " + avlSortedInsertTime);
        System.out.println("BST (random): " + bstRandomInsertTime);
        System.out.println("AVL (random): " + avlRandomInsertTime);
        System.out.println("--- Search Times (nanoseconds) ---");
        System.out.println("BST (sorted): " + bstSortedSearchTime);
        System.out.println("AVL (sorted): " + avlSortedSearchTime);
        System.out.println("BST (random): " + bstRandomSearchTime);
        System.out.println("AVL (random): " + avlRandomSearchTime);

        // --- Append to output.txt ---

        try (FileWriter fw = new FileWriter("output.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(numLines + "," +
                    bstSortedInsertTime + "," + avlSortedInsertTime + "," +
                    bstRandomInsertTime + "," + avlRandomInsertTime + "," +
                    bstSortedSearchTime + "," + avlSortedSearchTime + "," +
                    bstRandomSearchTime + "," + avlRandomSearchTime);
        }
    }
}
