package zoo.animal;


import zoo.animal.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */
/** Reptile
  * Kelas Reptile untuk membuat hewan dengan tipe reptil
  */
public class Reptile extends Animal{

    public Reptile(int w) {
        super(w);
    }
    
    /** Description.
     * Menjelaskan secara umum tentang hewan tersebut*/
    void Description(){
        System.out.println("Hewan reptile ini memiliki darah dingin.");
    }
    
}
