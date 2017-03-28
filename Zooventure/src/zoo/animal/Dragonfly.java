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

/**Dragonfly
 * Kelas Dragonfly untuk membuat hewan capung
 */
public class Dragonfly extends Insect {
    
    /**Mengkonstruksi kelas capung
     * @param w 
     * Nilai berat badan dari capung
     */
    public Dragonfly(int w){
        super(w);
        diet = new DietType(w,'H');
        habitat = new char[2];
        habitat[0]='f';
        habitat[1]='0';
        code='d';
        name = "Capung";
        sound= "...";
        tame = true;
        is_animal=true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan capung
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Capung hinggap di rumput");
        System.out.println("Begitu didekati capung langsung terbang");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Serangga dengan sayap tipis yang transparan");
        System.out.println("Biasa ditemukan di daerah berumput tinggi");
    }
}
