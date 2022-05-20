import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
class MelonTest {
    @Test
    void negativeIllegalArgumentException() {
        Melon tc = new Melon();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    tc.even_oddtest(-1);
                });
    }

    @Test
    void zeroIllegalArgumentException() {
        Melon tc = new Melon();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    tc.even_oddtest(0);
                });
    }
/*
    @Test
    void ifEven() {
        Melon tc = new Melon();
        assertEquals(1, tc.even_oddtest(16));
    }

    @Test
    void ifOdd() {
        Melon tc = new Melon();
        assertEquals(0, tc.even_oddtest(11));
    }*/
}
