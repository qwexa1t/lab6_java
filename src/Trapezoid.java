import java.util.Scanner;

public class Trapezoid extends Figure
{
    private int lower_base;
    private int upper_base;
    private int height;

    public Trapezoid() //Конструктор без параметров
    {
        lower_base = 0;
        upper_base = 0;
        height = 0;
    }
    public Trapezoid(int value_lower_base, int value_upper_base, int value_height) //Конструктор с параметрами
    {
        lower_base = value_lower_base;
        upper_base = value_upper_base;
        height = value_height;
    }
    public Trapezoid(int value_lower_base) //Конструктор с 1 параметром
    {
        lower_base = value_lower_base;
        upper_base = 1;
        height = 1;
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Нижнее Основание:");
        lower_base = scanner.nextInt();
        System.out.print("Введите Верхнее Основание:");
        upper_base = scanner.nextInt();
        System.out.print("Введите Высоту:");
        height = scanner.nextInt();
    }
    public float area()
    {
        return 0.5f * (lower_base + upper_base) * height;
    }

    public void print()
    {
        System.out.println("\nНижнее Основание - " + lower_base);
        System.out.println("Верхнее Основание - " + upper_base);
        System.out.println("Высота - " + height);
        System.out.printf("Площадь - %.2f\n", area());
    }
}
