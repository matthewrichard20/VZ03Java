package zoo;

import java.util.Random;
import zoo.animal.*;
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
        if (GetCell(1,14).GetCage()!=null){
            GetCell(1,14).GetCage().SetAnimal(eagle1);
            GetCell(1,14).GetCage().GetAnimal().SetX(14);
            GetCell(1,14).GetCage().GetAnimal().SetY(1);
            animal[n_animal]=eagle1;
            n_animal++;
        }
        Animal blue_tang1 = new BlueTang(600);
        if (GetCell(2,16).GetCage()!=null){
            GetCell(2,16).GetCage().SetAnimal(blue_tang1);
            GetCell(2,16).GetCage().GetAnimal().SetX(16);
            GetCell(2,16).GetCage().GetAnimal().SetY(2);
            animal[n_animal]=blue_tang1;
            n_animal++;
        }
        Animal butterfly1 = new Butterfly(2);
        if (GetCell(5,18).GetCage()!=null){
            GetCell(5,18).GetCage().SetAnimal(butterfly1);
            GetCell(5,18).GetCage().GetAnimal().SetX(18);
            GetCell(5,18).GetCage().GetAnimal().SetY(5);
            animal[n_animal]=butterfly1;
            n_animal++;
        }
        Animal draco1 = new Draco(500);
        if (GetCell(22,10).GetCage()!=null){
            GetCell(22,10).GetCage().SetAnimal(draco1);
            GetCell(22,10).GetCage().GetAnimal().SetX(10);
            GetCell(22,10).GetCage().GetAnimal().SetY(22);
            animal[n_animal]=draco1;
            n_animal++;
        }
        Animal giraffe1 = new Giraffe(1600000);
        if (GetCell(22,42).GetCage()!=null){
            GetCell(22,42).GetCage().SetAnimal(giraffe1);
            GetCell(22,42).GetCage().GetAnimal().SetX(42);
            GetCell(22,42).GetCage().GetAnimal().SetY(22);
            animal[n_animal]=giraffe1;
            n_animal++;
        }
        Animal crocs1 = new Crocodile(233000);
        if (GetCell(14,11).GetCage()!=null){
            GetCell(14,11).GetCage().SetAnimal(crocs1);
            GetCell(14,11).GetCage().GetAnimal().SetX(11);
            GetCell(14,11).GetCage().GetAnimal().SetY(14);
            animal[n_animal]=crocs1;
            n_animal++;
        }
        Animal pigeon1 = new Pigeon(6000);
        if (GetCell(2,29).GetCage()!=null){
            GetCell(2,29).GetCage().SetAnimal(pigeon1);
            GetCell(2,29).GetCage().GetAnimal().SetX(29);
            GetCell(2,29).GetCage().GetAnimal().SetY(2);
            animal[n_animal]=pigeon1;
            n_animal++;
        }
        Animal roach1 = new Roach(34);
        if (GetCell(1,1).GetCage()!=null){
            GetCell(1,1).GetCage().SetAnimal(roach1);
            GetCell(1,1).GetCage().GetAnimal().SetX(1);
            GetCell(1,1).GetCage().GetAnimal().SetY(1);
            animal[n_animal]=roach1;
            n_animal++;
        }
        Animal hippo1 = new Hippo(320000);
        if (GetCell(2,7).GetCage()!=null){
            GetCell(2,7).GetCage().SetAnimal(hippo1);
            GetCell(2,7).GetCage().GetAnimal().SetX(7);
            GetCell(2,7).GetCage().GetAnimal().SetY(2);
            animal[n_animal]=hippo1;
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
        
        Animal penguin2 = new Penguin(32000);
        if (GetCell(1,22).GetCage()!=null){
            GetCell(1,22).GetCage().SetAnimal(penguin2);
            GetCell(1,22).GetCage().GetAnimal().SetX(22);
            GetCell(1,22).GetCage().GetAnimal().SetY(1);
            animal[n_animal]=penguin2;
            n_animal++;
        }
        Animal shark1 = new Shark(32000);
        if (GetCell(3,32).GetCage()!=null){
            GetCell(3,32).GetCage().SetAnimal(shark1);
            GetCell(3,32).GetCage().GetAnimal().SetX(32);
            GetCell(3,32).GetCage().GetAnimal().SetY(3);
            animal[n_animal]=shark1;
            n_animal++;
        }
        Animal zebra1 = new Zebra(32000);
        if (GetCell(3,40).GetCage()!=null){
            GetCell(3,40).GetCage().SetAnimal(zebra1);
            GetCell(3,40).GetCage().GetAnimal().SetX(40);
            GetCell(3,40).GetCage().GetAnimal().SetY(3);
            animal[n_animal]=zebra1;
            n_animal++;
        }
        Animal zebra2 = new Zebra(32000);
        if (GetCell(2,41).GetCage()!=null){
            GetCell(2,41).GetCage().SetAnimal(zebra1);
            GetCell(2,41).GetCage().GetAnimal().SetX(41);
            GetCell(2,41).GetCage().GetAnimal().SetY(2);
            animal[n_animal]=zebra2;
            n_animal++;
        }
        Animal bat1 = new Bat(1200);
        if (GetCell(4,46).GetCage()!=null){
            GetCell(4,46).GetCage().SetAnimal(bat1);
            GetCell(4,46).GetCage().GetAnimal().SetX(46);
            GetCell(4,46).GetCage().GetAnimal().SetY(4);
            animal[n_animal]=bat1;
            n_animal++;
        }
        Animal clown1 = new ClownFish(120);
        if (GetCell(4,2).GetCage()!=null){
            GetCell(4,2).GetCage().SetAnimal(clown1);
            GetCell(4,2).GetCage().GetAnimal().SetX(2);
            GetCell(4,2).GetCage().GetAnimal().SetY(4);
            animal[n_animal]=clown1;
            n_animal++;
        }
        Animal clown2 = new ClownFish(120);
        if (GetCell(4,8).GetCage()!=null){
            GetCell(4,8).GetCage().SetAnimal(clown2);
            GetCell(4,8).GetCage().GetAnimal().SetX(8);
            GetCell(4,8).GetCage().GetAnimal().SetY(4);
            animal[n_animal]=clown2;
            n_animal++;
        }
        Animal mantis1 = new Mantis(70);
        if (GetCell(14,0).GetCage()!=null){
            GetCell(14,0).GetCage().SetAnimal(mantis1);
            GetCell(14,0).GetCage().GetAnimal().SetX(0);
            GetCell(14,0).GetCage().GetAnimal().SetY(14);
            animal[n_animal]=mantis1;
            n_animal++;
        }
        Animal mantis2 = new Mantis(70);
        if (GetCell(15,1).GetCage()!=null){
            GetCell(15,1).GetCage().SetAnimal(mantis2);
            GetCell(15,1).GetCage().GetAnimal().SetX(1);
            GetCell(15,1).GetCage().GetAnimal().SetY(15);
            animal[n_animal]=mantis2;
            n_animal++;
        }
        Animal komodo1 = new Komodo(7000);
        if (GetCell(13,1).GetCage()!=null){
            GetCell(13,1).GetCage().SetAnimal(komodo1);
            GetCell(13,1).GetCage().GetAnimal().SetX(1);
            GetCell(13,1).GetCage().GetAnimal().SetY(13);
            animal[n_animal]=komodo1;
            n_animal++;
        }
     
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
