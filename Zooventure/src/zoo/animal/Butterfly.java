package zoo.animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class
 * Kelas Butterfly untuk membuat hewan kupu kupu
 */
public class Butterfly extends Insect {
    /**Mengkonstruksi kelas kupu-kupu
     * @param w 
     * Nilai berat badan dari kupu-kupu
     */
    public Butterfly(int w){
        super(w);
        diet = new DietType(w,'H');
        habitat = new char[2];
        habitat[0] = 'f';
        habitat[1] = '0';
        code = 'B';
        name = "Kupu-kupu";
        sound = "...";
        tame = true;
        is_animal = true;
    }
    
    /**Berinteraksi dengan hewan kupu-kupu
     */
    public void Interact(){
        Description();
        System.out.println("Kupu-kupu hinggap di suatu bunga");
        System.out.println("Kupu-kupu itu terbang lagi");
        Talk();
    }
    
    /**Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Kupu-kupu adalah serangga dengan warna yang bermacam-macam");
        System.out.println("Warnanya bergantung pada jenis kupu-kupu dan gendernya");
    }
}
