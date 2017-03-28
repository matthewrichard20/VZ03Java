/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class Eagle
 * Kelas Eagle untuk membuat hewan elang
 */
public class dragonfly extends insect {
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas capung
     * @param w 
     * Nilai berat badan dari capung
     */
    public dragonfly(int w){
        
        diet = new Herbivore(10);
        habitat = new char[2];
        habitat[0]='f';
        habitat[1]='0';
        code='d';
        name = "Capung";
        sound= "...";
        tame = true;
        is_animal=true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan capung
     */
    public void Interact(){
        Description();
        System.out.println("Capung hinggap di rumput");
        System.out.println("Begitu didekati capung langsung terbang");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Serangga dengan sayap tipis yang transparan");
        System.out.println("Biasa ditemukan di daerah berumput tinggi");
    }
}
