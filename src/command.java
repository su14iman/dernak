import java.util.Scanner; 


public class command {

    data data;

    public command(data data){
        this.data = data;
        this.home();
    }

    private void home(){
        clearScreen();
        System.out.println("\n");
        System.out.println("Merhaba dünya  :)");
        System.out.println("\n");
        System.out.println("0. Standart üye eklemek için.");
        System.out.println("1. Üst üye eklemek için.");
        System.out.println("2. Tüm üyeleri görmek için .");
        System.out.println("3. Toplam ücretler için.");
        System.out.println("4. Üyeyi güncellemek için.");
        System.out.println("5. Bir üye aramak için.");
        this.press();
    }

    private void press(){
        Scanner input = new Scanner(System.in);
        try {
            int selected = input.nextInt();

            switch (selected) {
                case 0:
                    this.StUye();
                    break;
    
                case 1:
                    this.UstUye();
                    break;
    
                case 2:
                    this.tum_uye_yazdir();
                    break;
    
                case 3:
                    this.toplam_ucret();
                    break;
    
                case 4:
                    this.guncelle();
                    break;
    
                case 5:
                    this.arama();
                    break;
    
                
                
            
                default:
                    System.out.println("plz press of number from list.");
                break;
            }
            
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    private void StUye(){
        clearScreen();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Dernak isim!!");
        String dernakIsim = input.nextLine();

        System.out.println("Enter a isim!!");
        String isim = input.nextLine();

        System.out.println("Enter a adress!!");
        String adres = input.nextLine();

        this.data.add(new dernak(dernakIsim).uye_ekle(isim,adres));

        System.out.println("Data has been added successfully. Click Enter to go back!");
        input.nextLine();
        this.home();
        input.close();
    }


    private void UstUye(){
        clearScreen();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Dernak isim!!");
        String dernakIsim = input.nextLine();

        System.out.println("Enter a isim!!");
        String isim = input.nextLine();

        System.out.println("Enter a adress!!");
        String adres = input.nextLine();

        System.out.println("Enter a ucret!!");
        int ucret = input.nextInt();

        this.data.add(new dernak(dernakIsim).ust_ekle(isim, adres,ucret));

        System.out.println("Data has been added successfully. Click Enter to go back!");
        input.nextLine();
        this.home();
        input.close();
    }


    private void tum_uye_yazdir(){
        clearScreen();
        Scanner input = new Scanner(System.in);
        data.tum_uye_yazdir();
        System.out.println("Data has been added successfully. Click Enter to go back!");
        input.nextLine();
        this.home(); 
        input.close();
    }


    private void toplam_ucret(){
        clearScreen();
        Scanner input = new Scanner(System.in);
        data.toplam_ucret();
        System.out.println("Data has been added successfully. Click Enter to go back!");
        input.nextLine();
        this.home(); 
        input.close();
    }


    private void arama(){
        clearScreen();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a adres!!");
        String adres = inp.nextLine();
        clearScreen();
        if(this.data.arama(adres.toString())){
            System.out.println("the search has been found. Click Enter to go back!");
        }else{
            System.out.println("Data has been not found. Click Enter to go back!");
        }
        inp.nextLine();
        this.home();
        inp.close();
        
    }


    private void guncelle(){
        clearScreen();
        Scanner inpu = new Scanner(System.in);

        System.out.println("Enter a ID!!");
        int id = inpu.nextInt();
        System.out.println("Enter a adres!!");
        inpu.nextLine();
        String adres = inpu.nextLine();
        System.out.println("Enter a yeni adres!!");
        String yeni = inpu.nextLine();
        
        this.data.guncelle(id,adres,yeni);

        System.out.println("Data has been added successfully. Click Enter to go back!");
        inpu.nextLine();
        this.home();
        inpu.close();
    }

  

    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  


}
