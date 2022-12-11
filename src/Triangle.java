import java.util.Scanner;

public class Triangle extends Figure
{
    private int base;
    private int height;

    public Triangle() //Конструктор без параметров
    {
        base = 0;
        height = 0;
    }
    public Triangle(int value_base,int value_height) //Конструктор с параметрами
    {
        base = value_base;
        height = value_height;
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Основание:");
        base = scanner.nextInt();
        System.out.print("Введите Высоту:");
        height = scanner.nextInt();
    }
    public float area()
    {
        return 0.5f * base * height;
    }

    public void print()
    {
        System.out.println("\nОснование треугольника - " + base);
        System.out.println("Высота треугольника - " + height);
        System.out.printf("Площадь - %.2f\n", area());
    }
}
