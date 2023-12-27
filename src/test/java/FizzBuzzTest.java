import org.junit.Assert;
import org.junit.Test;
import software.ulpgc.kata6.FizzBuzzConverter;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzLeavesNormalNumbersAlone() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
        Assert.assertEquals("Fizz", fizzBuzz.convert(12));
    }

    @Test
    public void fizzBuzzMultiplesOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
        Assert.assertEquals("Buzz", fizzBuzz.convert(20));
    }

    @Test
    public void fizzBuzzMultiplesOfThreeAndFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(45));
    }
}
