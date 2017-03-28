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

/** Lion
  * Kelas Lion untuk membuat hewan singa
  */
public class Lion extends Mammal{
    
    /** Konstruktor.
     * Mengkonstruksi kelas singa 
     * @param w Nilai berat badan dari singa
     */
    public Lion(int w){
        super(w);
        diet = new DietType(w,'C');
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='0';
        code='i';
        name = "Singa";
        sound= "Roar";
        tame = false;
        is_animal=true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan singa
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Singa mengendap-ngendap di balik semak");
        System.out.println("Tampaknya dia ingin menyergap sesuatu");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Hewan karnivora yang memiliki habitat asli di daerah Afrika");
    }
}
