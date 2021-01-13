public class StandartUye extends uye{
	public StandartUye(String isim, String adres) {
                this.isim = isim;
                this.adres = adres;
                this.ucret = 100;
	}

	int getUcret(){
        return this.ucret;
    }
}
