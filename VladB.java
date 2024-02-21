import java.util.Scanner;

public class VladB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[n][n];
            for (int j = 0; j < n; j++) {
                grid[j] = sc.nextLine().toCharArray();
            }
            String result = poly(grid);
            System.out.println(result);
        }
    }

    private static String poly(char[][] grid) {
        boolean sq = true;
//        boolean isTriangle = true;
        int n = grid.length;
        int fr = -1;
        int lr = -1;
        int fc = -1;
        int lc = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    if (fr == -1) {
                        fr = i;
                    }
                    lr = i;
                    if (fc == -1 || j < fc) {
                        fc = j;
                    }
                    if (j > lc) {
                        lc = j;
                    }
                }
            }
        }

     //square
        for (int i = fr; i <= lr; i++) {
            for (int j = fc; j <= lc; j++) {
                if (grid[i][j] == '0') {
                    sq = false;
                    break;
                }
            }
            if (!sq) {
                break;
            }
        }
        if (sq == true) {
            return "SQUARE";
        } else {
            return "TRIANGLE";
        }
    }
}
