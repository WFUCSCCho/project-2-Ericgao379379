import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Proj2 {
    public static void main(String[] args) throws IOException {
        // Use command line arguments to specify the input file
        if (args.length != 2) {
            System.err.println("Usage: java TestAvl <input file> <number of lines>");
            System.exit(1);
        }

        String inputFileName = args[0];
        int numLines = Integer.parseInt(args[1]);

        // For file input
        FileInputStream inputFileNameStream = null;
        Scanner inputFileNameScanner = null;

        // Open the input file
        inputFileNameStream = new FileInputStream(inputFileName);
        inputFileNameScanner = new Scanner(inputFileNameStream);

        // ignore first line
        inputFileNameScanner.nextLine();

        // Create an AVL tree
        AvlTree<String> avlTree = new AvlTree<>();

        // Read lines from the input file and insert into the AVL tree
        for (int i = 0; i < numLines && inputFileNameScanner.hasNextLine(); i++) {
            String line = inputFileNameScanner.nextLine();
            // Split the line into columns, the first column is the name
            String[] columns = line.split(",");
            if (columns.length > 0) {
                avlTree.insert(columns[0]);
            }
        }

        // Close the file scanner
        inputFileNameScanner.close();

        // Print the tree
        avlTree.printTree();
    }
}
