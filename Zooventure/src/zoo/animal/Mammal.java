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


/** @class Mammal
  * Kelas Mammal untuk membuat hewan tipe mamalia
  */
public class Mammal extends Animal{

    public Mammal(int w) {
        super(w);
    }
    /** Description.
     * Menjelaskan secara umum tentang hewan tersebut*/
    public void Description(){
      System.out.println("Hewan tersebut termasuk pada hewan mamalia. Pembagian tersebut berdasarkan hewan yang memiliki kelenjar susu.");  
      AnimalDescription();
    }
}
