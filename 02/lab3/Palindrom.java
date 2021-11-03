package lab3;

import java.util.Locale;

public class Palindrom {
    public boolean czyPalindrom(String palindrom){
        palindrom = palindrom.toLowerCase(Locale.ROOT);
        Stos stos = new Stos();
        for(int i=0;i<palindrom.length()/2;i++){
            stos.push(palindrom.charAt(i));
        }
        String odwrotnie = "";
        while (!stos.isEmpty()){
            try{
                odwrotnie += (char)stos.pop();
            } catch (StosPustyException e) {
                e.printStackTrace();
            }

        }
        if(palindrom.substring(0,palindrom.length()/2).equals(odwrotnie)){
            return true;
        }
        return false;
    }
}
