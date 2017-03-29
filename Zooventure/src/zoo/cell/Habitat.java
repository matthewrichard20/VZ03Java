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
        if (type == 'W' || type == 'A' || type == 'L'){
            switch (type){
                case 'W': 
                    code = 'w';
                    break;
                case 'A': 
                    code = 'a';
                    break;
                case 'L': 
                    code = 'l';
                    break;
            }
            cage = new Cage();
            is_cage = true;
        } else {
            code = type;
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
        return code;
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
                    case 'a':
                        out = 'A';
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
