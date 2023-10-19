package Banka;

public class Klijent {
	private String ime;
    private String prezime;
    Racun racun;

    public Klijent(String ime, String prezime) {
        setIme(ime);
        setPrezime(prezime);
        Racun racun = new Racun();
        this.racun = racun;
        Main.stampaj("Klijent banke " + getIme() + " " + getPrezime() + " , br.ziro rac.:" +  racun.getBrojRacuna()
                + " iznos:" + racun.getIznos());
    }



    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Racun getRacun() {
        return racun;
    }

    public String getBrojRacunaKorisnika() {
        return this.racun.getBrojRacuna();
    }

    public void stanjeNaRacunu() {
        double stanje = this.racun.getIznos();
        Main.stampaj("Stanje racuna je " + stanje);
    }

    public void uplatiNovac(double uplata) {
        Main.stampaj("Klijent " + getIme() + " " + getPrezime() + " uplacuje " + uplata + " na racun " + racun.getBrojRacuna());
        this.racun.uplata(uplata);
        Main.stampaj("Stanje racuna " + racun.getIznos());
    }

    public void isplatiNova(double isplata) {
        Main.stampaj("Klijent " + getIme() + " " + getPrezime() + " isplacuje " + isplata + " na racun " + racun.getBrojRacuna());
        this.racun.isplata(isplata);
        Main.stampaj("Stanje racuna" + racun.getIznos());

    }

    public void stampajKlijenta() {
        Main.stampaj("Klijent " + getIme() + " " + getPrezime()+ " racun " + racun.getBrojRacuna() + " iznos " + racun.getIznos() );
    }
	
	   

}
