public class Rectangulator {
  public start void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    Rectangle myRectangle = new Rectangle(length, width);
    
    String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimter: %d\n\n", myRectangle.length.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());


    System.out.println(output);
  }
}