/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.cell;

/**
 *
 * @author RichardMatthew
 */

/**Facility
 * Kelas yang menangani facility
 */
public class Facility extends Cell{
    /**Constructor
     * Konstruktor dengan parameter tipe dari facility
     */
    public Facility(char type){
        code = type;
    }
    
    /**Interact
     * melakukan interaksi dengan facility
     */
    public void Interact(){
        switch (code){
            case 'P' :
                System.out.println( "Di taman ini terdapat banyak pohon, bangku-bangku dan air mancur");   
                break;
            
            case 'R' :
                System.out.println( "Di restoran ini, kami menjual nasi goreng, ayam goreng, dan soft drink");   
                break;
        }
    }
}
