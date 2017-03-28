/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class Bat
 * Kelas Bat untuk membuat hewan kelelawar
 * 
 */
public class Bat extends Mammal{
    
    /**@brief Constructor.
     * Mengkonstruksi kelas kelelawar
     * @param w 
     * Nilai berat badan dari kelelawar
     */
    public Bat(int w) {
        diet = new Omnivore(30);
        habitat = new char[2];
        habitat[0] = 'f';
        habitat[1] = '0';
        code = 'b';
        name = "Kelelawar";
        sound = "cit ciiit";
        tame = false;
        is_animal = true;
    }
    
    /**@brief Interaksi
     * Berinteraksi dengan kelelawar
     */
    public void Interact(){
        Description();
        System.out.println("Kelelawar mengepakkan sayapnya sekali");
        System.out.println("Tampaknya sedang tidur");
        Talk();
    }
    
    /**@brief Animal Description
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Satu-satunya mamalia yang dapat terbang");
    }
}
