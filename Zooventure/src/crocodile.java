/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class Crocodile
 * 
 * Kelas Crocodile untuk membuat hewan buaya
 */
public class crocodile extends reptile{
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas buaya
     * @param w 
     * Nilai untuk berat badan hewan
     */
    public crocodile(int w){
        
        diet = new Carnivore(100);
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='w';
        code='C';
        name = "Buaya";
        sound= "Rawr";
        tame = false;
        is_animal=true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan buaya
     */
    public void Interact(){
        Description();
        System.out.println("Buaya membuka mulutnya menunggu mangsa");
        System.out.println("Buaya itu bergerak di dalam kandangnya");
        Talk();
        
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Pemakan daging yang biasa ditemukan di daerah dekat sungai");
    }
}
