public class Fortune {
    private String luck;

    public void setLuck(int rand) {
        if(rand > 80) luck  = "大吉";
        else if(rand > 50) luck = "中吉";
        else if(rand > 30) luck = "小吉";
        else luck = "凶";
    }

    public String getLuck() {
        return luck;
    }
}
