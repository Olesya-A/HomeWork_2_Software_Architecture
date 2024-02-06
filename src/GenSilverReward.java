public class GenSilverReward implements GenItem{

    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }

}
