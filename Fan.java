/**
 * @(#)Fan.java
 *
 *
 * @author 
 * @version 1.00 2014/4/26
 */


public class Fan {
    //私有数据域
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    //类常量
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;    
    
    //构造方法
    public Fan() {
    	speed = SLOW;
    	on = false;
    	radius = 5.0;
    	color = new String("blue");
    }
    
    //访问器和修改器方法
    public int getSpeed(){
    	return speed;
    }
    
    public void setSpeed(int newSpeed){
    	speed = newSpeed;
    }
    
    public boolean isOn(){
    	return on;
    }
    
    public void setOn(boolean newStatus){
    	on = newStatus;
    }
    
    public double getRadius(){
    	return radius;
    }
    
    public void setRadius(double newRadius){
    	radius = newRadius;
    }
    
    public String getColor(){
    	return color;
    }
    
    public void setColor(String newColor){
    	color = newColor;
    }
    
    public String toString(){
    	if(on){
    		return "speed:" + speed + "radius: " + radius + "color: " + color;
    	}
    	else{
    		return "fan is off." + "color: " + color + "radius: " + radius;
    	}//end of if-else
    }//end of the method
}//end of the class Fan