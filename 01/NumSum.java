public class NumSum {
    public int sumFromNumbers(String number){
        String expectedString = number;
        int sum =0;
        String oneChar = "";
        for(int i=0;i<expectedString.length();i++){
            oneChar = "";
            oneChar += expectedString.charAt(i);
            sum += Integer.parseInt(oneChar);
        }

        return sum;
    }
    public int sumFromWholeNumber(String number){
        int n = sumFromNumbers(number);
        while (n >= 10){
            n = sumFromNumbers(String.valueOf(n));
        }
        return n;
    }
}
