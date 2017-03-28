package zoo.cell;

import zoo.Renderable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lathifah Nurrahmah
 */

/**Class Habitat
 * kelas yang menangani suatu habitat dalam cell
 */
public class Habitat extends Cell {
    private Cage cage;
    private boolean is_cage;
    private char habitat_type;

    /**Constructor
     * konstruktor habitat menjadi jenis habitat tertentu
     * @param type
     * tipe dari habitat yang dikonstruksi
     */
    public Habitat(char type){
        code = type;
        habitat_type = type;
        if (type == 'W' || type == 'F' || type == 'L'){
            switch (type){
                case 'W': 
                    code = 'w';
                    break;
                case 'F': 
                    code = 'f';
                    break;
                case 'L': 
                    code = 'l';
                    break;
            }
            cage = new Cage();
            is_cage = true;
        } else {
            cage = null;
            is_cage = false;
        }
    }
    
    public boolean IsCage(){
        return is_cage;
    }
    
    public boolean IsCageAvailable(){
        return (is_cage && cage.IsCageEmpty());
    }
    public Cage GetCage(){
        return cage;
    }
    public char GetHabitat(){
        return habitat_type;
    }
    
    
    /**
     * @return  *  @override Render()
     *  
     * 
     */
    @Override
    public char Render(){
        if (is_cage && !cage.IsCageEmpty()){
            return cage.GetAnimal().Render();
        } else {
            char out = code;
            if (is_cage){
                switch (code){
                    case 'w':
                        out = 'W';
                        break;
                    case 'f':
                        out = 'F';
                        break;
                    case 'l':
                        out = 'L';
                        break;
                }
            }
            return out;
        }
    }
}
