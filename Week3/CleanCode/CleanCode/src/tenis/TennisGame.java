package tenis;

public class TennisGame {
    private static final int LOVE_SCORE = 0;
    private static final int FIFTEEN_SCORE = 1;
    private static final int THIRTY_SCORE = 2;
    private static final int FORTY_SCORE = 3;

    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";

    private static final String TIE_SCORE_PREFIX = "-All";
    private static final String DEUCE_SCORE = "Deuce";
    private static final String ADVANTAGE_SCORE_PREFIX = "Advantage ";
    private static final String WIN_SCORE_PREFIX = "Win for ";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case LOVE_SCORE:
                    score = LOVE + TIE_SCORE_PREFIX;
                    break;
                case FIFTEEN_SCORE:
                    score = FIFTEEN + TIE_SCORE_PREFIX;
                    break;
                case THIRTY_SCORE:
                    score = THIRTY + TIE_SCORE_PREFIX;
                    break;
                case FORTY_SCORE:
                    score = FORTY + TIE_SCORE_PREFIX;
                    break;
                default:
                    score = DEUCE_SCORE;
                    break;

            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) score = ADVANTAGE_SCORE_PREFIX + "player1";
            else if (minusResult == -1) score = ADVANTAGE_SCORE_PREFIX + "player2";
            else if (minusResult >= 2) score = WIN_SCORE_PREFIX + "player1";
            else score = WIN_SCORE_PREFIX + "player2";
        } else {
            for (int i = FIFTEEN_SCORE; i < FORTY_SCORE; i++) {
                if (i == FIFTEEN_SCORE) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case LOVE_SCORE:
                        score += LOVE;
                        break;
                    case FIFTEEN_SCORE:
                        score += FIFTEEN;
                        break;
                    case THIRTY_SCORE:
                        score += THIRTY;
                        break;
                    case FORTY_SCORE:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}
