import java.util.Scanner;

public class Square extends Figure
{
    private int side;
    private static int Count = 0;
    static int GetCount()
    {
        return Count;
    }
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
        try
        {
            if (side < 0) throw new IllegalArgumentException("Negative number.");
            if (side > 100) throw new IllegalArgumentException("Large number. Maximum value 100");
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace(); //Вывод номера строки, в которой произошло исключение
            System.exit(1);
        }
        Count++;
    }
    public float area() { return side * side; }

    public void print()
    {
        System.out.println("\nСторона - " + side);
        System.out.printf("Площадь - %.0f\n", area());
    }
}
