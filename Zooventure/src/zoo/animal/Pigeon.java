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

/** Pigeon.
  * Kelas Pigeon untuk membuat hewan burung merpati
  */
public class Pigeon extends Aves{
    /** Konstruktor.
     * Mengkonstruksi kelas merpati
     * @param w Nilai dari berat badan burung merpati
     */
    public Pigeon(int w){
        super(w);
        diet = new DietType(40,'H');
        habitat = new char[2];
        habitat[0] = 'a';
        habitat[1] = '0';
        code='p';
        name = "Burung merpati";
        sound = "Krrrr... Krrrr....";
        tame = true;
        is_animal = true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan merpati*/
    public void Interact(){
        AnimalDescription();
        System.out.println("Burung dara cukup sulit untuk di pegang, ia akan terbang ketika kita mendekat.");
        System.out.println("Namun burung dara akan mendekat ketika ada makanan di dekatnya.");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    private void AnimalDescription(){
        super.Description();
        System.out.println("Burung merpati terdapat di seluruh duniam namun varietas terbesar terdapat di indomaata.");
        System.out.println("Burung merpati membangun sangkarnya dari ranting dan sisa-sisa lainnya.");
    }
}
