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

/**Class Facility
 * kelas yang menyatakan suatu fasilitas
 */
public class Facility extends Cell{

    /**Construktor
     * konstruktor dengan parameter tipe dari fasilitas
     * @param type
     * kode dari tipe fasilitas
     */
    public Facility(char type){
        code = type;
    }
    
    /**Interact
     * melakukan interaksi dengan suatu fasilitas
     */
    public void Interact(){
        switch (code){
            case 'P' :{
             System.out.println( "Di taman ini terdapat banyak pohon, bangku-bangku dan air mancur");   
             break;
            }
            
            case 'R' :{
             System.out.println( "Di restoran ini, kami menjual nasi goreng, ayam goreng, dan soft drink"); 
             break;
            }
        }
    }
}
