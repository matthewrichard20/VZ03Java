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

/**Eagle
 * Kelas Eagle untuk membuat hewan elang
 */
public class Eagle extends Aves{
    
    /** Konstruktor.
     * Mengkonstruksi kelas elang
     * @param w 
     * Nilai berat badan dari elang
     */
    public Eagle(int w){
        super(w);        
        diet = new DietType(60,'C');
        habitat = new char[2];
        habitat[0]='a';
        habitat[1]='0';
        code='E';
        name = "Elang";
        sound= "Koak";
        tame = false;
        is_animal=true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan elang
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Elang menatap dengan matanya yang tajam");
        System.out.println("Dia mengepakkan sayapnya");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Burung karnivora yang biasa memakan ular atau hewan lain");
    }
}
