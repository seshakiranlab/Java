/*
I will be writing my observations on the code here 
1. Math.PI for PI value in Java
2. There are two classes in this code, 
	a. circle class contains parameters and methods
	b. circleMain contains main methode , Object creation ,methode calling 
3. A dummy function which calls other funtion but does nothing 
4. Also i gave the code name as 106.java but internal class names are circle & circleMain
	Does the class having main methode should have name of the file.
5. I have one more doubt if i want to create 100 objects do i need to initalize 100 times
*/
/*
	Things i want to observe
	1. will it compile with 106.java .. If so invoking java circleMain will it work
		as expected in created two class files
		circle.class
		circleMain.class
	you need run $java circleMain
	this main will take care of other class files(so can i write this code in two files) 
	
*/
/* Mistakes I made:
1. I did not initialized variables like area,perimeter,circumfrence.
	should i do them at parameter leve or methode level.
2. Its saying im missing ; at line 41 , which i did not so is it not invoking 
	perimeterOfCircle() function
	--> its expecting return infront of perimeterofCircle() 
*/
import java.lang.*;

class circle{
	public double radius;
	public double area;
	public double perimeter;
	public double circumfrence;
	
	public double areaOfCircle(){
		area = Math.PI * radius * radius;
		return area;
	}
	public double perimeterOfCircle(){
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	public double circumfrenceOfCircle(){
		/* This is very interesting im using dummy funtion I love dummy functions*/
		return perimeterOfCircle();
	}
}

class circleMain{
	public static void main(String args[]){

		/*Initialization of object*/
		circle c1 = new circle();

		/* Initalization of parameters of class*/
		c1.radius = 7;

		System.out.println("Area of circle "+ c1.areaOfCircle());
		System.out.println("Perimeter of circle "+ c1.perimeterOfCircle());
		System.out.println("Circumfrence of circle "+ c1.circumfrenceOfCircle());
				
	}
}















