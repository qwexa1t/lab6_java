import java.util.Scanner;

public class Triangle extends Figure
{
    private int base;
    private int height;
    private String color;

    public Triangle() //Конструктор без параметров
    {
        color = " ";
        base = 0;
        height = 0;
    }
    public Triangle(String color, int base, int height) //Конструктор с параметрами
    {
        this.color = color;
        this.base = base;
        this.height = height;
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Цвет:");
        color = scanner.nextLine();
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
        System.out.println("\nЦвет треугольника - " + color);
        System.out.println("Основание треугольника - " + base);
        System.out.println("Высота треугольника - " + height);
        System.out.printf("Площадь - %.2f\n", area());
    }
}
