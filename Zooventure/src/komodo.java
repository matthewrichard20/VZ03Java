/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */


/** @class Hippo
  * Kelas Hippo untuk membuat hewan kuda nil
  */
public class komodo extends Animal{
    /**@brief Konstruktor.
     * Mengkonstruksi kelas komodo
     * @param w Nilai berat badan dari komodo
     */
     public komodo(int w){
        super(w);
        diet = new Carnivore(25);
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='0';
        code='K';
        name = "Komodo";
        sound= "Sshhh";
        tame = false;
        is_animal=true;
    }
     
     
     /**@brief Interaksi.
     * Berinteraksi dengan hewan komodo
     */
     public void Interact(){
        Description();
        System.out.println("Komodo menjulur-julurkan lidahnya");
        System.out.println("Berjalan-jalan dalam kandang");
        Talk();
     }
    
     /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
     public void AnimalDescription(){
         System.out.println("Hewan unik Indonesia Tengah yang hanya ada di pulau komodo");
     }
}
