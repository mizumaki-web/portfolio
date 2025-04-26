import java.util.Random;

public class LuckyItem {
    private String[] items = {
            "手帳",
            "飲食店の季節限定メニュー",
            "新しい歯ブラシ",
            "最近着ていない服"
    };

    public String getRandItem(){
        Random random = new Random();
        int index = random.nextInt(items.length); //(item数)の中からランダムな数字を出す
        return items[index];
    }
}
