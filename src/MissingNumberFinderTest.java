import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberFinderTest {
    @Test
    public void testFindMissingNumber_Middle() {
        int[] arr = {5, 0, 1, 3, 2};
        int expected = 4;
        int result = MissingNumberFinder.findMissingNumber(arr);
        assertEquals(expected, result, "Тест 1: Пропущенное число в середине");
    }

    @Test
    public void testFindMissingNumber_Start() {
        int[] arr = {7, 9, 10, 11, 12};
        int expected = 8;
        int result = MissingNumberFinder.findMissingNumber(arr);
        assertEquals(expected, result, "Тест 2: Пропущенное число в начале диапазона");
    }

    @Test
    public void testFindMissingNumber_Three() {
        int[] arr = {1, 2, 4, 5, 6};
        int expected = 3;
        int result = MissingNumberFinder.findMissingNumber(arr);
        assertEquals(expected, result, "Тест 3: Пропущенное число 3");
    }

    @Test
    public void testFindMissingNumber_NoMissing() {
        int[] arr = {0, 1, 2, 3};
        int expected = 4;
        int result = MissingNumberFinder.findMissingNumber(arr);
    }

    @Test
    public void testFindMissingNumber_MinMissing() {
        int[] arr = {2, 3, 4, 5, 6};
        int expected = 1;
        int result = MissingNumberFinder.findMissingNumber(arr);
    }

    @Test
    public void testFindMissingNumber_SingleElement() {
        int[] arr = {1};
        int expected = 0;
        int result = MissingNumberFinder.findMissingNumber(arr);
        assertEquals(expected, result, "Тест 6: Один элемент в массиве");
    }

    @Test
    public void testFindMissingNumber_EmptyArray() {
        int[] arr = {};
        int expected = 0;
        int result = MissingNumberFinder.findMissingNumber(arr);
    }
}