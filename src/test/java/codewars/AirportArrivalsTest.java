package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AirportArrivalsTest {

    @Test
    void testFlapDisplay1() {
        String[] before = new String[]{"HELLO "};
        int[][] rotors = new int[][]{{15,49,50,48,43,13}};
        String[] after = AirportArrivals.flapDisplay(before,rotors);
        String[] expected = new String[]{"WORLD!"};
        assertArrayEquals(expected, after);
    }

    @Test
    void testFlapDisplay2() {
        String[] before2 = new String[]{"CODE"};
        int[][] rotors2 = new int[][]{{20,20,28,0}};
        String[] after2 = AirportArrivals.flapDisplay(before2,rotors2);
        String[] expected2 = new String[]{"WARS"};
        assertArrayEquals(expected2, after2);
    }
}