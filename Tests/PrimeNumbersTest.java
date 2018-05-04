import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumbersTest {

    @Test
    void ValidatingDataType(){
        PrimeNumbers primeNumbers = new PrimeNumbers();

        boolean Validate = primeNumbers.validateDataType("15");
        assertEquals(true, Validate);

        boolean InvalidValidate = primeNumbers.validateDataType("hello");
        assertEquals(false, InvalidValidate);

    }



}