import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int N;

        do
        {
            System.out.println("\nПрограмма для вычисления площади различных фигур");
            System.out.println("Выберите фигуру: ");
            System.out.println("1) Квадрат");
            System.out.println("2) Прямоугольник");
            System.out.println("3) Треугольник");
            System.out.println("4) Трапеция");
            System.out.println("5) Круг");
            System.out.println("6) Завершить программу");
            System.out.print("\nВведите номер фигуры:");
            Scanner scanner = new Scanner(System.in);
            N = scanner.nextInt();

            switch (N)
            {
                case 1:
                    System.out.println("\nВы выбрали квадрат\n");
                    System.out.println("Пример");
                    Square square = new Square();
                    square.print();
                    System.out.println("\nВведите данные: ");
                    square.set();
                    square.print();
                    break;
                case 2:
                    System.out.println("\nВы выбрали Прямоугольник\n");
                    System.out.println("Пример");
                    Rectangle rectangle = new Rectangle(7);
                    rectangle.print();
                    System.out.println("\nВведите данные: ");
                    rectangle.set();
                    rectangle.print();
                    break;
                case 3:
                    System.out.println("\nВы выбрали Треугольник\n");
                    System.out.println("Пример");
                    Triangle triangle = new Triangle(3,5);
                    triangle.print();
                    System.out.println("\nВведите данные: ");
                    triangle.set();
                    triangle.print();
                    break;
                case 4:
                    System.out.println("\nВы выбрали Трапецию\n");
                    System.out.println("Пример");
                    Trapezoid trapezoid = new Trapezoid(4,2,3);
                    trapezoid.print();
                    System.out.println("\nВведите данные: ");
                    trapezoid.set();
                    trapezoid.print();
                    break;
                case 5:
                    System.out.println("\nВы выбрали Круг\n");
                    System.out.println("Пример");
                    Circle circle = new Circle(6);
                    circle.print();
                    System.out.println("\nВведите данные: ");
                    circle.set();
                    circle.print();
                    break;
            }
        } while (N!=6);
    }
}