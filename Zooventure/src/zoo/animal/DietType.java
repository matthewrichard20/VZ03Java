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

/**DietType
 * kelas yang menjelaskan tipe pemakan apakah suatu hewan itu
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

  public void Feeds(double food){
        System.out.print(" diberikan ");
        switch (code){
            case 'C':
                System.out.print("daging");
                break;
            case 'O':
                System.out.print("campuran daging dan sayur");
                break;
            case 'H':
                System.out.print("tumbuhan");
                break;
        }
        System.out.println(" sebanyak " + food + " gram");
    }
}
