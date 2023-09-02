package Week9;

public class Cube {
     double width;
     double height;
     double depth;
    // construct clone of an object
     Cube(Cube ob)
    {
// pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
     Cube(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
     Cube()
    {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor with one parameter only
     Cube(double len)
    {
        width = height = depth = len;
    }
    // method to compute and return volume
     double volume() {
        return width * height * depth;
    }

}
