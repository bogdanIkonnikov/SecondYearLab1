import java.util.Scanner;

public class Point3D {

    private double x, y, z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }

    public static void main(String[] args) {
        Point3D point1 = new Point3D(1,2,3);
        Point3D point2 = new Point3D();
        if(point1 == point2) {
            System.out.println()
        }


    }
}


