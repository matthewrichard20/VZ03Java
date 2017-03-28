package zoo.animal;


import zoo.animal.Pisces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class Sting_Ray.
  * Kelas StingRay untuk membuat hewan ikan pari
  */
public class StingRay extends Pisces {
    /** Konstruktor.
     * Mengkonstruksi kelas pari
     * @param w Nilai dari berat badan ikan pari
     */
    public StingRay(int w){
        super(w);
        diet = new DietType(w,'H');
        habitat = new char[2];
        habitat[0] = 'w';
        habitat[1] = '0';
        name = "Ikan pari";
        sound = "...";
        tame = true;
        is_animal = true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan pari*/
    public void Interact(){
        Description();
        System.out.println("Ikan pari berenang mengitari aquarium yang terbatas luasnya.");
        System.out.println("Ikan pari mengepakkan 'sayap'nya dalam berenang.");
        Talk();
    }
            
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Ikan pari memiliki sirip yang panjangnya cukup panjang, sehingga bisa membantu dalam berenang.");
        System.out.println("Ikan pari dapat ditemuka di lautan tropis di seluruh dunia. Persebaran yang luas dan penampilannya yang unik");
        System.out.println("menyebabkan ikan ini memiliki banyak nama.");
    }
}
