public class NewtonSymbol {
    public int calculate(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }else
            return calculate(n-1,k-1) + calculate(n-1,k);
    }
}
