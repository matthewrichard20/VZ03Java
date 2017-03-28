 package zoo.animal;

import zoo.Renderable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ega Rifqi Saputra
 */


/**Animal
 * Kelas yang menangani hewan-hewan pada zoo
 */
public class Animal implements Renderable{
    protected DietType diet;
    char[] habitat;
    char code;
    String name;
    String sound;
    boolean tame;
    boolean is_animal;
    int weight;
    private int x;
    private int y;
    
    
    /**
     * Mengalokasikan parameter class Animal
     * @param w 
     * Nilai berat badan dari suatu Animal
     */
    public Animal(int w){
        weight = w;
        tame = true;
        is_animal = false;
    }
    
    /**Mengembalikan nama dari hewan
     * @return 
     * Mengambil nama dari suatu hewan
     */
    public String GetName(){
        return name;
    }
    
    public DietType GetDiet(){
        return diet;
    }
    
    /**Mengembalikan jenis habitat dari hewan
     * @return 
     * Mengambil habitat dari suatu hewan
     */
    public char[] GetHabitat(){
        return habitat;
    }
    
     
    /**Memberikan makanan kepada hewan
     */
    public void Feed(){
        System.out.print(name);
        diet.Feeds(CalculateFood());
        System.out.print(name);
        System.out.print(" menikmati makanannya dengan lahap");
    }
    
    /**Mengubah kondisi jinak tidaknya hewan
     * @param _tame 
     * kondisi jinak yang ingin diubah
     */
    public void ChangeTame(boolean _tame){
        tame = _tame;
    }
    
    /**Berbicara dengah hewan
     */
    public void Talk(){
        System.out.println(sound);
    }
    
    /**Mengembalikan karakter tampilan untuk hewan
     * @return code
     * code yang merepresentasikan suatu hewan pada tampilan di layar
     */
    
    public char Render(){
        return code;
    }
    
    /**Menghitung gram makanan untuk hewan
     * @return 
     * Mengembalikan nilai makanan yang dibutuhkan hewan
     */
    public int CalculateFood(){
        return (weight * diet.GetPortion());
    }
    
    
    /**Mengambil posisi x dari hewan
     * @return x
     * Posisi x dari suatu hewan
     */
    public int GetX(){
        return x;
    }
    
    /**Mengambil posisi y dari hewan
     * @return y
     * Posisi y dari suatu hewan
     */
    public int GetY(){
        return y;
    }
    
    /**Menentukan nilai x
     * @param _x 
     * posisi animal dari nilai x
     */
    public void SetX(int _x){
        x = _x;
    }
    
    /**Menentukan nilai y
     * @param _y 
     * posisi animal dari nilai y
     */
    public void SetY(int _y){
        y = _y;
    }
    
}