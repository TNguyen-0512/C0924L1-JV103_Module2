package ss4_class_oop.bai_tap;

public class Fan {
    public static final int SLOW = 1;
    public static final int FAST = 3;
    public static final int MEDIUM = 2;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if(on){
            return "Speed: " + this.getSpeed() + " Color: "+ this.getColor()+" Radius: "+this.getRadius()+ " \nFan is on";
        }else{
            return "Color: " + this.getColor()+ " Radius: "+this.getRadius()+ " \nFan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(MEDIUM,true,10,"Yellow");
        System.out.println("Fan 1: "+fan1.toString());
        Fan fan2 = new Fan(MEDIUM,false,5,"Blue");
        System.out.println("Fan 2: "+fan2.toString());
    }
}
