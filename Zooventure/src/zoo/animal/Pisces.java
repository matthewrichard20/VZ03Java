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

    public Pisces(int w) {
        super(w);
    }
    /** Description.
     * Menjelaskan secara umum tentang hewan tersebut*/
    public void Description(){
        System.out.println("A fish is any member of a group of animals that consist of all gill-bearing aquatic craniate animals that lack limbs with digits.");
        AnimalDescription();
    }
}
