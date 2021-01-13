public class UstUye extends uye{

    public UstUye(String isim, String adres, int ucret) {
        this.isim = isim;
        this.adres = adres;
        this.ucret = ucret;
    }

	int getUcret(){
        return this.ucret;
    }
}
