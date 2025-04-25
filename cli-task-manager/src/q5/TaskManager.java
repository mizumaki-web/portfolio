package q5;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title){
        tasks.add(new Task(title));
    }
    public void showTasks(){
        for(Task task: tasks){
            System.out.println(task.getTitle()+"-"+(task.isDone() ? "完了" : "未完了"));
        }
    }
    public void completeTask(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.get(index).complete();
            System.out.println("タスク"+tasks.get(index).getTitle()+"を完了しました。");
        }else {
            System.out.println("無効なタスク番号です");
        }
    }
}
