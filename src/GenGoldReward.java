public class GenGoldReward implements GenItem {
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
