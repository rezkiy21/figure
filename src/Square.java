public class Square implements Drawable {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public Square(){
        a = 5;
    }

    @Override
    public void draw() {
        for(int i = 0; i < a; i ++){
            for (int j = 0; j < a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
