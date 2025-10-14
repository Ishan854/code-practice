import java.util.*;
public class CylinderConstruct {
    private int radius;
    private int height;
    public CylinderConstruct(){
        radius=height=1;
    }
    public CylinderConstruct(int h, int r){
        radius = r;
        height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        if(h>=0){
            height =h;
        }
        else{
            height = 0;
        }
    }
    public void setRadius(int r){
        if(r>=0){
            radius =r;
        }
        else{
            radius = 0;
        }
    }
    public void setDimension(int r, int h){
        height = h;
        radius = r;
    }

    public double lidArea(){
        return Math.PI*radius*radius;
    }
     public double perimeter(){
        return 2*Math.PI*radius;
    }
     public double drumArea(){
        return  2*lidArea()+perimeter()*height;
    }
     public double volume()
    {
        return lidArea()*height;
    }
    public static void main(String[] args) {
        CylinderConstruct c = new CylinderConstruct();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimension(10,7);
        

        System.out.println("Area : " + c.lidArea());
        System.out.println("Perimeter : " + c.perimeter());
        System.out.println("Volume : " + c.volume());

        System.out.println("Height : " + c.getHeight());
        System.out.println("Radius : " + c.getRadius());

    }
}