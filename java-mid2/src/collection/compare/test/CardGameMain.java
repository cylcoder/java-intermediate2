package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        Deck deck = new Deck();

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        /*
        * winner를 변수만 선언한 뒤 그 아래에 winner가 누구인지 판단하는 코드를 적는 것보다
        * 메서드로 뽑아서 변수를 선언하는 순간 값이 할당되도록 구현하는 것을 권장한다.
        * 변수만 미리 선언하고 나중에 값을 대입하면 이 값이 언제 할당되는지를 한참 봐야하기 때문이다.
        * */
        Player winner = getWinner(player1, player2);
        System.out.println(winner == null ? "무승부" : winner.getName() + " 승리");
    }

    private static Player getWinner(Player player1, Player player2) {
        if (player1.rankSum() == player2.rankSum()) {
            return null;
        }

        return player1.rankSum() > player2.rankSum() ? player1 : player2;
    }

}
