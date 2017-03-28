package zoo.animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class Snake.
  * Kelas Snake untuk membuat hewan ular
  */
public class Snake extends Reptile{
    /** Konstruktor.
     * Mengkonstruksi kelas ular
     * @param w Nilai dari berat badan ular
     */
    public Snake(int w){
        super(w);
        diet = new DietType(w,'C');
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = '0';
        name = "Ular";
        sound = "ssssshhhhh~";
        tame = true;
        is_animal = true;
    }
    
     /** Interaksi.
     * Berinteraksi dengan hewan ular*/
    public void Interact(){
        Description();
        System.out.println("Ular melingkar di pohon sambil beristirahat.");
        System.out.println("Terkadang, ia berdesis sambil menjulurkan lidahnya");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Ular adalah reptilia tak berkaki dan bertubuh panjang.");
        System.out.println("Ular memiliki sisik seperti kadal dan digolongkan ke dalam reptil bersisik.");
    }
}
