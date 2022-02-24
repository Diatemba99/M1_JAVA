package test;

public class Point {
		private double x;
		private double y;
		
		//Creation of function
		public Point(double xi, double yi)
		{
			x=xi;
			y=yi;
		}

		//getter for X values
		public double getX() {
			return x;
		}

		//Setter for editing X value
		public void setX(double x) {
			this.x = x;
		}

		//getter for Y values
		public double getY() {
			return y;
		}

		//Setter for editing value of y
		public void setY(double y) {
			this.y = y;
		}
		
		public void translater(double dx, double dy)
		{
			x=x+dx;
			y=y+dy;
		}
		
		
		
}
