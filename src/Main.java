public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(1), new Square(2), new Square(3)
        };
        for (int i =0 ; i<shapes.length;i++){

            if (shapes[i] instanceof Colorable){
                System.out.println(shapes[i]);
                System.out.println(((Colorable)shapes[i]).howToColor()+"\n");

            }
        }

    }
}
