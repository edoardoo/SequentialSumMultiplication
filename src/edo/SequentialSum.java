package edo;

/**
 * Created by edo on 01/12/15.
 *
 *
 */
public class SequentialSum {

    private SequentialSum() {
    }

    public static int multiply( int multiplier, int multiplicand){
        int result = 0;

        for (int i = 0; i < Math.abs( multiplicand ); i++) {
            result+=multiplier;
        }
        return Integer.signum( multiplicand ) * result;
    }
}
