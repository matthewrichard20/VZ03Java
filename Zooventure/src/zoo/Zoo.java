package zoo;

import java.util.Random;
import zoo.animal.Animal;
import zoo.animal.BlueTang;
import zoo.animal.Butterfly;
import zoo.animal.Draco;
import zoo.animal.Eagle;
import zoo.animal.Giraffe;
import zoo.animal.Lion;
import zoo.animal.Penguin;
import zoo.animal.Pigeon;
import zoo.animal.Roach;
import zoo.cell.Cell;
import zoo.cell.Facility;
import zoo.cell.Habitat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**Class Zoo
 * kelas yang memiliki seluruh elemen dari virtual zoo
 * @author RichardMatthew
 */
public class Zoo {
    Cell map[][];
    Animal animal[];
    int p;
    int l;
    static int n_animal;
    int entrance_p;
    int entrance_l;

    /**Constructor
     * menginisialisasi suatu virtual zoo kosong
     * @param _p
     * panjang dari virtual zoo
     * @param _l
     * lebar dari virtual zoo
     */
    public Zoo (int _p, int _l){
        p= _p;
        l=_l;
        map = new Cell[p][l];
        for (int i = 0 ; i < p ; i ++){
            map[i] = new Cell [l];
            for (int j = 0 ; j < l ; j++){
                map[i][j] = new Cell();
            }
        }
      
        animal = new Animal[40];  
  
    }

    /**SetCell
     * mengeset suatu cell pada indeks (i,j) berdasarkan
     * karakter kode
     * @param c
     * karakter yang mewakili satu cell pada virtual zoo
     * @param i
     * indeks memanjang dari map
     * @param j
     * indeks melebar dari map
     */
    public void SetCell(char c, int i , int j){
        switch (c) {
            case ('W') :
            case ('A') :
            case ('L') :
            case ('w') : 
            case ('a') : 
            case ('l') : {
                map[i][j] = new Habitat(c);
            } break; // habitat aja
            case ('E') : 
                entrance_l = j;
                entrance_p = i;
            case ('P') :
            case ('R') :
            case ('-') :
            case ('X') : {
                map[i][j] = new Facility(c);
            } break;
        }
    }    
    
    /**SetPanjang
     * Mengeset panjang dari zoo
     * @param _p
     * nilai yang akan diset sebagai panjang zoo
     */
    public void SetPanjang(int _p){
        p = _p;
    }
    
    /**SetLebar
     * Mengeset lebar dari zoo
     * @param _l
     * nilai yang akan diset sebagai lebar zoo
     */
    public void SetLebar(int _l){
        l = _l;
    }
    
    /**MoveAnimal
     * Membuat tiap animal dalam satu cage dapat bergerak-gerak
     */
    public void MoveAnimal(){
        for (int i = 0; i < n_animal; i++){
            Random rand = new Random();
            int to = rand.nextInt(4)+1;
            int count = 0;
            int x = animal[i].GetX();
            int y = animal[i].GetY();
            boolean moved = false;
            while ((!moved) && (count<4)){
                count++;
                int tox=x;
                int toy=y;
                switch (to){
                case 1 :
                    tox++;
                    break;
                case 2:
                    toy++;
                    break;
                case 3:
                    tox--;
                    break;
                case 4:
                    toy--;
                    break;
                }
                if (CanMoveAnimal(x,y,tox,toy)){
                    map[toy][tox].GetCage().SetAnimal(map[y][x].GetCage().GetAnimal());
                    map[toy][tox].GetCage().GetAnimal().SetX(tox);
                    map[toy][tox].GetCage().GetAnimal().SetY(toy);
                    map[y][x].GetCage().ClearAnimal();
                    animal[i]= map[toy][tox].GetCage().GetAnimal();
                    moved = true;
                } else {
                    to = (to % 4) + 1;
                }
            }
        }
    }
    /**  mengecek apakah bisa memindahkan hewan
     *  prekondisi, map[fromx][fromy] adalah habitat dengan cage
     * @param fromx absis asal
     * @param fromy ordinat asal
     * @param tox absis tujuan
     * @param toy ordinat tujuan
     * @return true jika hewan dapat berpindah ke (tox,toy)
    */
    public boolean CanMoveAnimal(int fromx, int fromy, int tox, int toy){
        Point point = new Point (tox,toy);
        if (IsInArea(point)){
            return ((map[fromy][fromx].GetHabitat() == map[toy][tox].GetHabitat()) &&
                    map[toy][tox].IsCage()&& (map[toy][tox].IsCageAvailable()));
        } else {
            return false;
        }
    }

    /**GetCell
     * mengembalikan suatu cell pada zoo di indeks (i,j)
     * @param i
     * indeks memanjang
     * @param j
     * indeks melebar
     * @return cell
     */
    public Cell GetCell(int i, int j){
        return map[i][j];
    }
    
    /**GetPanjang
     * mengembalikan panjang zoo
     * @return int panjang
     */
    public int GetPanjang(){
        return p;
    }

    /**GetLebar
     * mengembalikan lebar zoo
     * @return int lebar
     */
    public int GetLebar(){
        return l;
    }

    /**GetEntP
     * mengembalikan indeks memanjang dari pintu masuk zoo
     * @return int entrance_p
     */
    public int GetEntP(){ 
        return entrance_p;
    }

    /**GetEntL
     * mengembalikan indeks melebar dari pintu masuk zoo
     * @return int entrance_l
     */
    public int GetEntL(){
        return entrance_l;
    }

    /**GetNAnimal
     * mengembalikan nilai banyaknya animal pada virtual zoo
     * @return int n_animal
     */
    public int GetNAnimal(){
        return n_animal;
    }
    
    /**GetAllAnimal
     * mengembalikan suatu array of animal yang mewakili seluruh animal yang
     * ada pada virtual zoo
     * @return array of animal
     */
    public Animal[] GetAllAnimal(){
        return animal;
    }

    /**SetAnimals
     * mengeset animal pada virtual zoo dengan cara hardcode
     */
    public void SetAnimals(){
        n_animal = 0;
        Animal eagle1 = new Eagle(5000);
        if (GetCell(14,1).GetCage()!=null){
            System.out.println("Test");
            GetCell(14,1).GetCage().SetAnimal(eagle1);
            GetCell(14,1).GetCage().GetAnimal().SetX(14);
            GetCell(14,1).GetCage().GetAnimal().SetY(1);
            animal[n_animal]=eagle1;
    n_animal++;
  }
  Animal blue_tang1 = new BlueTang(600);
  if (GetCell(16,2).GetCage()!=null){
    GetCell(16,2).GetCage().SetAnimal(blue_tang1);
    GetCell(16,2).GetCage().GetAnimal().SetX(16);
    GetCell(16,2).GetCage().GetAnimal().SetY(2);
    animal[n_animal]=blue_tang1;
    n_animal++;
  }
  Animal butterfly1 = new Butterfly(2);
  if ( GetCell(18,5).GetCage()!=null){
     GetCell(18,5).GetCage().SetAnimal(butterfly1);
     GetCell(18,5).GetCage().GetAnimal().SetX(18);
     GetCell(18,5).GetCage().GetAnimal().SetY(5);
    animal[n_animal]=butterfly1;
    n_animal++;
  }
  /*
  Animal draco1 = new Draco(500);
  if (GetCell(3,22).GetCage()!=null){
    GetCell(3,22).GetCage().SetAnimal(draco1);
    GetCell(3,22).GetCage().GetAnimal().SetX(28);
    GetCell(3,22).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=draco1;
    n_animal++;
  }
  Animal giraffe1 = new Giraffe(1600000);
  if (GetCell(3,13).GetCage()!=null){
    GetCell(3,13).GetCage().SetAnimal(giraffe1);
    GetCell(3,13).GetCage().GetAnimal().SetX(13);
    GetCell(3,13).GetCage().GetAnimal().SetY(3);
    animal[n_animal]=giraffe1;
    n_animal++;
  }
  Animal lion1 = new Lion(233000);
  if (GetCell(1,26).GetCage()!=null){
    GetCell(1,26).GetCage().SetAnimal(lion1);
    GetCell(1,26).GetCage().GetAnimal().SetX(26);
    GetCell(1,26).GetCage().GetAnimal().SetY(1);
    animal[n_animal]=lion1;
    n_animal++;
  }
  Animal pigeon1 = new Pigeon(6000);
  if (GetCell(2,30).GetCage()!=null){
    GetCell(2,30).GetCage().SetAnimal(pigeon1);
    GetCell(2,30).GetCage().GetAnimal().SetX(30);
    GetCell(2,30).GetCage().GetAnimal().SetY(2);
    animal[n_animal]=pigeon1;
    n_animal++;
  }
  Animal roach1 = new Roach(34);
  if (GetCell(2,33).GetCage()!=null){
    GetCell(2,33).GetCage().SetAnimal(roach1);
    GetCell(2,33).GetCage().GetAnimal().SetX(33);
    GetCell(2,33).GetCage().GetAnimal().SetY(2);
    animal[n_animal]=roach1;
    n_animal++;
  }
  Animal penguin1 = new Penguin(32000);
  if (GetCell(1,36).GetCage()!=null){
    GetCell(1,36).GetCage().SetAnimal(penguin1);
    GetCell(1,36).GetCage().GetAnimal().SetX(36);
    GetCell(1,36).GetCage().GetAnimal().SetY(1);
    animal[n_animal]=penguin1;
    n_animal++;
  }
  */
}

    /**CheckAround
     * mengecek sekaligus berinteraksi dengan sekitar
     * @param y
     * indeks memanjang dari poin awal
     * @param x
     * indek melebar dari poin awal
     */
    public void CheckAround(int y, int x){
        Point [] checked = new Point [100];
        int i = -1;
        Point [] temp = new Point [4];
        temp [0] = new Point (x, y-1);
        temp [1] = new Point (x, y+1);
        temp [2] = new Point (x-1, y);
        temp [3] = new Point (x+1, y);
        for (int j = 0; j < 4; j++){
            if ( IsInArea(temp[j])){
                if (map[temp[j].GetY()][temp[j].GetX()] instanceof Facility){
                    ((Facility)map[temp[j].GetY()][temp[j].GetX()]).Interact();
                } else {
                    char habitat = map[temp[j].GetY()][temp[j].GetX()].GetHabitat();
                    i = RecursiveCheck(checked, i, temp[j],habitat);
                }
            }
        }
    }
    
    /**RecursiveCheck
     * melakukan pengecekan sekaligus interaksi dengan suatu cage
     * @param checked
     * array of point yang menyatakan seluruh poin yang telah dicek
     * @param n
     * banyaknya elemen dari checked
     * @param to_be_checked
     * poin yang akan dicek sekitarnya
     * @param habitat
     * karakter kode dari habitat yang dicek untuk memastikan pengecekan cage
     * tidak melewati habitat yang berbeda
     * @return int
     * mengembalikan banyaknya elemen checked
     */
    private int RecursiveCheck(Point[] checked, int n, Point to_be_checked, char habitat){
        if (IsInArea(to_be_checked) && map[to_be_checked.GetY()][to_be_checked.GetX()] instanceof Habitat){
            if(IsCage(to_be_checked) && !to_be_checked.IsMember(checked, n)
                && map[to_be_checked.GetY()][to_be_checked.GetX()].GetHabitat() == habitat && n <100){
                InteractWithAnimal(to_be_checked);
                n = 1+n;
                checked[n]=to_be_checked;
                Point up = new Point(to_be_checked.GetX(), to_be_checked.GetY()-1);
                n = RecursiveCheck(checked, n, up, habitat);
                Point left = new Point(to_be_checked.GetX()-1, to_be_checked.GetY());
                n = RecursiveCheck(checked, n, left, habitat);
                Point right = new Point(to_be_checked.GetX()+1, to_be_checked.GetY());            
                n = RecursiveCheck(checked, n, right, habitat);
                Point down = new Point(to_be_checked.GetX(), to_be_checked.GetY()+1);
                n = RecursiveCheck(checked, n, down, habitat);
            }
        }
        return n;
    }
    
    /**IsRoute
     * mengembalikan kondisi apakah point merupakan suatu route atau bukan
     * @param point
     * point yang akan dicek
     * @return boolean
     */
    public boolean IsRoute(Point point){
        return (map[point.GetY()][point.GetX()].Render()=='-');
    }
    
    /**IsInArea
     * mengembalikan kondisi apakah suatu poin masih berada pada area virtual zoo
     * atau tidak
     * @param point
     * point yang akan dicek
     * @return boolean
     */
    public boolean IsInArea (Point point){
        return (point.GetY()>=0 && point.GetY()<p && point.GetX()>=0 && point.GetX()<l);
    }
    
    /**IsCage
     * mengecek apakah suatu poin merupakan cage atau bukan
     * @param point
     * point yang akan dicek
     * @return boolean
     * kondisi apakah cage atau bukan
     */
    private boolean IsCage (Point point){
        return(map[point.GetY()][point.GetX()] instanceof Habitat && 
                map[point.GetY()][point.GetX()].IsCage());
    }
    
    /**InteractWithAnimal
     * Melakukan interaksi dengan animal pada suatu poin
     * @param point 
     * poin animal tersebut berada
     */
    private void InteractWithAnimal (Point point){
        if (!(map[point.GetY()][point.GetX()].GetCage().IsCageEmpty())){
            map[point.GetY()][point.GetX()].GetCage().GetAnimal().Interact();
        }
    }

}