/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class Mantis
  * Kelas Mantis untuk membuat hewan belalang sembah
  */
public class mantis extends insect{
    /**@brief Konstruktor.
     * Mengkonstruksi kelas belalang
     * @param w Nilai untuk berat badan belalang
     */
    public mantis(int w){
        diet = new Herbivore(10);
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = '0';
        code='m';
        name = "Belalang sembah";
        sound = "...";
        tame = true;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan belalang*/
    public void Interact(){
        Description();
        System.out.println("Belalang hampir selalu tidak terlihat di habitat aslinya.");
        System.out.println("Mereka berkamuflase dengan bersembunyi menyerupai daun.");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Belalang sembah adalah serangga yang termasuk ke dalam ordo mantodea.");
        System.out.println("Mereka disebut praying mantis karena sikapnya yang seringkali kelihatan seperti sedang berdoa. ");
    }
}
