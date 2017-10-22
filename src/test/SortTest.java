package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vvnc.Sort;

class SortTest {

    @Test
    @DisplayName("Test merge sort")
    void TestMergeSort() {
        int[] data = {45, 23, 1, 0, 3, 43, 7};
        int[] expected = {0, 1, 3, 7, 23, 43, 45};
        Sort.MergeSort(data);
        assertArrayEquals(expected, data);
    }
}
