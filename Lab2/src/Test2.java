import org.junit.Test;
public class Test2 {
    int[] array = new int[] {8, 9, 11, 5, 29, 77, 50};
    @Test
    public void MaxVal() {
        int maxValue = main.maxValue(array);
        assert(maxValue == 77);
        }
    @Test
    public void MinVal() {
        int minValue = main.minValue(array);
        assert(minValue == 8);
        }
    @Test(expected = IllegalArgumentException.class)
    public void emptyArrIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = main.maxValue(emptyArray);
        int minValue = main.minValue(emptyArray);
        }
}
