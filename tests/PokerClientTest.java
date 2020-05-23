import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @Test
    public void testHighestCardIsMine(){
        PokerClient pokerClient = new PokerClient("s3", "h4", "s5", "d6", "sj");
        assertTrue(pokerClient.highestCardIsMine("s2", "d3", "c2", "c5", "h2"));
    }

    @Test
    public void testHighestCardIsMineIsFalse(){
        PokerClient pokerClient = new PokerClient("s3", "h4", "s5", "d6", "d3");
        assertTrue(pokerClient.highestCardIsMine("s2", "d3", "c2", "c5", "h2"));
    }

}