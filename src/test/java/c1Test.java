import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class c1Test {

    @Test
    public void setV() {
        c1 mC1 = new c1();
        mC1.setV(8);
        Assert.assertEquals(8, mC1.getV());
        Assert.assertNotEquals(9, mC1.getV());
    }
}