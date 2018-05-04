public class PrimeNumbers {

    public boolean validateDataType(String n){
        try
        {
        Integer.parseInt(n);
        }
        catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}
