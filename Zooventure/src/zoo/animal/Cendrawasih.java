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

/**Cendrawasih
 * Kelas Cendrawasih untuk membuat hewan cendrawasih
 */
public class Cendrawasih extends Aves{
    
    /**Mengkonstruksi kelas cendrawasih
     * @param w 
     * Nilai berat badan dari hewan cendrawasih
     */
    public Cendrawasih(int w){
        super(w);
        diet = new DietType(40,'H');
        habitat = new char [2];
        habitat[0] = 'a';
        habitat[1] = '0';
        code = 'c';
        name = "Cendrawasih";
        sound = "Koak koak";
        tame = true;
        is_animal = true;
    }
    
    /**Berinteraksi dengan hewan cenrawasih
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Cendrawasih mengepakkan sayapnya");
        System.out.println("Burung surga terbang lagi");
        Talk();
    }
    
    /**Mernjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Cendrawasih adalah hewan asli dari daerah Indonesia Timur");
        System.out.println("Burung ini menjadi lambang dari daera Irian Jaya");
    }
}
