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

/**Crocodile
 * Kelas Crocodile untuk membuat hewan buaya
 */
public class Crocodile extends Reptile{
    
    /**Mengkonstruksi kelas buaya
     * @param w 
     * Nilai untuk berat badan hewan
     */
    public Crocodile(int w){
        super(w);
        diet = new DietType(60,'C');
        habitat = new char[2];
        habitat[0]='l';
        habitat[1]='w';
        code='C';
        name = "Buaya";
        sound= "Rawr";
        tame = false;
        is_animal=true;
    }
    
    /**Berinteraksi dengan hewan buaya
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Buaya membuka mulutnya menunggu mangsa");
        System.out.println("Buaya itu bergerak di dalam kandangnya");
        Talk();
        
    }
    
    /**Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Pemakan daging yang biasa ditemukan di daerah dekat sungai");
    }
}
