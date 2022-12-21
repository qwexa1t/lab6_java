import java.util.Scanner;

public class Rectangle extends Figure
{
    private int length;
    private int width;

    public Rectangle() //Конструктор без параметров
    {
        length = 0;
        width = 0;
    }
    public Rectangle(int length,int width) //Конструктор с параметрами
    {
        this.length = length;
        this.width = width;
    }
    public Rectangle(int length) //Конструктор с 1 параметром
    {
        this.length = length;
        width = 1;
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Длину:");
        length = scanner.nextInt();
        System.out.print("Введите Ширину:");
        width = scanner.nextInt();
    }
    public double area() { return length * width; }

    public void print()
    {
        System.out.println("\nДлина - " + length);
        System.out.println("Ширина - " + width);
        System.out.printf("Площадь - %.0f\n", area());
    }
}
