import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<GenItem> fabricList = new ArrayList<>();

        fabricList.add(new GenGoldReward());
        fabricList.add(new GenGemReward());
        fabricList.add(new GenSilverReward());

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt() % fabricList.size());
            IGameItem fabric = fabricList.get(index).createItem();
            fabric.open();
        }
    }
}
