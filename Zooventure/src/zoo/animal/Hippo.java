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

/** Hippo
  * Kelas Hippo untuk membuat hewan kuda nil
  */
public class Hippo extends Mammal{
    
    /** Konstruktor.
     * Mengkonstruksi kelas kuda nil
     * @param w 
     * Nilai berat badan dari kuda nil
     */
    public Hippo(int w){
        super(w);
        diet = new DietType(30,'H');
        habitat = new char[2];
        habitat[0]='w';
        habitat[1]='l';
        code='H';
        name = "Kuda nil";
        sound= "Ngok brrr";
        tame = false;
        is_animal=true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan kuda nil
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Kuda nil membuka mulutnya");
        System.out.println("Giginya tampak");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Hewan yang biasa hidup di daerah Afrika sekitar sungai");
        System.out.println("Biasa tinggal berkelompok");
    }
}
