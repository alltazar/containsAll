import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Tests{

    @Test
    public void test(){
        int[] a = {3, 2, 4, 5, 3, 4};
        int[] b = {1, 1, 3 ,4, 7, 9, 5, 2};
        assertTrue(ContainsAll.check(a,b));


        int[] a1 = {15, 2, 4, 5, 3, 4};
        int[] b1 = {1, 1, 3 ,4, 7, 9, 5, 2};
        assertFalse(ContainsAll.check(a1,b1));


        int[] a8 = {15, 2, -4, 5, 3, 4};
        int[] b8 = {1, 1, 3 ,4, 7, 9, 5, 2};
        assertFalse(ContainsAll.check(a8,b8));


        int[] a9 = {-15, 2, 4, 3, 4};
        int[] b9 = {1, 1, 3 ,4, 7, 9, -15, 2};
        assertTrue(ContainsAll.check(a9,b9));


        int[] a2 = {1, 1, 1};
        int[] b2 = {1, 1, 3 ,4, 7, 9, 5, 2};
        assertTrue(ContainsAll.check(a2,b2));


        int[] a3 = {0};
        int[] b3 = {1, 1, 3 ,4, 7, 9, 5, 2};
        assertFalse(ContainsAll.check(a3,b3));


        int[] a4 = {3, 2, 4, 5, 3, 4};
        int[] b4 = {1, 1, 3};
        assertFalse(ContainsAll.check(a4,b4));
    }

}
