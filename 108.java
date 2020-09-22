/*simiral to previous 106 & 107 this is about cylinder
But only intersting thing hear is i will call a function 
and use that retun value of that function in other function*/

import java.lang.*;

class cylindar{
	public double radius;
	public double height;

	public double lidArea(){
		return 2*Math.PI*radius;
	}
	
	public double totalSurfaceArea(){
		return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
	}

	public double volume(){
		return Math.PI*radius*radius*height;
	}
	
	
}

class cylindartest{
	public static void main(String args[]){
	
	cylindar c = new cylindar();
	c.radius = 5;
	c.height = 10;

	System.out.println("LidArea : "+c.lidArea());
	System.out.println("TotalSufraceArea : "+c.totalSurfaceArea());
	System.out.println("Volume : "+c.volume());
	}
}

