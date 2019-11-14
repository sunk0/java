package p03;
@Annotations(type = "Enumeration",category = "Suit",description = "Provides suit constants for a Card class.")
public enum SuitPowers {
    CLUBS (0), DIAMONDS (13), HEARTS (26), SPADES (39);

    private int value;

    SuitPowers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
