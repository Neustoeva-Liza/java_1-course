package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_2002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, User> users = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String cmd = parts[0];

            if (cmd.equals("register")) {
                String username = parts[1];
                String password = parts[2];
                if (users.containsKey(username)) {
                    System.out.println("fail: user already exists");
                } else {
                    users.put(username, new User(password, false));
                    System.out.println("success: new user added");
                }
            } else if (cmd.equals("login")) {
                String username = parts[1];
                String password = parts[2];
                User user = users.get(username);
                if (user == null) {
                    System.out.println("fail: no such user");
                } else if (!user.password.equals(password)) {
                    System.out.println("fail: incorrect password");
                } else if (user.loggedIn) {
                    System.out.println("fail: already logged in");
                } else {
                    user.loggedIn = true;
                    System.out.println("success: user logged in");
                }
            } else if (cmd.equals("logout")) {
                String username = parts[1];
                User user = users.get(username);
                if (user == null) {
                    System.out.println("fail: no such user");
                } else if (!user.loggedIn) {
                    System.out.println("fail: already logged out");
                } else {
                    user.loggedIn = false;
                    System.out.println("success: user logged out");
                }
            }
        }
    }

    static class User {
        String password;
        boolean loggedIn;
        User(String password, boolean loggedIn) {
            this.password = password;
            this.loggedIn = loggedIn;
        }
    }
}
