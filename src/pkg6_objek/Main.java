
package pkg6_objek;


public class Main {
    
    //atribut 
    int panjang;
    int lebar;
    
    //class konsturktor dengan nilai default
    Main(){
        panjang = 1;
        lebar = 1;
    }
    
    //class konstruktor dengan nilai spesifik
    Main(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    // menghitung luas persegi panjang
    int getLuas(){
        return panjang * lebar;
    }
    
    //menghitung keliling persegi panjang
    int getKeliling(){
        return 2 * (panjang * lebar );
    }
    
    //menset nilai panjang persegi
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    //menset nilai lebar persegi
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    
    
    //testing untuk menjugi class
    public static void main(String[] args) {
        //inisiasi objek persegi panjgna 1
        Main persegipanjang1 = new Main();
        System.out.println("Luas adalah " +persegipanjang1.getLuas());
        System.out.println("keliling adalah " +persegipanjang1.getKeliling());
        
        //inisiasi objek persegi panjgna 2
        Main persegipanjang2 = new Main(30, 40);
        System.out.println("Luas adalah " +persegipanjang2.getLuas());
        System.out.println("keliling adalah " +persegipanjang2.getKeliling());
        
        //inisiasi objek persegi panjgna 3
        Main persegipanjang3 = new Main(25, 35);
        System.out.println("Luas adalah " +persegipanjang3.getLuas());
        System.out.println("keliling adalah " +persegipanjang3.getKeliling());
        
        
        
        
    }
    
    
}
