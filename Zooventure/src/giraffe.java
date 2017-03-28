/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class Giraffe
  * Kelas Giraffe untuk membuat hewan jerapah
  */

public class giraffe extends mammal{
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas jerapah
     * @param w 
     * Nilai berat badan dari jerapah
     */
    public giraffe(int w){
        
        diet = new Herbivore(50);
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='0';
        code='G';
        name = "Jerapah";
        sound= "...";
        tame = true;
        is_animal=true;
    }
    
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan jerapah
     */
    public void Interact(){
        Description();
        System.out.println("Jerapah menengok dengan lehernya yang panjang");
        System.out.println("Telinganya bergerak-gerak");
        Talk();
        
    }
    
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Hewan dengan leher panjang dan kaki yang panjang pula");
        System.out.println("Biasa tinggal di padang rumput luas dengan pohon-pohon yang tinggi");
    }
}
