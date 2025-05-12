import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @Test
    void testConversao() {
        assertEquals(10.0, ConversorTemperatura.fahrenheitParaCelsius(50.0), 0.01);
    }
}