/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void PlayerTest(){
        Player player = new Player("Felix", "Human","Red");

        assertEquals("Felix", player.getName());
        assertEquals("Human", player.getRace());
        assertEquals("Red", player.getColor());
    }
}
