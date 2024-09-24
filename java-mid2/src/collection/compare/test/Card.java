package collection.compare.test;

public class Card implements Comparable<Card> {

    private final Suit suit;
    private final int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank) {
            return this.rank - anotherCard.rank;
        }
        return this.suit.compareTo(anotherCard.suit);

        /*
        * Enum 타입의 클래스 생성시 암시적으로 Enum 클래스를 상속한다.
        * public enum Suit extensd Enum { ... }
        * Enum 클래스는 Comparable을 implements하고 있다.
        * 따라서 이미 compareTo()를 구현해놓았다.
        * 이 때 비교의 기준은 ordinal이 된다.
        * */

    }

    @Override
    public String toString() {
        return String.format("%d(%s)", rank, suit.getIcon());
    }

}
