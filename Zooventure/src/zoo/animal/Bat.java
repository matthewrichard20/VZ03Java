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

/**Bat
 * Kelas Bat untuk membuat hewan kelelawar
 * 
 */
public class Bat extends Mammal{
    
    /**Mengkonstruksi kelas kelelawar
     * @param w 
     * Nilai berat badan dari kelelawar
     */
    public Bat(int w) {
        super(w);
        diet = new DietType(w, 'O');
        habitat = new char[2];
        habitat[0] = 'f';
        habitat[1] = '0';
        code = 'b';
        name = "Kelelawar";
        sound = "cit ciiit";
        tame = false;
        is_animal = true;
    }
    
    /**Berinteraksi dengan kelelawar
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Kelelawar mengepakkan sayapnya sekali");
        System.out.println("Tampaknya sedang tidur");
        Talk();
    }
    
    /**Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Satu-satunya mamalia yang dapat terbang");
    }
}
