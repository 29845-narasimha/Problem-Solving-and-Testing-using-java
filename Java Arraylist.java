import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        List<List<Integer>> rows = new ArrayList<>();
        
        // Read each line into a nested ArrayList
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(scan.nextInt());
            }
            rows.add(row);
        }
        
        // Process queries
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            try {
                // Convert 1-based indexing to 0-based indexing and print the element
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                // Print ERROR! if the line or position doesn't exist
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}
