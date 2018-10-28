package analyze.test;

import action.PlayerAction;
import analyze.PlayerActionAnalyzerResult;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerActionAnalyzerResultTest {
    private final PlayerAction expectedAction = PlayerAction.SPLIT;
    private final PlayerAction action = PlayerAction.HIT;
    private final String description = "fooDescription";

    private final PlayerActionAnalyzerResult result = new PlayerActionAnalyzerResult(
            expectedAction,
            action,
            description);

    @Test
    public void testConstructor() {
        assertSame(expectedAction, result.expectedAction);
        assertSame(action, result.actualAction);
        assertSame(description, result.description);
    }

    @Test
    public void testToString() {
        assertEquals("ExpectedAction:SPLIT;ActualAction:HIT;Description:fooDescription", result.toString());
    }
}