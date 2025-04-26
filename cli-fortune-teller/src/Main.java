import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(100); //0~99の乱数

        Fortune fortune = new Fortune();
        fortune.setLuck(randomValue);

        LuckyItem luckyItem = new LuckyItem();
        String item = luckyItem.getRandItem();


        System.out.println("今日の運勢は" + fortune.getLuck() + "です！");
        System.out.println("今日のラッキーアイテムは" + item + "です！");
    }
}
