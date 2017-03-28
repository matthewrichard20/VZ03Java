/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

/** @class Pigeon.
  * Kelas Pigeon untuk membuat hewan burung merpati
  */
public class pigeon extends aves{
    /**@brief Konstruktor.
     * Mengkonstruksi kelas merpati
     * @param w Nilai dari berat badan burung merpati
     */
    public pigeon(int w){
        diet = new Herbivore(40);
        habitat = new char[2];
        habitat[0] = 'f';
        habitat[1] = '0';
        code='p';
        name = "Burung merpati";
        sound = "Krrrr... Krrrr....";
        tame = true;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan merpati*/
    public void Interact(){
        Description();
        System.out.println("Burung dara cukup sulit untuk di pegang, ia akan terbang ketika kita mendekat.");
        System.out.println("Namun burung dara akan mendekat ketika ada makanan di dekatnya.");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Burung merpati terdapat di seluruh duniam namun varietas terbesar terdapat di indomaata.");
        System.out.println("Burung merpati membangun sangkarnya dari ranting dan sisa-sisa lainnya.");
    }
}
