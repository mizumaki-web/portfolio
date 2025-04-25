import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        for(int i = 0; i < args.length ; i++) {
            Task task = new Task(args[i]);
            manager.addTask(args[i]);
        }
        manager.showTasks();

        while (true) {
            System.out.print("完了するタスクの番号を入力（-1で終了）: ");
            int index = scanner.nextInt();
            if (index == -1) {
                break;
            }
            manager.completeTask(index);
            manager.showTasks();
        }
    }
}
