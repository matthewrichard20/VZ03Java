package zoo.cell;

import zoo.Renderable;
import zoo.animal.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RichardMatthew
 */
public class Cell implements Renderable {

    char code;
    int x;
    int y;
    boolean visited;
    public Cell() {
    }
    
public Animal GetAnimal() {return null;}

public void SetAnimal(Animal x){}

public char GetHabitat() {return ' ';}

public boolean IsCageAvailable() {return false;}

    public Cage GetCage(){return null;}

    @Override
    public char Render(){return code;}

public void InitBoolVisited() {visited = false;}

public boolean IsVisited() {return visited;}

public void SetBool( boolean x) {visited = x;}

public void SetAbsis(int a) {x = a;}

public void SetOrdinat(int b) {y = b;}

}