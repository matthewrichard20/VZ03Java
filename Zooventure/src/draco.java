/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class draco
 * 
 * Kelas Draco untuk membuat hewan iguana terbang
 */
public class draco extends reptile{
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas bunglon terbang
     * @param w 
     * Nilai berat badan dari iguana terbang
     */
    public draco(int w){
       
        diet = new Carnivore(20);
        habitat = new char[2];
        habitat[0]='f';
        habitat[1]='l';
        code='D';
        name = "Bunglon terbang";
        sound= "...";
        tame = false;
        is_animal=true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan bunglon terbang
     */
    public void Interact(){
        Description();
        System.out.println("Bunglon terbang membuka selaput kulitnya");
        System.out.println("Dia berpindah dengan cara terbang");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Jenis reptil yang memiliki kulit tipis berfungsi sebagai sayap");
    }
}
