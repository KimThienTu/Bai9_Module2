package BT_Phanloaitamgiac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhanLoaiTamGiacTest {
    @Test
    public void testTamGiac(){
        // Test case 1.
        String expected1 = "Tam giác đều";
        assertEquals(expected1, PhanLoaiTamGiac.tamGiac(2,2,2));

        // Test case 2.
        String expected2 = "Tam giác cân";
        assertEquals(expected2, PhanLoaiTamGiac.tamGiac(2,2,3));

        // Test case 3.
        String expected3 = "Tam giác thường";
        assertEquals(expected3, PhanLoaiTamGiac.tamGiac(3,4,5));

        // Test case 4.
        String expected4 = "Không phải là tam giác";
        assertEquals(expected4, PhanLoaiTamGiac.tamGiac(8,2,3));

        // Test case 5.
        String expected5 = "Không phải là tam giác";
        assertEquals(expected5, PhanLoaiTamGiac.tamGiac(-1,2,1));

        // Test case 6.
        String expected6 = "Không phải là tam giác";
        assertEquals(expected6, PhanLoaiTamGiac.tamGiac(0,1,1));
    }
}
