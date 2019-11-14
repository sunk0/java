package p03;

public class Card implements Comparable<Card>{
    private RankPowers rankPower;
    private SuitPowers suitPower;

    public Card(RankPowers rankPower, SuitPowers suitPower) {
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }

    public RankPowers getRankPower() {
        return rankPower;
    }

    public SuitPowers getSuitPower() {
        return suitPower;
    }

    public int getPower(){
        return this.rankPower.getValue() + this.suitPower.getValue();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %s",this.rankPower,this.suitPower,getPower());
    }

    @Override
    public int compareTo(Card card) {
        return this.getPower() - card.getPower();
    }
}
