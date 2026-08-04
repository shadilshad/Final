package DSA;
import java.util.*;
public class GridTraversal {

    static int rows, cols;

    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, 1, 0, -1};

    // DFS Method
    static void dfs(int[][] grid, boolean[][] visited, int row, int col) {

        visited[row][col] = true;
        System.out.println("Visited: (" + row + "," + col + ")");

        for (int i = 0; i < 4; i++) {

            int newRow = row + dRow[i];
            int newCol = col + dCol[i];

            if (isValid(newRow, newCol, visited)) {
                dfs(grid, visited, newRow, newCol);
            }
        }
    }
    static void bfs(int[][] grid, boolean[][] visited, int startRow, int startCol) {

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];

            System.out.println("Visited: (" + row + "," + col + ")");

            for (int i = 0; i < 4; i++) {

                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                if (isValid(newRow, newCol, visited)) {

                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }


    static boolean isValid(int row, int col, boolean[][] visited) {

        return row >= 0 &&
               row < rows &&
               col >= 0 &&
               col < cols &&
               !visited[row][col];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] grid = new int[rows][cols];

        System.out.println("Enter matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // DFS
        boolean[][] visitedDFS = new boolean[rows][cols];

        System.out.println("\nDFS Traversal:");
        dfs(grid, visitedDFS, 0, 0);

        // BFS
        boolean[][] visitedBFS = new boolean[rows][cols];

        System.out.println("\nBFS Traversal:");
        bfs(grid, visitedBFS, 0, 0);

        sc.close();
    }
}