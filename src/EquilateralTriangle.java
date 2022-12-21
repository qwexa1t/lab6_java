import java.util.Scanner;
import java.text.DecimalFormat;

public class EquilateralTriangle extends Triangle implements Shape
{
    public EquilateralTriangle() //Конструктор без параметров
    {
        base = 0;
    }
    public EquilateralTriangle(int base)
    {
        super(base);
    }
    public void set() // Установка значений с клавиатуры
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону:");
        base = scanner.nextInt();
    }

    public double area() { return Math.sqrt(3) / 4 * Math.pow(base, 2); }

    public void print()
    {
        System.out.println("\nСторона - " + base);
        System.out.printf("Площадь - %.2f\n", area());
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        return "\nСторона - " + this.base
              +"\nПлощадь - " + df.format(this.area());
    }

}









