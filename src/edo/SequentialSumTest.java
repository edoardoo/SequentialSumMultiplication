package edo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by edo on 01/12/15.
 */
public class SequentialSumTest {

    @Test
    public void testMultiplyNormalCondition() throws Exception {

        Assert.assertEquals( 30, SequentialSum.multiply(  10, 3 ) );
    }

    @Test
    public void testMultiplyNegativeMultiplier() throws Exception {
        Assert.assertEquals( -30, SequentialSum.multiply(  -10, 3 ) );
    }

    @Test
    public void testMultiplyNegativeMultiplicand() throws Exception {

        Assert.assertEquals( -30, SequentialSum.multiply(  10, -3 ) );
    }
    @Test
    public void testMultiplyNegativeMembers() throws Exception {

        Assert.assertEquals( 30, SequentialSum.multiply(  -10, -3 ) );
    }
    @Test
    public void testMultiplyZeroMultiplicand() throws Exception {

        Assert.assertEquals( 0, SequentialSum.multiply(  3, 0 ) );
    }
    @Test
    public void testMultiplyZeroMultiplier() throws Exception {

        Assert.assertEquals( 0, SequentialSum.multiply(  0, 3 ) );
    }
    @Test
    public void testMultiplyZeroMembers() throws Exception {

        Assert.assertEquals( 0, SequentialSum.multiply(  3, 0 ) );
    }



}