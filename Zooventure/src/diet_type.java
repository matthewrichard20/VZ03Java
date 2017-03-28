/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class diet_type {
    int umum = 60;
    int portion;
    char code;
            
    /** @brief Constructor.
      * Menciptakan DietType kosong yang memiliki portion 0
      */
    diet_type(){
        portion = umum;
    }
    
    /** @brief Constructor with parameter.
      * Menciptakan DietType dengan portion sebnyak p
      * @param p banyaknya porsi makanan yang dibutuhkan per hewan
      */
    diet_type(int p){
        portion = p;
    }
    
    /** @brief getCode.
     * Mengembalikan satu char yang merupakan kode pembeda
     * @return code
     * satu char yang merupakan kode pembeda
     */
    public char GetCode(){
        return code;
    }
    
    /**@brief getPortion.
     * Mengembalikan porsi hewan relatif terhadap berat badan
     * @return portion
     * banyakanya porsi makanan hewan, relatif terhadap berat badan
     */
    public int GetPortion(){
        return portion;
    }
}
