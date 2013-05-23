/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_5;

/**
 *
 * @author Chad
 */
public class Rectangle implements Calculated {
int length, width, x, y;
int perimeter, area;
    public Rectangle (int l, int w, int rx, int ry){
    length = l;
    width = w;
    x = rx;
    y = ry;
    perimeter = length+length+width+width;
    area = length * width;
    
    
        
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setTX(int x) {
        this.x = x;
    }

    public void setTY(int y) {
        this.y = y;
    }
    
    public void setTXandY (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
