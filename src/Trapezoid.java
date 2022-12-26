import java.util.Scanner;

public class Trapezoid extends Figure implements Cloneable
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
    public Trapezoid(int lower_base, int upper_base, int height) //Конструктор с параметрами
    {
        this.lower_base = lower_base;
        this.upper_base = upper_base;
        this.height = height;
    }
    public Trapezoid(int lower_base) //Конструктор с 1 параметром
    {
        this.lower_base = lower_base;
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
    public double area()
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

    //Поверхностное клонирование
    @Override
    public Trapezoid clone() throws CloneNotSupportedException
    {
        return (Trapezoid) super.clone();
    }

    //Пример глубокого клонирования
    /*
    Класс Point, Который является полем класса Trapezoid

    class Point implements Cloneable
    {
    // остальной код класса

    public Point clone() throws CloneNotSupportedException
    {
        return (Point) super.clone();
    }

    }
     @Override
    public Trapezoid clone() throws CloneNotSupportedException
    {
        Trapezoid trapezoid = (Trapezoid) super.clone();
        trapezoid.point = (Point) point.clone();
        return trapezoid;
    }
     */
}

