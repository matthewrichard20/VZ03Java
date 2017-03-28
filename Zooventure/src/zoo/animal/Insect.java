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

/** Insect
  * Kelas Insect untuk membuat hewan tipe insect
  */

public class Insect extends Animal{

    public Insect(int w) {
        super(w);
    }
    /** Description.
     * Menjelaskan secara umum tentang hewan tersebut*/
    public void Description(){
        System.out.println("Hewan termasuk ke dalam jenis serangga atau insecta.");
    }
}
