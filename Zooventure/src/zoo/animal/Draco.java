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

/**Draco
 * Kelas Draco untuk membuat hewan iguana terbang
 */
public class Draco extends Reptile{
    
    /**Mengkonstruksi kelas bunglon terbang
     * @param w 
     * Nilai berat badan dari iguana terbang
     */
    public Draco(int w){
       super(w);
        diet = new DietType(w,'C');
        habitat = new char[2];
        habitat[0]='f';
        habitat[1]='l';
        code='D';
        name = "Bunglon terbang";
        sound= "...";
        tame = false;
        is_animal=true;
    }
    
    /**Berinteraksi dengan hewan bunglon terbang
     */
    public void Interact(){
        AnimalDescription();
        System.out.println("Bunglon terbang membuka selaput kulitnya");
        System.out.println("Dia berpindah dengan cara terbang");
        Talk();
    }
    
    /**Menjelaskan secara khusus mengenai hewan
     */
    private void AnimalDescription(){
        super.Description();
        System.out.println("Jenis reptil yang memiliki kulit tipis berfungsi sebagai sayap");
    }
}
