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

/** Aves
  * Kelas Aves untuk membuat hewan jenis aves
  */
public class Aves extends Animal{

    /**Constructor
     * konstruktor aves dengan parameter w
     * @param w 
     * berat badan dari aves
     */
    public Aves(int w) {
        super(w);
    }
       
    /**Menjelaskan secara umum tentang hewan tersebut*/
    public void Description(){
        System.out.println("Hewan tersebut termasuk ke dalam hewan aves atau unggas.");
    }
    
    
}
