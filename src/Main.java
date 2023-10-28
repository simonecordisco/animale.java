//Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il
// verso dell'animale Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
// Prova quindi a far stampare il verso di
//Animale e di Gatto.

public class Main {

    public static void main(String[] args) {

        animale animale1 = new animale("dipende dall'animale");
        gatto gatto1 = new gatto("il verso del gatto è ");


        gatto1.faIlVerso();
    }

}