package q5;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title){
        tasks.add(new Task(title));
    }
    public void showTasks(){
        for(int i = 0; i < tasks.size(); i++){
            Task task = tasks.get(i);
            String status = task.isDone() ? "完了" : "未完了";
            System.out.println((i + 1) + ":" + task.getTitle() + "-" + status);
        }
    }
    public void completeTask(int userInputIndex){
        int index = userInputIndex - 1; //添え字を0に戻す

        if(index >= 0 && index < tasks.size()){
            tasks.get(index).complete();
            System.out.println("タスク"+tasks.get(index).getTitle()+"を完了しました。");
        }else {
            System.out.println("無効なタスク番号です。１から");
        }
    }
}
