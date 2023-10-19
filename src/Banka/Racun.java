package Banka;

public class Racun {
	
	    private String brojRacuna;
	    private double iznos = 0;

	    public Racun() {
	        double random = Math.random();
	        String broj = String.valueOf(random).replace(".", "");
	        this.brojRacuna = broj;
	    }

	    public String getBrojRacuna() {
	        return brojRacuna;
	    }

	    public double getIznos() {
	        return iznos;
	    }

	    public void setIznos(double iznos) {
	        this.iznos = iznos;
	    }

	    public void uplata(double uplata) {
	        this.iznos += uplata;
	    }

	    public void isplata(double isplata) {
	        if(this.iznos>isplata) {
	            this.iznos-= isplata;
	        }
	        else System.out.println("Nema dovoljno para na racunu");
	    }

//	    public void stampaj(String s) {
//	        System.out.println(s);
//	    }
	}


