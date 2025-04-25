package q5;

public class Task {
    private String title;
    private boolean isDone;

    public Task(String title){
        this.title = title;
        this.isDone = false;
    }
    public void complete(){
        this.isDone = true;
    }
    public String getTitle(){
        return title;
    }
    public boolean isDone(){
        return  isDone;
    }
}
