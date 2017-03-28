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

/** Giraffe
  * Kelas Giraffe untuk membuat hewan jerapah
  */

public class Giraffe extends Mammal{
    
    /** Konstruktor.
     * Mengkonstruksi kelas jerapah
     * @param w 
     * Nilai berat badan dari jerapah
     */
    public Giraffe(int w){
        super(w);
        diet = new DietType(w,'H');
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='0';
        code='G';
        name = "Jerapah";
        sound= "...";
        tame = true;
        is_animal=true;
    }
    
    
    /** Interaksi.
     * Berinteraksi dengan hewan jerapah
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Jerapah menengok dengan lehernya yang panjang");
        System.out.println("Telinganya bergerak-gerak");
        Talk();
        
    }
    
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Hewan dengan leher panjang dan kaki yang panjang pula");
        System.out.println("Biasa tinggal di padang rumput luas dengan pohon-pohon yang tinggi");
    }
}
