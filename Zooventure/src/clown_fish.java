/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class clown_fish
 * Kelas clown_fish untuk membuat hewan ikan badut
 * 
 */
public class clown_fish extends pisces {
    /**@brief Constructor.
     * Mengkonstruksi ikan badut
     * @param w 
     * Nilai berat badan dari ikan badut
     */
    public clown_fish(int w){
       
       diet = new Herbivore(3);
       habitat = new char[2];
       habitat[0]='w';
       habitat[1]='0';
       code='o';
       name = "Ikan badut";
       sound= "Blub blub";
       tame = true;
       is_animal=true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan ikan badut
     */
    public void Interact(){
        Description();
        System.out.println("Ikan badut berenang-renang bebas di dalam akuarium");
        System.out.println("Merlin? Nemo?");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
       System.out.println("Ikan ini berwarna oranye dengan garis-garis hitam");
       System.out.println("Ikan badut ini terkenal karena tokoh pada film 'Finding Nemo'"); 
    }
}
