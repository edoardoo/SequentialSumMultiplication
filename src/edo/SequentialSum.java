package edo;

import java.math.BigInteger;

/**
 * Created by edo on 01/12/15.
 * Repository: https://github.com/edoardoo/SequentialSumMultiplication
 * Repository contains JUNIT tests.
 *
 * @author Edoardo Odorico
 *
 */
public class SequentialSum{

    private SequentialSum(){
    }

    public static BigInteger multiply(BigInteger multiplier, BigInteger multiplicand){

        BigInteger result = recursiveMultiply( multiplier, multiplicand.abs() );
        return result.multiply( BigInteger.valueOf( multiplicand.signum() ) );

    }

    public static BigInteger multiply( int multiplier, int multiplicand ){

        return multiply( BigInteger.valueOf( multiplier ), BigInteger.valueOf( multiplicand ) );

    }

    private static BigInteger recursiveMultiply( BigInteger multiplier, BigInteger multiplicand ){

        BigInteger result;

        if( multiplicand.equals( BigInteger.ZERO ) ){

            return BigInteger.ZERO;

        }else if( multiplicand.equals( BigInteger.ONE ) ){

            result = multiplier;

        }else{

            result = multiplier.add( recursiveMultiply( multiplier, multiplicand.subtract( BigInteger.ONE ) ) );

        }

        return result;

    }

}
