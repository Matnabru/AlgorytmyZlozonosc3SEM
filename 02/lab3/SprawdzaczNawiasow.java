package lab3;

public class SprawdzaczNawiasow {
    public SprawdzaczNawiasow (){

    }
    public boolean sprawdzNawiasy(String tekst){
        Stos stos = new Stos();
        for(int i=0;i<tekst.length();i++){
            if(tekst.charAt(i) == '('){
                stos.push(1);
            }
            else if(tekst.charAt(i) == ')'){
                if(stos.isEmpty())
                    return false;
                try{
                    stos.pop();
                } catch (StosPustyException e) {
                    e.printStackTrace();
                }
            }
        }
        return stos.isEmpty();
    }
}
