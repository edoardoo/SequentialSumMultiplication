package edo;

import java.math.BigInteger;

/**
 * Created by edo on 01/12/15.
 * Repository: https://github.com/edoardoo/SequentialSumMultiplication
 * Repository contains JUNIT tests.
 *
 * @author Edoardo Odorico
 * @author David Bohmann
 */
public class SequentialSum{

    private SequentialSum(){
    }

    public static BigInteger multiply( BigInteger multiplicand, BigInteger multiplier ){

        BigInteger result = recursiveMultiply( multiplicand, multiplier.abs() );
        return result.multiply( BigInteger.valueOf( multiplier.signum() ) );

    }

    public static BigInteger multiply( int multiplicand, int multiplier ){

        return multiply( BigInteger.valueOf( multiplicand ), BigInteger.valueOf( multiplier ) );

    }

    private static BigInteger recursiveMultiply( BigInteger multiplicand, BigInteger multiplier ){

        BigInteger result;

        if( multiplier.equals( BigInteger.ZERO ) ){

            return BigInteger.ZERO;

        }else if( multiplier.equals( BigInteger.ONE ) ){

            result = multiplicand;

        }else{

            result = multiplicand.add( recursiveMultiply( multiplicand, multiplier.subtract( BigInteger.ONE ) ) );

        }

        return result;

    }

}
