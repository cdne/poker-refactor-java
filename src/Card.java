import java.util.HashMap;
import java.util.Map;

public class Card {

    String cardCode;

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;
        String cardValue = cardCode.substring(1).toUpperCase();
        String cardColor = this.cardCode.substring(0, 1).toUpperCase();
        Map<String, Integer> alphabeticCardValue = new HashMap<>();
        int intCardValue;

        if (!cardColor.contentEquals("S") &&
                !cardColor.contentEquals("C") &&
                !cardColor.contentEquals("D") &&
                !cardColor.contentEquals("H")) {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if (alphabeticCardValue.get(cardValue) == null) {
            // raises exception if cardValue is a letter, but not J/Q/K/A
            intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10 || intCardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }
        }
    }

    public int getValue() {
        Map<String, Integer> alphabeticCardValue = new HashMap<>();
        String cardValue = cardCode.substring(1).toUpperCase();

        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if (alphabeticCardValue.get(cardValue) == null) {
            return Integer.parseInt(cardValue);
        }
        return 0;
    }
}
