public class GenGemReward implements GenItem{

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }

}
