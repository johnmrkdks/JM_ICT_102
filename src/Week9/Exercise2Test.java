package Week9;

public class Exercise2Test {
    public static void main(String args[])
    {
// create cubes using the various constructors
        Cube box1 = new Cube(10, 20, 15);
        Cube box2 = new Cube();
        Cube perfectCube = new Cube(7);
        Cube clone1 = new Cube(box1);
        double vol;
// get volume of first box
        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);
// get volume of second box
        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);
// get volume of cube
        vol = perfectCube.volume();
        System.out.println("Volume of perfectCube is " + vol);
// get volume of clone1
        vol = clone1.volume();
        System.out.println("Volume of clone1 is " + vol);
        box2.width=5;
        box2.height=10;
        box2.depth=15;
        Cube clone2 = new Cube(box2);
// get volume of clone1
        vol = clone2.volume();
        System.out.println("Volume of clone2 is " + vol);
    }

}
