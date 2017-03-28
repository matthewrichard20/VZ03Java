package zoo.animal;


import zoo.animal.Aves;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

/** @class Penguin.
  * Kelas Penguin untuk membuat hewan pinguin
  */
public class Penguin extends Aves{
    /** Konstruktor.
     * Mengkonstruksi kelas pinguin
     * @param w Nilai dari berat badan pinguin
     */
    public Penguin(int w){
        super(w);
        diet = new DietType(w,'C');
        habitat = new char[2];
        habitat[0] = 'w';
        habitat[1] = 'l';
        code='g';
        name = "Penguin";
        sound = "...";
        tame = true;
        is_animal = true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan pinguin*/
    public void Interact(){
        Description();
        System.out.println("Penguin bermain main dengan 'arena' yang telah dibuat di kandangnya");
        System.out.println("Mereka berseluncur di 'arena' mereka dengan menggunakan perut mereka");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Penguin adalah hewan akuatik jenis burung yang tidak bisa terbang dan secara umum hidup di belahan bumi selatan.");
        System.out.println("Penguin terlihat tidak takut dengan manusia, bahkan mendekati peneliti yang sedang mempelajari mereka. ");
    }
}
