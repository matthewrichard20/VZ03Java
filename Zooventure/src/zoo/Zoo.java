package zoo;

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


/**
 *
 * @author RichardMatthew
 */
public class Zoo {
    Cell map[][];
    Animal animal[];
    int p;
    int l;
    static int n_animal;
    int ent_p;
    int ent_l;

    public Zoo (int _p, int _l){
        p= _p;
        l=_l;
        map = new Cell[p][l];
      
        animal = new Animal[40];  
  
    }
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
            case ('P') :
            case ('R') :
            case ('-') :
            case ('E') : 
            case ('X') : {
                map[i][j] = new Facility(c);
            } break;
        }
    }    
    public void MoveAnimal(int x, int y){
        int to = 1;
        int count = 0;
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
            map[tox][toy].GetCage().SetAnimal(map[x][y].GetCage().GetAnimal());
            map[x][y].GetCage().ClearAnimal();
            moved = true;
            } else {
            to = (to % 4) + 1;
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
        return ((map[fromx][fromy].GetHabitat() == map[tox][toy].GetHabitat()) && (map[tox][toy].IsCageAvailable()));
    }

    public Cell GetCell(int i, int j){
        return map[i][j];
    }
    
    public int GetPanjang(){
        return p;
    }

    public int GetLebar(){
        return l;
    }

    public int GetEntP(){ return ent_p;};

    public int GetEntL(){return ent_l;};

    public int GetNAnimal(){
        return n_animal;
    }


public void SetAnimals(){
  Animal eagle1 = new Eagle(5000);
  if (((Habitat)GetCell(1,1)).GetCage()!=null){
    ((Habitat)GetCell(1,1)).GetCage().SetAnimal(eagle1);
    ((Habitat)GetCell(1,1)).GetCage().GetAnimal().SetX(1);
    ((Habitat)GetCell(1,1)).GetCage().GetAnimal().SetY(1);
    animal[n_animal]=eagle1;
    n_animal++;
  }
  Animal blue_tang1 = new BlueTang(600);
  if (((Habitat)GetCell(0,13)).GetCage()!=null){
    ((Habitat)GetCell(0,13)).GetCage().SetAnimal(blue_tang1);
    ((Habitat)GetCell(0,13)).GetCage().GetAnimal().SetX(13);
    ((Habitat)GetCell(0,13)).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=blue_tang1;
    n_animal++;
  }
  Animal butterfly1 = new Butterfly(2);
  if (((Habitat)GetCell(2,18)).GetCage()!=null){
    ((Habitat)GetCell(2,18)).GetCage().SetAnimal(butterfly1);
    ((Habitat)GetCell(2,18)).GetCage().GetAnimal().SetX(18);
    ((Habitat)GetCell(2,18)).GetCage().GetAnimal().SetY(2);
    animal[n_animal]=butterfly1;
    n_animal++;
  }
  Animal draco1 = new Draco(500);
  if (((Habitat)GetCell(3,22)).GetCage()!=null){
    ((Habitat)GetCell(3,22)).GetCage().SetAnimal(draco1);
    ((Habitat)GetCell(3,22)).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(3,22)).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=draco1;
    n_animal++;
  }
  Animal giraffe1 = new Giraffe(1600000);
  if (((Habitat)GetCell(3,13)).GetCage()!=null){
    ((Habitat)GetCell(3,13)).GetCage().SetAnimal(giraffe1);
    ((Habitat)GetCell(3,13)).GetCage().GetAnimal().SetX(13);
    ((Habitat)GetCell(3,13)).GetCage().GetAnimal().SetY(3);
    animal[n_animal]=giraffe1;
    n_animal++;
  }
  Animal lion1 = new Lion(233000);
  if (((Habitat)GetCell(1,26)).GetCage()!=null){
    ((Habitat)GetCell(1,26)).GetCage().SetAnimal(lion1);
    ((Habitat)GetCell(1,26)).GetCage().GetAnimal().SetX(26);
    ((Habitat)GetCell(1,26)).GetCage().GetAnimal().SetY(1);
    animal[n_animal]=lion1;
    n_animal++;
  }
  Animal pigeon1 = new Pigeon(6000);
  if (((Habitat)GetCell(2,30)).GetCage()!=null){
    ((Habitat)GetCell(2,30)).GetCage().SetAnimal(pigeon1);
    ((Habitat)GetCell(2,30)).GetCage().GetAnimal().SetX(30);
    ((Habitat)GetCell(2,30)).GetCage().GetAnimal().SetY(2);
    animal[n_animal]=pigeon1;
    n_animal++;
  }
  Animal roach1 = new Roach(34);
  if (((Habitat)GetCell(2,33)).GetCage()!=null){
    ((Habitat)GetCell(2,33)).GetCage().SetAnimal(roach1);
    ((Habitat)GetCell(2,33)).GetCage().GetAnimal().SetX(33);
    ((Habitat)GetCell(2,33)).GetCage().GetAnimal().SetY(2);
    animal[n_animal]=roach1;
    n_animal++;
  }
  Animal penguin1 = new Penguin(32000);
  if (((Habitat)GetCell(1,36)).GetCage()!=null){
    ((Habitat)GetCell(1,36)).GetCage().SetAnimal(penguin1);
    ((Habitat)GetCell(1,36)).GetCage().GetAnimal().SetX(36);
    ((Habitat)GetCell(1,36)).GetCage().GetAnimal().SetY(1);
    animal[n_animal]=penguin1;
    n_animal++;
  }
  /* lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   lion = new Lion(60);
  if (((Habitat)GetCell(0,28).GetCage()!=null){
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }{
    ((Habitat)GetCell(0,28).GetCage().SetAnimal(lion);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetX(28);
    ((Habitat)GetCell(0,28).GetCage().GetAnimal().SetY(0);
    animal[n_animal]=lion;
    n_animal++;
  }
   */
}

}

