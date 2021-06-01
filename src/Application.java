import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Привет");
        run();
        System.out.println("Пока");
    }

    private void run() {
        while (true){
            showMenu();
            int number = scanner.nextInt();
            if(number == 0){
                break;
            }
            Drawable drawable = getFigure(number);
            drawable.draw();
        }
    }

    private Drawable getFigure(int number){
        switch (number){
            case 1:
                System.out.println("Введите сторону квадрата");
                int a = scanner.nextInt();
                return new Square(a);
            case 2:
                return new Circle();
            case 3:
                return new Triangle();
        }
        return null;
    }

    private void showMenu(){
        System.out.println("Выберите фигуру");
        System.out.println("1 - квадрат");
        System.out.println("2 - круг");
        System.out.println("3 - треугольник");
        System.out.println("0 - выход");
    }
}
