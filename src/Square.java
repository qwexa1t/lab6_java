import java.util.Scanner;

public class Square extends Figure
{
    private int side;

    public Square() //Конструктор без параметров
    {
        side = 4;
    }
    public Square(int side) //Конструктор с параметрами
    {
        this.side = side;
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону:");
        side = scanner.nextInt();
    }
    public float area() { return side * side; }

    public void print()
    {
        System.out.println("\nСторона - " + side);
        System.out.printf("Площадь - %.0f\n", area());
    }
}
