interface Shape{
  abstract double getArea();
}

class Rectangle implements Shape{
  private double length;
  private double width;

  public Rectangle(double len,double wid){
    this.length = len;
    this.width = wid;
  }

  public double getArea(){
    return length*width;
  }

  public String toString(){
    return "Rectangle area = " + Double.toString(getArea());
  }
}

class Triangle implements Shape{
  private double base;
  private double height;

  public Triangle(double base, double hei){
    this.base = base;
    this.height = hei;
  }

  public double getArea(){
    return base*height/2;
  }

  public String toString(){
    return "Triangle area = " + Double.toString(getArea());
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Rectangle rect = new Rectangle(5,10); //高,寬
    System.out.println(rect.getArea());
    System.out.println(rect);

    Triangle tri = new Triangle(8,5); //下底,高
    System.out.println(tri.getArea());
    System.out.println(tri);

  }
}
