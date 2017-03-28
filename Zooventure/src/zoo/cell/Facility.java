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
 * 
 */
public class Facility extends Cell{
    public Facility(char type){
        code = type;
    }
    
    public void Interact(){
        switch (code){
            case 'P' :
                System.out.println( "Di taman ini terdapat banyak pohon, bangku-bangku dan air mancur");   
                break;
            
            case 'r' :
                System.out.println( "Di restoran ini, kami menjual nasi goreng, ayam goreng, dan soft drink");   
                break
        }
    }
}
