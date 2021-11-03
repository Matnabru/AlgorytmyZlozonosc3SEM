public class PrimeNumbers {
    public boolean checkIfPrime(int num){
        for(int i=2;i< Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
