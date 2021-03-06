package dzien7.interfejsy.zad3;

public class Weganin implements Jedzacy {
    private int iloscPosilkowWZyciu;
    private double lacznaWagaZjedzonychPosilkow;

    public Weganin() {
        this.iloscPosilkowWZyciu = 0;
        this.lacznaWagaZjedzonychPosilkow = 0;
    }

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.getTypPokarmu() == TypPokarmu.OWOCE){
            System.out.println("Weganin: om nom nom, pyszne " + pokarm.getTypPokarmu());
            this.iloscPosilkowWZyciu++;
            this.lacznaWagaZjedzonychPosilkow += pokarm.getWaga();
        }
    }

    @Override
    public int ileGramowZjedzone() {
        return 0;
    }

    @Override
    public int ilePosilkowZjedzone() {
        return 0;
    }
}
