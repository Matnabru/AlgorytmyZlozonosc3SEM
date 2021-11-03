public class Z1 {
    public int wypiszGodziny(int n){
        return n/3600;
    }
    public int wypiszMinuty(int n){
        return n/60;
    }
    public void wypiszGodzinyIMinuty(int n){
        System.out.print("\nGodziny : " + wypiszGodziny(n) + "\nMinuty: " + (wypiszMinuty(n) - wypiszGodziny(n)*60));
    }
}
