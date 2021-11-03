package lab3;

public class notacjaONP {
    public int Oblicz(String znaki) throws StosPustyException {
        Stos stos = new Stos();
        for(int i=0; i< znaki.length(); i++){
            if(znaki.charAt(i)<='9' && znaki.charAt(i)>= '0'){
                stos.push(znaki.charAt(i)-48);
            }else if(znaki.charAt(i) == '*'){

                int x = stos.pop();
                int y = stos.pop();
                stos.push(y*x);
            }
            else if(znaki.charAt(i) == '-'){
                int x = stos.pop();
                int y = stos.pop();
                stos.push(y-x);
            }
            else if(znaki.charAt(i) == '+'){
                int x = stos.pop();
                int y = stos.pop();
                stos.push(y+x);
            }
            else if(znaki.charAt(i) == '/'){
                int x = stos.pop();
                int y = stos.pop();
                stos.push(y/x);
            }
        }
        return stos.pop();
    }
}
