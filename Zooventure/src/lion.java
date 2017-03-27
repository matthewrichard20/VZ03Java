/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

/** @class Lion
  * Kelas Lion untuk membuat hewan singa
  */
public class lion extends Animal{
    
    /**@brief Konstruktor.
     * Mengkonstruksi kelas singa 
     * @param w Nilai berat badan dari singa
     */
    public lion(int w){
        super(w);
        diet = new Carnivore(35);
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='0';
        code='i';
        name = "Singa";
        sound= "Roar";
        tame = false;
        is_animal=true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan singa
     */
    public void Interact(){
        Description();
        System.out.println("Singa mengendap-ngendap di balik semak");
        System.out.println("Tampaknya dia ingin menyergap sesuatu");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Hewan karnivora yang memiliki habitat asli di daerah Afrika");
    }
}
