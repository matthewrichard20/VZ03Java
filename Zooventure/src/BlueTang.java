/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class blue_tang
 * Kelas BlueTang untuk membuat hewan blue tang atau ikan dory
 */
public class BlueTang extends Pisces {
    
    /**@brief Constructor.
     * Mengkonstruksi kelas ikan blue tang
     * @param w 
     * Nilai berat badan dari ikan blue tang
     */
    public BlueTang(int w){
        
        diet = new Herbivore(5);
        habitat = new char[2];
        habitat[0] = 'w';
        habitat[1] = '0';
        code = 't';
        name = "Blue Tang";
        sound = "Blub blub";
        tame = true;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan ikan blue tang
     */
    public void Interact(){
        Description();
        System.out.println("Ikan blue tang berenang-renang dalam air");
        System.out.println("Hai Dory!");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Ikan blur tang adalah suatu jenis ikan hias berwarna biru dengan aksen hitam");
        System.out.println("Jika anda sudah menonton film 'Finding Nemo', Dory adalah ikan blue tang");
    }
}
