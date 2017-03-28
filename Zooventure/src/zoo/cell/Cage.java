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

/**@class Cage
 *
 */
public class Cage {
    private Animal animal;
    private boolean is_occupied;
    public Cage(){
        animal = null;
        is_occupied = false;
    }
    public boolean IsCageEmpty(){
        return !is_occupied;
    }
    public Animal GetAnimal(){
        return animal;
    }
    public void SetAnimal(Animal _animal){
        animal = _animal;
        is_occupied = true;
    }
    public void ClearAnimal(){
        animal = null;
        is_occupied = false;
    }
}
