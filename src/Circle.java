public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle circle1=new Circle();
      System.out.println("The area of the circle3 of radius "
    		  +circle1.radius+" is "+circle1.getArea1());
      
      Circle circle2=new Circle(25);
      System.out.println("The area of the circle3 of radius "
    		  +circle2.radius+" is "+circle2.getArea1());
      
      Circle circle3=new Circle(125);
      System.out.println("The area of the circle3 of radius "
    		  +circle3.radius+" is "+circle3.getArea1());
      
      circle2.radius=100;
      System.out.println("The area of the circle3 of radius "
    		  +circle2.radius+" is "+circle2.getArea1());
	}
	double radius;

	Circle(){
		radius=1;
	}

	Circle(double newRadius){
		radius=newRadius;
	}
	double getArea1(){
		return radius*radius*Math.PI;
	}

	double getPerimeter1(){
		return 2*radius*Math.PI;
	}
	void setRadius1(double newRadius) {
		radius=newRadius;
	}

}