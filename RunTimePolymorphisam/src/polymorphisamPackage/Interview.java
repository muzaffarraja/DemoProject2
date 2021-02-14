package polymorphisamPackage;

 	class Shape {

	void draw() {
			System.out.println("Drawing Shape");
	}
}
	class Circle extends Shape{   //Method overriding
	void draw() {
		System.out.println("Drawing Circle");
				}
	}				
	class Rectangle extends Shape{   //Method overriding
	void draw () {
	System.out.println("Drawing Rectangle");
				}
	}
	
	
	class Polygan extends Shape{		//Method overriding
	void draw () {
		System.out.println("Drawing Polygon");
				}
	}
	
	public class Interview{
		
	public static void main(String[] args) {
		Shape s;
		s=new Shape();
		s.draw();
		 
		 Circle c=new Circle();
		 c.draw();
		
		 Rectangle r=new Rectangle();
		 r.draw();
	
		Polygan p=new Polygan();
		p.draw();	
	}	
}

	
	
	
