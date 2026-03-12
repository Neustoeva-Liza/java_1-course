package timus;

import java.util.*;

public class Task_1106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.trim().split("\\s+");
            for (String p : parts) {
                int friend = Integer.parseInt(p);
                if (friend == 0) break;
                graph[i].add(friend);
            }
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        for (int start = 1; start <= n; start++) {
            if (color[start] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(start);
                color[start] = 0;
                while (!queue.isEmpty()) {
                    int v = queue.poll();
                    for (int u : graph[v]) {
                        if (color[u] == -1) {
                            color[u] = 1 - color[v];
                            queue.add(u);
                        }
                    }
                }
            }
        }

        List<Integer> team0 = new ArrayList<>();
        List<Integer> team1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (color[i] == 0) team0.add(i);
            else team1.add(i);
        }

        if (team0.isEmpty() || team1.isEmpty()) {
            System.out.println(0);
            return;
        }

        System.out.println(team0.size());
        for (int i = 0; i < team0.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(team0.get(i));
        }
        System.out.println();
    }
}
