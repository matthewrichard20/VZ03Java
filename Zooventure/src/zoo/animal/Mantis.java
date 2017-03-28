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

/** Mantis
  * Kelas Mantis untuk membuat hewan belalang sembah
  */
public class Mantis extends Insect{
    /** Konstruktor.
     * Mengkonstruksi kelas belalang
     * @param w Nilai untuk berat badan belalang
     */
    public Mantis(int w){
        super(w);
        diet = new DietType(30,'H');
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = '0';
        code='m';
        name = "Belalang sembah";
        sound = "...";
        tame = true;
        is_animal = true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan belalang*/
    public void Interact(){
        AnimalDescription();
        System.out.println("Belalang hampir selalu tidak terlihat di habitat aslinya.");
        System.out.println("Mereka berkamuflase dengan bersembunyi menyerupai daun.");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    private void AnimalDescription(){
        super.Description();
        System.out.println("Belalang sembah adalah serangga yang termasuk ke dalam ordo mantodea.");
        System.out.println("Mereka disebut praying mantis karena sikapnya yang seringkali kelihatan seperti sedang berdoa. ");
    }
}
