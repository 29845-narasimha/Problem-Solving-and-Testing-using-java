import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair1 = new String[t];
        String[] pair2 = new String[t];

        for (int i = 0; i < t; i++) {
            pair1[i] = s.next();
            pair2[i] = s.next();
        }

        // Write your code here
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            // Combine the pair with a space delimiter and add to the set
            set.add(pair1[i] + " " + pair2[i]);
            // Print the current number of unique pairs
            System.out.println(set.size());
        }
    }
}
