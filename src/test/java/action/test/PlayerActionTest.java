package action.test;

import action.PlayerAction;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerActionTest {
    @Test
    public final void testEnum()  {
        assertEquals(PlayerAction.DOUBLE_DOWN, PlayerAction.valueOf("DOUBLE_DOWN"));
        assertEquals(PlayerAction.HIT, PlayerAction.valueOf("HIT"));
        assertEquals(PlayerAction.SPLIT, PlayerAction.valueOf("SPLIT"));
        assertEquals(PlayerAction.STAND, PlayerAction.valueOf("STAND"));
    }
}