/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** @class StingRay.
  * Kelas StingRay untuk membuat hewan hiu
  */
public class shark extends pisces{
    /**@brief Konstruktor.
     * Mengkonstruksi kelas hiu
     * @param w Nilai dari berat badan hiu
     */
    public shark(int w){
        super(w);
        diet = new Carnivore(80);
        habitat = new char[2];
        habitat[0] = 'w';
        habitat[1] = '0';
        code='S';
        name = "Hiu";
        sound = "...";
        tame = false;
        is_animal = true;
    }
    
    /**@brief Interaksi.
     * Berinteraksi dengan hewan hiu*/
    public void Interact(){
        Description();
        System.out.println("Hiu bergerak menyusuri aquarium yang ada.");
        Talk();
    }
    
    /**@brief AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    public void AnimalDescription(){
        System.out.println("Hiu merupakan salah satu hewan ganas yang terdapat di air.");
        System.out.println("Hiu mempunyai tubuh yang dilapisi kulit dermal denticle yang melindungi mereka dari kerusakan dari parasit.");
        System.out.println("Hiu juga diceritakan dalam beberapa mitologi di hawaii, yaitu cerita tenatng manusia hiu.");
    }
}
