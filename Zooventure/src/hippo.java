/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class Hippo
  * Kelas Hippo untuk membuat hewan kuda nil
  */
public class hippo extends mammal{
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas kuda nil
     * @param w 
     * Nilai berat badan dari kuda nil
     */
    public hippo(int w){
        diet = new Herbivore(30);
        habitat = new char[2];
        habitat[0]='w';
        habitat[1]='l';
        code='H';
        name = "Kuda nil";
        sound= "Ngok brrr";
        tame = false;
        is_animal=true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan kuda nil
     */
    public void Interact(){
        Description();
        System.out.println("Kuda nil membuka mulutnya");
        System.out.println("Giginya tampak");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Hewan yang biasa hidup di daerah Afrika sekitar sungai");
        System.out.println("Biasa tinggal berkelompok");
    }
}
