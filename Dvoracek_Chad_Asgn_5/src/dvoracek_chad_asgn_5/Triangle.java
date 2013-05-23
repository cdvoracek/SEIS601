/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_5;

/**
 *
 * @author Chad
 */
public class Triangle implements Calculated {
int base, height,x,y;
double area;
float hypot;
float Perimeter;
public Triangle  (int bs, int ht, int tx, int ty ){
base = bs;
height = ht;
x = tx;
y= ty;
hypot = (float) Math.sqrt((Math.pow(base,2))+ (Math.pow(height,2)));
area = (.5* base)*height;

Perimeter = base+height+hypot;

}    

    public void setTBase(int base) {
        this.base = base;
    }

    public void setTHeight(int height) {
        this.height = height;
    }

    public void setTX(int x) {
        this.x = x;
    }

    public void setTY(int y) {
        this.y = y;
    }
    
    public void setTXandY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double calculateArea()
    {return 2;}
    
    public double calculatePerimeter()
    {return 3;}
    
    public void dump()
            
    {}
    
    
    
}
