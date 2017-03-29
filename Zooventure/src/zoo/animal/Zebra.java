package zoo.animal;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** Zebra.
  * Kelas Zebra untuk membuat hewan zebra
  */
public class Zebra extends Mammal{
    
    /** Konstruktor.
     * Mengkonstruksi kelas zebra
     * @param w Nilai dari berat badan hewan zebra
     */
    public Zebra(int w){
        super(w);
        diet = new DietType(40,'H');
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = '0';
        code = 'Z';
        name = "Zebra";
        sound = "*whinny*";
        tame = true;
        is_animal = true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan zebra
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Zebra berlari di padang rumput");
        Talk();
        
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Zebra adalah binatang dengan warna belang-belang putih dan hitam");
        System.out.println("Zebra adalah hewan mamalia dan merupakan hewan herbivora");
        System.out.println("Zebra merupaka hewan dari famili kuda. Habitat asli zebra ini tersebar di Afrika");
        System.out.println("Belang belang di zebra merupakan salah satu bentuk pertahan yang dimiliki zebra untuk bersembunyi dari predator");
    }
}
