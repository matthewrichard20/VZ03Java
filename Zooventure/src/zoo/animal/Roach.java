package zoo.animal;


import zoo.animal.Insect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */

/** Roach.
  * Kelas Roach untuk membuat hewan kecoak
  */
public class Roach extends Insect{
    /** Konstruktor.
     * Mengkonstruksi kelas kecoak
     * @param w Nilai dari berat badan kecoak*/
    public Roach(int w){
        super(w);
        diet = new DietType(20,'O');
        habitat = new char[2];
        habitat[0] = 'l';
        habitat[1] = 'a';
        code='r';
        name = "Kecoak";
        sound = "...";
        tame = true;
        is_animal = true;
    }
    
     /** Interaksi.
     * Berinteraksi dengan hewan kecoak*/
    public void Interact(){
        AnimalDescription();
        System.out.println("Kecoak menyusuri kandang yang ada dengan menggunakan kaki kaki kecilnya. ");
        System.out.println("Kecoak terkadang menggerakkan antenanya, dan bahkan mengepakkan sayapnya untuk melayang di udara.");
        Talk();
    }
    
    /** AnimalDescription.
     * Menjelaskan secara khusus mengenai hewan*/
    private void AnimalDescription(){
        super.Description();
        System.out.println("Kecoa terdapat hampir di seluruh belahan bumi, kecuali di wilayah kutub.");
        System.out.println("Kecoa sering dianggap sebagai hama dalam bangunan, walaupun tidak semua kecoa yang termasuk kategori hama.");
    }
}
