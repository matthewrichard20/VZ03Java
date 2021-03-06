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

/** StingRay.
  * Kelas StingRay untuk membuat hewan hiu
  */
public class Shark extends Pisces{
    /** Konstruktor.
     * Mengkonstruksi kelas hiu
     * @param w Nilai dari berat badan hiu
     */
    public Shark(int w){
        super(w);
        diet = new DietType(70,'C');
        habitat = new char[2];
        habitat[0] = 'w';
        habitat[1] = '0';
        code='S';
        name = "Hiu";
        sound = "...";
        tame = false;
        is_animal = true;
    }
    
    /** Interaksi.
     * Berinteraksi dengan hewan hiu*/
    public void Interact(){
        AnimalDescription();
        System.out.println("Hiu bergerak menyusuri aquarium yang ada.");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    private void AnimalDescription(){
        super.Description();
        System.out.println("Hiu merupakan salah satu hewan ganas yang terdapat di air.");
        System.out.println("Hiu mempunyai tubuh yang dilapisi kulit dermal denticle yang melindungi mereka dari kerusakan dari parasit.");
        System.out.println("Hiu juga diceritakan dalam beberapa mitologi di hawaii, yaitu cerita tenatng manusia hiu.");
    }
}
