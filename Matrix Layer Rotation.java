import java.io.*;
import java.util.*;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = cols - 1 - layer;

            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                elements.add(matrix.get(top).get(j));
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                elements.add(matrix.get(i).get(right));
            }

            // Bottom row: right-1 -> left
            for (int j = right - 1; j >= left; j--) {
                elements.add(matrix.get(bottom).get(j));
            }

            // Left column: bottom-1 -> top+1
            for (int i = bottom - 1; i > top; i--) {
                elements.add(matrix.get(i).get(left));
            }

            // Number of actual rotations needed
            int rotate = r % elements.size();

            // Anti-clockwise rotation
            Collections.rotate(elements, -rotate);

            int index = 0;

            // Put back into top row
            for (int j = left; j <= right; j++) {
                matrix.get(top).set(j, elements.get(index++));
            }

            // Put back into right column
            for (int i = top + 1; i <= bottom; i++) {
                matrix.get(i).set(right, elements.get(index++));
            }

            // Put back into bottom row
            for (int j = right - 1; j >= left; j--) {
                matrix.get(bottom).set(j, elements.get(index++));
            }

            // Put back into left column
            for (int i = bottom - 1; i > top; i--) {
                matrix.get(i).set(left, elements.get(index++));
            }
        }

        // Print matrix
        for (List<Integer> row : matrix) {
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j));

                if (j < row.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().trim().split(" ");

        int rows = Integer.parseInt(firstLine[0]);
        int cols = Integer.parseInt(firstLine[1]);
        int r = Integer.parseInt(firstLine[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < rows; i++) {

            String[] values = br.readLine().trim().split(" ");

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                row.add(Integer.parseInt(values[j]));
            }

            matrix.add(row);
        }

        Result.matrixRotation(matrix, r);

        br.close();
    }
}
