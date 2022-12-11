import java.util.Scanner;

public class Circle extends Figure
{
    private int radius;
    final float PI = 3.1415926f;

    public Circle() //Конструктор без параметров
    {
        radius = 0;
    }
    public Circle(int radius) //Конструктор с параметрами
    {
        this.radius = radius;
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Радиус:");
        radius = scanner.nextInt();
    }
    public float area()
    {
        return PI * radius * radius;
    }

    public void print()
    {
        System.out.println("\nРадиус - " + radius);
        System.out.printf("Площадь - %.2f\n", area());
    }
}
