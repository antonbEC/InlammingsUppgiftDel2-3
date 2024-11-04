package InlammningProgramDel2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestKlass {

    // Testar att räkna rader, tecken och ord
    @Test
    public void testRäknarRaderTeckenOchOrd() {
        LogikKlass logik = new LogikKlass();
        logik.raknaRad("Hej världen");
        logik.raknaRad("Detta är en test");

        assertEquals(2, logik.getAntalRader());
        assertEquals(21, logik.getAntalTecken()); // "Hej världen" + "Detta är en test" = 21 tecken
        assertEquals(5, logik.getAntalOrd());      // 5 ord totalt
    }

    // Testar att det längsta ordet identifieras korrekt
    @Test
    public void testLangstaOrd() {
        LogikKlass logik = new LogikKlass();
        logik.raknaRad("Hej på er alla");
        logik.raknaRad("OpenAI skapar framtiden");

        assertEquals("framtiden", logik.getLangstaOrd());
    }

    // Testar att raknaRad returnerar true för "stop"
    @Test
    public void testRaknaRadStop() {
        LogikKlass logik = new LogikKlass();
        assertTrue(logik.raknaRad("stop"));
        assertTrue(logik.raknaRad("STOP"));
        assertFalse(logik.raknaRad("continue"));
    }
}


