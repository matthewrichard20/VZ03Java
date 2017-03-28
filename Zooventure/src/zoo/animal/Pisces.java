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
public class Pisces extends Animal{

    /**Constructor
     * Mengkonstruksi kelas pisces dengan parameter berat badan
     * @param w 
     * berat badan hewan
     */
    public Pisces(int w) {
        super(w);
    }
    /** Description.
     * Menjelaskan secara umum tentang hewan tersebut*/
    public void Description(){
        System.out.println("Hewan ini termasuk ke dalam kelas pisces atau ikan");
    }
}
