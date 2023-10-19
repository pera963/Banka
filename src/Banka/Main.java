package Banka;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        unos();
//    Klijent klijent = new Klijent("Petar", "Petrovic");
//
//    klijent.uplatiNovac(5000);
//    klijent.isplatiNova(600);
//    klijent.isplatiNova(6000);





    }

    public static void unos() {
        ArrayList<Klijent> nizKlijenata = new ArrayList<>();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            stampaj("Unesi da li je dodajemo novog korisnika (K), vrsimo uplatu (U) ili isplatu (I), a unesi 'stop' za prekid");
            String komanda = scanner.next();
            if(komanda.equals("stop")) break;
            switch (komanda) {
                case "K" :
                    stampaj("Unesi ime");
                    String ime = scanner.next();
                    stampaj("Unesi prezime");
                    String prezime = scanner.next();
                    Klijent klijent = new Klijent(ime, prezime);
                    nizKlijenata.add(klijent);
                    break;
                case "U" :
                    stampaj("Svi klijenti banke");
                    for(Klijent k : nizKlijenata) {
                        k.stampajKlijenta();
                    }

                    stampaj("Unesi broj racuna");
                    String brRacuna = scanner.next();
                    stampaj("Unesi iznos uplate");
                    double uplata = scanner.nextDouble();
                    for(Klijent traziKlijenta : nizKlijenata) {
                        if(traziKlijenta.getRacun().getBrojRacuna().equals(brRacuna)) {
                            traziKlijenta.uplatiNovac(uplata);
                            break;
                        } else {
                            stampaj("Nema racuna sa tim brojem");
                           // break;
                        	continue;
                        }

                    }continue;

                case "I" :
                    stampaj("Svi klijenti banke");
                    for(Klijent k : nizKlijenata) {
                        k.stampajKlijenta();
                    }
                    stampaj("Unesi broj racuna");
                    brRacuna = scanner.next();
                    stampaj("Unesi iznos isplate");
                    double isplata = scanner.nextDouble();
                    for(Klijent traziKlijenta : nizKlijenata) {
                        if(traziKlijenta.getRacun().getBrojRacuna().equals(brRacuna)) {
                            traziKlijenta.isplatiNova(isplata);
                            break;
                        } else {
                            stampaj("Nema racuna sa tim brojem");
                            break;
                        }

                    }continue;

            }
        }
    }



    public static void stampaj(String s) {
        System.out.println(s);
    }

	
	}


