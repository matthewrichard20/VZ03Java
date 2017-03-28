/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class Cendrawasih
 * 
 * Kelas Cendrawasih untuk membuat hewan cendrawasih
 */
public class Cendrawasih extends Aves{
    
    /**@brief Constructor.
     * Mengkonstruksi kelas cendrawasih
     * @param w 
     * Nilai berat badan dari hewan cendrawasih
     */
    public Cendrawasih(int w){
        diet = new Herbivore(20);
        habitat = new char [2];
        habitat[0] = 'f';
        habitat[1] = '0';
        code = 'c';
        name = "Cendrawasih";
        sound = "Koak koak";
        tame = true;
        is_animal = true;
    }
    
    /**@brief Interact.
     * Berinteraksi dengan hewan cenrawasih
     */
    public void Interact(){
        Description();
        System.out.println("Cendrawasih mengepakkan sayapnya");
        System.out.println("Burung surga terbang lagi");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Mernjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Cendrawasih adalah hewan asli dari daerah Indonesia Timur");
        System.out.println("Burung ini menjadi lambang dari daera Irian Jaya");
    }
}
