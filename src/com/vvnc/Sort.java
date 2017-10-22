package com.vvnc;

public class Sort {
    public static void MergeSort(int[] data) {
        // TODO: pass data as Iterable or Enumerable
        // TODO: pass comparison function as an argument
        // TODO: descending and ascending
        if (data == null){
            return;
        }
        if (data.length > 2) {
            int length1 = data.length / 2;
            int length2 = data.length - length1;

            int[] slice1 = new int[length1];
            System.arraycopy(data, 0, slice1, 0, length1);
            MergeSort(slice1);

            int[] slice2 = new int[length2];
            System.arraycopy(data, length1, slice2, 0, length2);
            MergeSort(slice2);

            Merge(slice1, slice2, data);

        } else if (data.length == 2) {
            if (data[0] > data[1]) {
                int tmp = data[0];
                data[0] = data[1];
                data[1] = tmp;
            }
        }
        else {
            assert(data.length == 1);
            // do nothing because one item is already sorted.
        }
    }

    private static void Merge(int[] slice1, int[] slice2, int[] dst) {
        int index1 = 0;
        int index2 = 0;
        int indexDst = 0;
        int remaining = slice1.length + slice2.length;
        assert(dst.length == remaining);
        while (remaining > 0) {
            if( index1 >= slice1.length ){
                dst[indexDst] = slice2[index2];
                ++index2;
            } else if ( index2 >= slice2.length ) {
                dst[indexDst] = slice1[index1];
                ++index1;
            }
            else if ( slice1[index1] < slice2[index2]) {
                dst[indexDst] = slice1[index1];
                ++index1;
            } else {
                dst[indexDst] = slice2[index2];
                ++index2;
            }
            ++indexDst;
            --remaining;
        }
    }
}
