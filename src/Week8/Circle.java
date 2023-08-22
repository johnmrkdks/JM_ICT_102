package Week8;


public class Circle {
    public double x, y; // centre of the circle
    public double r; // radius of circle
    public String color; //color of circle

    //Methods to return circumference and area
    public double circumference() {
        return 2 * 3.14 * r;
    }

    public double area() {
        return 3.14 * r * r;
    }
    public String getColor() {
        return color;
    }

}

class MyMain {
        public static void main(String[] args)
        {
            Week8.Circle aCircle; // creating reference
            aCircle = new Week8.Circle(); // creating object
            aCircle.x = 10; // assigning value to data field
            aCircle.y = 20;
            aCircle.r = 5;
            aCircle.color = "red";

            double area = aCircle.area();
            double circumf = aCircle.circumference();
            System.out.println("Radius= "+aCircle.r+"\nArea= "+area);
            System.out.println("Circumference = "+circumf);
            System.out.printf("Color is = %s", aCircle.color);
        }
    }

/*
  2. What is printed by the following application?
    -The Radius, area, and Circumference of a Circle

  3. What are the names of Class identifiers in two classes?
  -Circle and MyMain

  4. What are identifiers x and y called on line 2?
  -Variables

  5. What is return type on line 4 in method header of circumference()?
  -double

  6. What is name of object for class Circle, give line number where it is initiated?
  -Week8.Circle, line 11 in word document and line 21 in compiler.

  7. Add another identifier in the class to save the color for the circle and also add a method to
    return the color of any object.
 */
