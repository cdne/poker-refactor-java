import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class CardTest {


    @ParameterizedTest
    @ValueSource(strings = {"asdasd", "23912931", " ", "sdja2333", "ddss", "\n", "\t"})
    public void testIllegalArgumentExceptionWhenCardIsInvalid(String invalidCard) {
        assertThrows(IllegalArgumentException.class, () -> new Card(invalidCard));
    }

    @ParameterizedTest
    @ValueSource(strings = {"s4", "h5", "d2", "c3"})
    public void testCardIsValid(String validCard) {
        Card card = new Card(validCard);
        assertTrue(card.cardCode.contains(validCard));
    }

    @ParameterizedTest
    @ValueSource(strings = {"s11", "h1", "d44", "c21"})
    public void testIllegalArgumentExceptionWhenNumberIsInvalid(String invalidCard) {
        assertThrows(IllegalArgumentException.class, () -> new Card(invalidCard));
    }

    @Test
    public void testShouldReturnRightValue() {
        assertEquals(4, new Card("s4").getValue());
    }
}