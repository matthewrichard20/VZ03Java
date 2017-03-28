package zoo.animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lathifah Nurrahmah
 */

/**@class DietType
 *
 */
public class DietType {
    private static final int umum = 60;
    private int portion;
    char code;
    public DietType(char _code){
        portion = umum;
        code = _code;
    }
    public DietType(int _portion, char _code){
        portion = _portion;
        code = _code;
    }
    public char GetDietCode(){
        return code;
    }
    public int GetPortion(){
        return portion;
    }
}
