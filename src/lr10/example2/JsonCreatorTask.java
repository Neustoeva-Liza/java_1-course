package lr10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreatorTask {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("title", "Уборка");
        task1.put("date", "24.03.2026");
        task1.put("description", "Влажная уборка");

        JSONObject task2 = new JSONObject();
        task2.put("title", "Домашняя работа");
        task2.put("date", "26.03.2026");
        task2.put("description", "Английский, математика");

        tasks.add(task1);
        tasks.add(task2);

        library.put("tasks", tasks);

        try (FileWriter file = new FileWriter("src/lr10/example2/task-json.json")) {
            file.write(library.toJSONString());
            System.out.println("JSON файн успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
