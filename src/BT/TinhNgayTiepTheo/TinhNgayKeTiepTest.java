package BT.TinhNgayTiepTheo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class TinhNgayKeTiepTest {
    @Test
    public void testNgayKeTiep(){
        // Test case 1.
        int[] expected1 = {2, 1, 2018};
        assertArrayEquals(expected1, TinhNgayKeTiep.ngayKeTiep(1,1,2018));

        // Test case 2.
        int[] expected2 = {1, 2, 2018};
        assertArrayEquals(expected2, TinhNgayKeTiep.ngayKeTiep(31,1,2018));

        // Test case 3.
        int[] expected3 = {1, 5, 2018};
        assertArrayEquals(expected3, TinhNgayKeTiep.ngayKeTiep(30,4,2018));

        // Test case 4.
        int[] expected4 = {1, 3, 2018};
        assertArrayEquals(expected4, TinhNgayKeTiep.ngayKeTiep(28,2,2018));

        // Test case 5.
        int[] expected5 = {1, 3, 2020};
        assertArrayEquals(expected5, TinhNgayKeTiep.ngayKeTiep(29,2,2020));

        // Test case 6.
        int[] expected6 = {1, 1, 2019};
        assertArrayEquals(expected6, TinhNgayKeTiep.ngayKeTiep(31,12,2018));
    }
}
