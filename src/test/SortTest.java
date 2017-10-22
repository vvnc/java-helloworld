package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vvnc.Sort;

class SortTest {

    @Test
    @DisplayName("Test merge sort on small hardcoded arrays")
    void SortHardcodedArray() {
        // Basic cases:
        int[] data = {45, 23, 1, 0, 3, 43, 7};
        int[] expected = {0, 1, 3, 7, 23, 43, 45};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        data = new int[]{100, 101, 102};
        expected = new int[]{100, 101, 102};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        data = new int[]{'b', 'a', 'A', '~'};
        expected = new int[]{'A', 'a', 'b', '~'};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        data = new int[]{0, 0, 0, 0, 0, 1, 1, 1};
        expected = new int[]{0, 0, 0, 0, 0, 1, 1, 1};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        // Single element:
        data = new int[]{23};
        expected = new int[]{23};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        // Integer overflows:
        data = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE + 1};
        expected = new int[]{Integer.MAX_VALUE + 1, Integer.MAX_VALUE};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        data = new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 2};
        expected = new int[]{Integer.MAX_VALUE + 1, Integer.MIN_VALUE, Integer.MAX_VALUE + 2, 0};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        // Empty array:
        data = new int[]{};
        expected = new int[]{};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);

        // Null:
        data = null;
        expected = null;
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);
    }
}
