import impl.FractionCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class FractionCalculatorTest {

    @Test
    public void addFractionsWithCommonDenominator_Test() {
        Fraction fraction1 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(1, 5);

        FractionCalculator calculator = new FractionCalculator();
        Object result = calculator.add(fraction1, fraction2);

        Assert.assertEquals(new Fraction(3, 5), result);

    }



}
