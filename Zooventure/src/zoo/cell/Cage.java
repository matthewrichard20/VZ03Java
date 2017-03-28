package zoo.cell;


import zoo.animal.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lathifah Nurrahmah
 */

/**Cage
 * kelas yang menangani cage yang bisa berisi animal
 */
public class Cage {
    private Animal animal;
    private boolean is_occupied;

    /**Constructor
     * konstruktor tanpa parameter yang mewakili cage kosong
     */
    public Cage(){
        animal = null;
        is_occupied = false;
    }

    /**IsCageEmpty
     * mengembalikan kondisi apakah suatu cage kosong atau tidak
     * @return boolean !is_occupied
     */
    public boolean IsCageEmpty(){
        return !is_occupied;
    }

    /**GetAnimal
     * mengembalikan animal yang berada pada suatu kandang
     * @return animal
     */
    public Animal GetAnimal(){
        return animal;
    }

    /**SetAnimal
     * mengeset suatu animal pada cage
     * @param _animal
     * animal yang akan diset pada cage
     */
    public void SetAnimal(Animal _animal){
        animal = _animal;
        is_occupied = true;
    }

    /**ClearAnimal
     * menghapus isi dari cage
     */
    public void ClearAnimal(){
        animal = null;
        is_occupied = false;
    }
}
