/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class Zebra.
  * Kelas Zebra untuk membuat hewan zebra
  */
public class Zebra extends Mammal{
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas zebra
     * @param w Nilai dari berat badan hewan zebra
     */
    public Zebra(int w){
        
        diet = new Herbivore(70);
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = '0';
        name = "Zebra";
        sound = "*whinny*";
        tame = true;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan zebra
     */
    public void Interact(){
        Description();
        System.out.println("Zebra berlari di padang rumput");
        Talk();
        
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Zebra adalah binatang dengan warna belang-belang putih dan hitam");
        System.out.println("Zebra adalah hewan mamalia dan merupakan hewan herbivora");
        System.out.println("Zebra merupaka hewan dari famili kuda. Habitat asli zebra ini tersebar di Afrika");
        System.out.println("Belang belang di zebra merupakan salah satu bentuk pertahan yang dimiliki zebra untuk bersembunyi dari predator");
    }
}
