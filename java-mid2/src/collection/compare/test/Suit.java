package collection.compare.test;

public enum Suit {

    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private final String icon;

    public String getIcon() {
        return icon;
    }

    Suit(String icon) {
        this.icon = icon;
    }

}
