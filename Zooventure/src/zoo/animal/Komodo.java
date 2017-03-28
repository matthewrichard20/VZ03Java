package zoo.animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */


/** Komodo
  * Kelas komodo untuk membuat hewan komodo
  */
public class Komodo extends Reptile{
    /** Konstruktor.
     * Mengkonstruksi kelas komodo
     * @param w Nilai berat badan dari komodo
     */
     public Komodo(int w){
        super(w);
        diet = new DietType(w,'C');
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='0';
        code='K';
        name = "Komodo";
        sound= "Sshhh";
        tame = false;
        is_animal=true;
    }
     
     
     /** Interaksi.
     * Berinteraksi dengan hewan komodo
     */
     public void Interact(){
        AnimalDescription();
        System.out.println("Komodo menjulur-julurkan lidahnya");
        System.out.println("Berjalan-jalan dalam kandang");
        Talk();
     }
    
     /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
     private void AnimalDescription(){
        super.Description();
        System.out.println("Hewan unik Indonesia Tengah yang hanya ada di pulau komodo");
     }
}
