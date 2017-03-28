/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lathifah Nurrahmah
 */

/**@class Habitat
 *
 */
public class Habitat implements Renderable {
    private Cage cage;
    private char habitat_code;
    private boolean is_cage;
    
    public Habitat(char code){
        habitat_code = code;
        if (code == 'W' || code == 'F' || code == 'L'){
            switch (code){
                case 'W': 
                    habitat_code = 'w';
                    break;
                case 'F': 
                    habitat_code = 'f';
                    break;
                case 'L': 
                    habitat_code = 'l';
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
        return habitat_code;
    }
    
    /** @override Render()
     *  
     * 
     */
    public char Render(){
        if (is_cage && !cage.IsCageEmpty()){
            return cage.GetAnimal().Render();
        } else {
            char out = habitat_code;
            if (is_cage){
                switch (habitat_code){
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
