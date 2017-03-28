package zoo.cell;

import zoo.Renderable;
import zoo.animal.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**Class Cell
 * kelas yang mewakili satu kotak dalam virtual zoo
 * @author RichardMatthew
 */
public class Cell implements Renderable {
    char code;

    /**Constructor
     * konstruktor dummy
     */
    public Cell() {
    }
    
    /**GetAnimal
     * fungsi dummy yang akan dioverride oleh child class
     * @return null animal
     */
    public Animal GetAnimal() {return null;}

    /**SetAnimal
     * fungsi dummy yang akan dioverride oleh child clas
     * @param x
     * -
     */
    public void SetAnimal(Animal x){}

    /**GetHabitat
     * fungsi dummy yang akan dioverride oleh child clas
     * @return char
     */
    public char GetHabitat() {return ' ';}

    /**IsCageAvailable
     * fungsi dummy yang akan dioverride oleh child clas
     * @return boolean
     */
    public boolean IsCageAvailable() {return false;}

    /**IsCage
     * fungsi dummy yang akan dioverride oleh child clas
     * @return boolean
     */
    public boolean IsCage() {return false;}

    /**GetCage
     * fungsi dummy yang akan dioverride oleh child clas
     * @return cage
     */
    public Cage GetCage(){return null;}

    @Override
    public char Render(){return code;}

}