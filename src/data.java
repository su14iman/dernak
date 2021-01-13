import java.util.ArrayList;

public class data {
    ArrayList<typeData> db = new ArrayList<typeData>();

    public boolean add(typeData classData){
        return this.db.add(classData);        
    }




    public int toplam_ucret(){
        int ucret = 0;
        for(int i=0; i<this.db.size();i++){
            ucret += +this.db.get(i).user.ucret;
        }
        System.out.println("Ucret: "+ucret);
        return ucret;
    }

    public void tum_uye_yazdir(){
        for(int i=0; i<this.db.size();i++){
            System.out.println("ID: "+i);
            System.out.println("Dernak isim: "+this.db.get(i).dernakIsim);
            System.out.println("Uye: ");
            System.out.println("    Isim: "+this.db.get(i).user.isim);
            System.out.println("    Adres: "+this.db.get(i).user.adres);
            System.out.println("    Ucret: "+this.db.get(i).user.ucret);
            System.out.println("\n");
        }
    }


    public boolean arama(String adress){
        for(int i=0; i<this.db.size();i++){
            var userAdress = this.db.get(i).user.adres.toString();
            if( userAdress.equals(adress)){
                System.out.println("ID: "+i);
                System.out.println("Dernak isim: "+this.db.get(i).dernakIsim);
                System.out.println("Uye: ");
                System.out.println("    Isim: "+this.db.get(i).user.isim);
                System.out.println("    Adres: "+this.db.get(i).user.adres);
                System.out.println("    Ucret: "+this.db.get(i).user.ucret);
                System.out.println("\n");
                return true;
            }
        }
		return false;
    }

    public typeData guncelle(int id,String adres,String yeni_adres){
            if(this.db.get(id).user.adres.equals(adres)){
                var newData = this.db.get(id);
                newData.user.adres = yeni_adres;
                return this.db.set(id, newData);
                 
            }
			return null;
        
    }

}
