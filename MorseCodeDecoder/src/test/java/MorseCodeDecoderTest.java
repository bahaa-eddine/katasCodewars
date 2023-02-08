import com.kata.craftmanship.MorseCodeDecoderKata;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoderKata.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
