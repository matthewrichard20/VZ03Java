package zoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Renderable
 * interface yang digunakan untuk menampilkan kode yang mewakili
 * masing-masing cell dalam virtual zoo
 * @author Lathifah Nurrahmah
 */
public interface Renderable {
    /**Render
     * method yang digunakan untuk menampilkan kode yang mewakili
     * satu cell pada virtual zoo
     * @return char
     * karakter pembeda tiap cell
     */
    public char Render();
}
