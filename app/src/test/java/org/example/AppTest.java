package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> result = App.removeDuplicates(input);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    void testSingleElement() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = App.removeDuplicates(input);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    void testNoDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> result = App.removeDuplicates(input);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void testWithDuplicatesIntegers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5, 5));
        ArrayList<Integer> result = App.removeDuplicates(input);
        assertEquals(Arrays.asList(1, 3, 5), result);
    }

    @Test
    void testWithDuplicatesStrings() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("A", "A", "B"));
        ArrayList<String> result = App.removeDuplicates(input);
        assertEquals(Arrays.asList("A", "B"), result);
    }

    @Test
    void testMixedOrderDuplicates() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("C", "A", "B", "A", "C"));
        ArrayList<String> result = App.removeDuplicates(input);
        assertEquals(Arrays.asList("C", "A", "B"), result);
    }
}
