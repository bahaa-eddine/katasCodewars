import com.kata.craftmanship.DisemvowelTrollsKata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisemvowelTrollsTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", DisemvowelTrollsKata.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrollsKata.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", DisemvowelTrollsKata.disemvowel("What are you, a communist?"));
    }
}