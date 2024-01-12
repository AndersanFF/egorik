import java.util.Objects;

import Charecters.Char;
import Charecters.Korotishki;
import Charecters.Miga;
import Charecters.Neznaika;
public class Main {
    public static void main(String[] args){
        Char korotishki = new Korotishki();
        Char miga = new Miga();
        Char neznaika = new Neznaika();

        miga.see();
        neznaika.wakeUp();
        neznaika.talk();
        miga.undressed();
        miga.ostavil();
        miga.jump();
        neznaika.sledoval();
        neznaika.see();
        korotishki.stay();
        
        
    }

    
}
