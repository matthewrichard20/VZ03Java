/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

import zoo.cell.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lathifah Nurrahmah
 */

/**Class Driver
 * kelas yang menangani fungsi-fungsi besar virtual zoo
 */
public class Driver {
    /**ReadZoo()
     * fungsi untuk membaca suatu file yang memuat informasi peta zoo
     * @return zoo
     * @throws IOException
     * -
     */
    public Zoo ReadZoo() throws IOException{
        char[] input = null;
        int length = 0;
        File file = new File("map.txt");
        FileReader reader;
        reader = null;
        try{
            reader = new FileReader(file);
            length = (int) file.length();
            input = new char[length];
            reader.read(input);
            reader.close();
        } catch (IOException e){
        } finally {
            if(reader != null){
                reader.close();
            }
        }
        Zoo zoo = new Zoo(50, 50);
        ConvertFromFile(input, zoo, length);
        zoo.SetAnimals();
        return zoo;
    }

    /**PrintMap
     * menyetak peta zoo
     * @param zoo
     * zoo yang ingin ditampilkan
     */
    public void PrintMap(Zoo zoo){
        for (int i = 0; i < zoo.GetPanjang(); i++){
            for (int j = 0; j < zoo.GetLebar(); j++){
                System.out.print(zoo.GetCell(i, j).Render());
            }
            System.out.println("");
        }      
    }

    /**PrintMap
     * menyetak peta zoo dengan parameter tambahan poin user
     * @param zoo
     * zoo yang ingin dicetak
     * @param user
     * nilai point keberadaan user
     */
    public void PrintMap(Zoo zoo, Point user){
        for (int i = 0; i < zoo.GetPanjang(); i++){
            for (int j = 0; j < zoo.GetLebar(); j++){
                if (i != user.GetY() || j != user.GetX()){
                    System.out.print(zoo.GetCell(i, j).Render());
                } else {
                    System.out.print('u');
                }
            }
            System.out.println("");
        }
    }

    /**DoTour
     * melakukan tur pada virtual zoo
     * @param zoo
     * Tur akan dilakukan pada zoo
     */
    public void DoTour(Zoo zoo){
        Point user = new Point(zoo.GetEntL(), zoo.GetEntP());
        boolean available = true;
        Point[] visited = new Point [500];
        int i = 0;
        visited[0]= user;
        while (available && zoo.GetCell(user.GetY(), user.GetX()) instanceof Facility &&
            zoo.GetCell(user.GetY(), user.GetX()).Render() != 'X'){
            PrintMap(zoo, user);
            zoo.CheckAround(user.GetY(), user.GetX());
            System.out.println("");
            Point[] temp = new Point [4];
            temp[0] = new Point (user.GetX(), user.GetY()+1);
            temp[1] = new Point (user.GetX(), user.GetY()-1);
            temp[2] = new Point (user.GetX()+1, user.GetY());
            temp[3] = new Point (user.GetX()-1, user.GetY());
            boolean route_found = false;
            int j = 0;
            int exit = 4;
            while (j < 4 && !route_found){
                if (IsPointRouteAvailable(temp[j], zoo, visited, i)){
                    route_found = true;
                    i++;
                    visited[i] = temp[j];
                    user = temp[j];
                } else if (zoo.IsInArea(temp[j]) &&
                        zoo.GetCell(temp[j].GetY(), temp[j].GetX()).Render()=='X'){
                    exit = j;
                }
                j++;
            }
            zoo.MoveAnimal();
            if (!route_found){
                if (exit != 5){
                    user = temp[exit];
                }
                available = false;
            }
        }
        PrintMap(zoo, user);
    }
    
    /**IsPointRouteAvailable
     * menembalikan kondisi apakah suatu point dapat dilewati oleh user atau tidal
     * dengan kriteria belum pernah dikunjungi
     * @param point
     * point yang akan dicek kondisinya
     * @param zoo
     * zoo point berada
     * @param visited
     * suatu array of point yang menyatakan point-point yang telah dilewati user
     * @param n
     * besarnya array of point
     * @return boolean yang menyatakan rute dapat dilewati
     */
    private boolean IsPointRouteAvailable (Point point, Zoo zoo, Point[] visited, int n){
        return (point.GetX() >= 0 && point.GetX() < zoo.GetLebar() && point.GetY()>=0 &&
                point.GetY() < zoo.GetPanjang() && !point.IsMember(visited,n) && zoo.IsRoute(point));
    }
    
    /**ConvertFromFile
     * mengimplementasikan data yang diperoleh dari file menjadi bentuk zoo
     * @param input
     * array of char yang menyatakan data yang diperoleh dari file
     * @param zoo
     * zoo yang akan menjadi implementasi dari data
     * @param length
     * panjang dari file input
     */
    private void ConvertFromFile(char[] input, Zoo zoo, int length){
        int y = 0;
        int x = 0;
        int lebar = 0;
        for (int i = 0; i < length ; i = i + 1){
            if (input[i]=='\n'){
                y = y + 1;
                lebar = x;
                x = -1;
            } else {
                zoo.SetCell(input[i], y, x);
            }
            x = x+1;
        }
        zoo.SetLebar(lebar-1);
        zoo.SetPanjang(y+1);
    }
    
    /**FoodCalculation
     * menghitung perkiraan jumlah makanan yang diperlukan untuk
     * memberi makan seluruh animal dalam sehari
     * @param zoo
     * virtual zoo yang akan dilakukan perhitungan makanan
     */
    public void FoodCalculation(Zoo zoo){
        double carn = 0;
        double herb = 0;
        double omni = 0;
        for (int i = 0; i < zoo.GetNAnimal(); i++){
            zoo.GetAllAnimal()[i].Feed();
            switch (zoo.GetAllAnimal()[i].GetDiet().GetDietCode()) {
                case 'C':
                    carn = carn + (zoo.GetAllAnimal()[i].CalculateFood()/1000);
                    break;
                case 'H':
                    herb = herb + (zoo.GetAllAnimal()[i].CalculateFood()/1000);
                    break;
                case 'O':
                    omni = omni + (zoo.GetAllAnimal()[i].CalculateFood()/1000);
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Makanan daging yang dibutuhkan adalah %.5f kg", carn);
        System.out.println();
        System.out.printf("Makanan tumbuhan yang dibutuhkan adalah %.5f kg", herb);
        System.out.println();
        System.out.printf("Makanan campuran daging dan sayur yang dibutuhkan adalah %.5f kg", omni);
        System.out.println();
    }
    
}
