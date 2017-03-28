/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

/** @class Swan
  * Kelas Swan untuk membuat hewan burung angsa
  */
public class Swan extends Aves{
    /**@brief Konstruktor.
     * Mengkonstruksi kelas burung angsa
     * @param w Nilai dari berat badan burung angsa
     */
    public Swan(int w){
        diet = new Herbivore(80);
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = 'w';
        name = "Angsa";
        sound = "honk";
        tame = true;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan burung angsa*/
    public void Interact(){
        Description();
        System.out.println("Angsa berenang renang dengan indahnya di danau");
        System.out.println("Mereka berkumpul bersama temannya, berenang kesana kemari.");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Angsa adalah burung air berukuran dari genus cygnus famili anatidae. ");
        System.out.println(" Angsa umumnya terdapat di daerah beriklim sedang, jarang terdapat di daerah tropis.");
    }
}
