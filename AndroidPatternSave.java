import java.io.FileWriter;
import java.io.IOException;

public class AndroidPatternSave {

    static int[][] skip = new int[10][10];
    static boolean[] visited = new boolean[10];
    static FileWriter writer;

    public static void main(String[] args) throws IOException {

        writer = new FileWriter("patterns.txt");

       
        skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[9][1] = 5;
        skip[3][7] = skip[7][3] = 5;
        skip[4][6] = skip[6][4] = 5;
        skip[2][8] = skip[8][2] = 5;

        for (int i = 1; i <= 9; i++) {
            dfs(i, "" + i);
        }

        writer.close();
        System.out.println("All patterns saved in patterns.txt ✅");
    }

    static void dfs(int current, String path) throws IOException {

        visited[current] = true;

        if (path.length() >= 4) {
            writer.write(path + "\n");
        }

        for (int next = 1; next <= 9; next++) {

            if (!visited[next] &&
               (skip[current][next] == 0 || visited[skip[current][next]])) {

                dfs(next, path + next);
            }
        }

        visited[current] = false;
    }
}