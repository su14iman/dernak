public class dernak {
    String dernakIsim;

    public dernak(String dernakIsim){
        this.dernakIsim = dernakIsim;
    }

    typeData uye_ekle(String isim,String adres){
        var data = new typeData();
        data.dernakIsim = this.dernakIsim;
        data.user = new StandartUye(isim,adres);
        return data;
    }

    typeData ust_ekle(String isim,String adres,int ucret){
        var data = new typeData();
        data.dernakIsim = this.dernakIsim;
        data.user = new UstUye(isim,adres,ucret);
        return data;
    }

	

}
