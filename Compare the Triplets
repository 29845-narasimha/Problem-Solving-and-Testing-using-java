import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0, bob = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) alice++;
            else if (a.get(i) < b.get(i)) bob++;
        }

        return Arrays.asList(alice, bob);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] aTemp = br.readLine().split(" ");
        String[] bTemp = br.readLine().split(" ");

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(Integer.parseInt(aTemp[i]));
            b.add(Integer.parseInt(bTemp[i]));
        }

        List<Integer> result = Result.compareTriplets(a, b);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
