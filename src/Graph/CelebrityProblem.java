package Graph;

import java.util.Scanner;

public class CelebrityProblem {

    int v, visited[], m[][];

    void create_graph(int nodes) {
        v = nodes;
        Scanner sc = new Scanner(System.in);
        m = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.println("Enter value of v" + i + "to v" + j + " (999 for  infinity");
                m[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    int findcelebrity(int n) {
        if (n == 0) {
            return -1;
        }
        int id = findcelebrity(n - 1);
        if (id == -1) {
            return n - 1;
        } else if (m[id][n - 1] == 1) {
            return n - 1;
        } else if (m[n - 1][id] == 1) {
            return id;
        }
        return -1;
    }

    public static void main(String[] args) {
        CelebrityProblem obj = new CelebrityProblem();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = input.nextInt();
        obj.create_graph(n);
        System.out.println("Celebrity is found[0-" + (n - 1) + "]: ");
        System.out.println(obj.findcelebrity(n));
        input.close();
    }
}
