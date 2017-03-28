/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class Tiger
 * Kelas Tiger untuk membuat hewan harimau
 * 
 */
public class tiger extends mammal{
    /**@brief Konstruktor.
     * Mengkonstruksi kelas harimau
     * @param w Nilai dari berat badan harimau
     */
    public tiger(int w){
      
        diet = new Carnivore(90);
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = '0';
        name = "Harimau";
        sound = "ROAR!!";
        tame = false;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan harimau*/
    public void Interact(){
        Description();
        System.out.println("Harimau sedang bermain dengan teman se spesiesnya.");
        System.out.println("Mereka bermain kejar kejaran hingga terguling guling.");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa.");
        System.out.println("Harimau juga adalah kucing tercepat kedua dalam berlari setelah citah.");
        System.out.println(" Dalam keseluruhan karnivora, harimau adalah kucing karnivora terbesar dan ");
        System.out.println("karnivora terbesar ketiga setelah beruang kutub.");
    }
    
}
