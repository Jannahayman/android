 public interface Shape
{
    // public modifiers are redundant
     String getShapeName();
     double getArea();
     String getColor();
     boolean getFill();
}

class Circle implements Shape
{
    private String color;
    private String name ;
    private int radius;
    private boolean isFilled;

    Circle()
    {
        radius = 1;
        color = "black";
        name = "myCircle";
        isFilled= false;
    }
    Circle(int radius, String color , String name, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.name = name;
        isFilled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius()
    {
        return radius;
    }
    @Override
    public double getArea()
    {
        double area = (Math.PI)*radius*radius;
        return area ;
    }
    @Override
    public String getShapeName()
    {
        return this.name;
    }
    @Override
    public String getColor()
    {
        return this.color;
    }
    public boolean getFill()
    {
        return this.isFilled;
    }


    public static void main (String [] args)
    {
        Circle c1 = new Circle(3, "red","myCircle", false);
        System.out.println(c1.getArea());
    }
}
 class Square implements Shape {
     private String color;
     private String name;
     private int length;
     private int width;
     private boolean isFilled;

     Square() {
         length = 2;
         width = 2;
         color = "black";
         name = "mySquare";
         isFilled = false;
     }

     Square(int length, int width, String color, String name, boolean filled) {
         this.length = length;
         this.width = width;
         this.color = color;
         this.name = name;
         isFilled = filled;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setFilled(boolean filled) {
         isFilled = filled;
     }

     public void setLength(int length)
     {
         this.length = length;
     }

     public int getLength() {
         return length;
     }

     public int getWidth() {
         return width;
     }

     public void setWidth(int width) {
         this.width = width;
     }

     public String getName() {
         return name;
     }

     public boolean isFilled() {
         return isFilled;
     }

     @Override
     public double getArea() {
         double area = length*width;
         return area;
     }
     @Override
     public String getShapeName() {
         return this.name;
     }
     @Override
     public String getColor() {
         return this.color;
     }
     @Override
     public boolean getFill()
     {
         return this.isFilled;
     }
 }
 class Main
 {
     public void displayShapeInfo(Shape s1)
     {
         System.out.println("Shape name is: " + s1.getShapeName());
         System.out.println("Shape area is: " + s1.getArea());
     }
     public static void main (String [] args)
     {
         Main m = new Main();
         Circle c1 = new Circle();
         Square s1 = new Square();
         m.displayShapeInfo(c1);
         m.displayShapeInfo(s1);
     }
 }