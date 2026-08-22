import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        // Maximum subarray sum - Kadane's Algorithm
        int currentSum = arr.get(0);
        int maxSubarray = arr.get(0);

        // Maximum subsequence sum
        int maxSubsequence = arr.get(0);
        int positiveSum = 0;

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            // Kadane's algorithm
            currentSum = Math.max(value, currentSum + value);
            maxSubarray = Math.max(maxSubarray, currentSum);

            // For subsequence
            if (value > 0) {
                positiveSum += value;
            }

            maxSubsequence = Math.max(maxSubsequence, value);
        }

        // If there are positive numbers, take all positive numbers.
        // Otherwise, take the largest negative number.
        if (positiveSum > 0) {
            maxSubsequence = positiveSum;
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxSubarray);
        result.add(maxSubsequence);

        return result;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            String[] input = br.readLine().trim().split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(input[i]));
            }

            List<Integer> result = Result.maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }
    }
}
