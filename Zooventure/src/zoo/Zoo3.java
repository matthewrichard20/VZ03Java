/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lathifah Nurrahmah
 */
public class Zoo3 {

    /**main
     * program utama dari zoo
     * @param args the command line arguments
     * -
     * @throws java.io.IOException
     * -
     */
    public static void main(String[] args) throws IOException {
        Driver driver = new Driver();
        Zoo zoo = new Zoo(50,50);
        System.out.println("Pilihan masukan untuk Virtual Zoo");
        System.out.println("1. Baca file");
        System.out.println("2. Tampilkan peta awal");
        System.out.println("3. Lakukan simulasi tur");
        System.out.println("4. Menghitung banyak makanan yang diperlukan untuk"
                + "memberi makan seluruh hewan");
        System.out.println("5. Keluar");
        System.out.print("Masukkan indeks pilihan: ");
        Scanner reader = new Scanner (System.in);
        int input = reader.nextInt();
        while (input != 5){
            switch (input) {
                case 1:
                    zoo = driver.ReadZoo();
                    System.out.print("Proses telah selesai.");
                    break;
                case 2:
                    driver.PrintMap(zoo);
                    System.out.print("Proses telah selesai.");
                    break;
                case 3:
                    driver.DoTour(zoo);
                    System.out.print("Proses telah selesai.");
                    break;
                case 4:
                    driver.FoodCalculation(zoo);
                    System.out.print("Proses telah selesai.");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Masukan salah");
                    break;
            }
            reader = new Scanner (System.in);
            
            
            System.out.println("Pilihan masukan untuk Virtual Zoo");
            System.out.println("1. Baca file");
            System.out.println("2. Tampilkan peta awal");
            System.out.println("3. Lakukan simulasi tur");
            System.out.println("4. Menghitung banyak makanan yang diperlukan untuk"
                + "memberi makan seluruh hewan");
            System.out.println("5. Keluar");
            System.out.print("Masukkan indeks pilihan: ");
            input = reader.nextInt();
        }
    }
    
}
