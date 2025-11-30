package edu.pitt.se;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergyBasic() {
        String result = PlaylistRecommender.classifyEnergy(Arrays.asList(150, 145, 155));
        assertEquals("HIGH", result);
    }

    @Test
    void testValidTrackTitleSimple() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Morning Light"));
    }

    @Test
    void testNormalizeVolumeClamping() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-5));
    }
}
