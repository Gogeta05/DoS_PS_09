import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Martin on 14.12.2014.
 */
public class GradleTest {
    @Test
    public static void testGradleSplitter() {
        Gradle g = new Gradle();
        int test = g.gradleSplitter();
        assertEquals(0, test);
    }
}
