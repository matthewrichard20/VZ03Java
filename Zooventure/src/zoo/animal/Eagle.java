package zoo.animal;


import zoo.animal.Aves;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/**@class Eagle
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
        diet = new DietType(w,'C');
        habitat = new char[2];
        habitat[0]='f';
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
        Description();
        System.out.println("Elang menatap dengan matanya yang tajam");
        System.out.println("Dia mengepakkan sayapnya");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan
     */
    public void AnimalDescription(){
        System.out.println("Burung karnivora yang biasa memakan ular atau hewan lain");
    }
}
