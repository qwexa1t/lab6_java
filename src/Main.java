import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int N;
        int kolvo;

        do
        {
            System.out.println("\nПрограмма для вычисления площади различных фигур");
            System.out.println("Выберите фигуру: ");
            System.out.println("1) Квадрат");
            System.out.println("2) Прямоугольник");
            System.out.println("3) Треугольник");
            System.out.println("4) Трапеция");
            System.out.println("5) Круг");
            System.out.println("6) Равносторонний треугольник");
            System.out.println("7) Завершить программу");
            System.out.print("\nВведите номер фигуры:");
            Scanner scanner = new Scanner(System.in);

            while ((N = scanner.nextInt()) <= 0 || N > 7)
            {
                System.out.print("\nВы ввели Неверный номер. Повторите попытку.\n");
                System.out.print("\nВведите номер фигуры:");
            }

            switch(N)
            {
                case 1:
                    System.out.println("\nВы выбрали квадрат\n");
                    System.out.println("Пример");
                    Square square = new Square(4);
                    Square square1 = new Square();
                    Square square2 = new Square();
                    square.print();
                    System.out.println("\nВведите данные: ");
                    square1.set();
                    square1.print();
                    System.out.println("\nВведите данные: ");
                    square2.set();
                    square2.print();
                    Square.GetCount(); //Вывод количества объектов
                    Square.ResetCount(); //Обнуление счетчика
                    break;
                case 2:
                    System.out.println("\nВы выбрали Прямоугольник\n");
                    System.out.println("Пример");
                    Rectangle rectangle = new Rectangle(7);
                    rectangle.print();
                    System.out.println("\nСколько Прямоугольников создать? (1-5)");
                    while (( kolvo = scanner.nextInt()) <= 0 || kolvo > 5)
                    {
                        System.out.print("\nВы ввели число >5 или <1. Повторите попытку.\n");
                        System.out.print("\nСколько Прямоугольников создать? (1-5)");
                    }
                    Rectangle[] rectangle_arr = new Rectangle[5];
                    for (int i = 0; i < kolvo; i++)
                    {
                        System.out.println("\nВведите данные: ");
                        rectangle_arr[i] = new Rectangle();
                        rectangle_arr[i].set();
                        rectangle_arr[i].print();
                    }
                    break;
                case 3:
                    System.out.println("\nВы выбрали Треугольник\n");
                    System.out.println("Пример");
                    Triangle triangle = new Triangle("Голубой",3,5);
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
                    System.out.println("\nСколько Кругов создать? (1-5)");
                    while (( kolvo = scanner.nextInt()) <= 0 || kolvo > 5)
                    {
                        System.out.print("\nВы ввели число >5 или <1. Повторите попытку.\n");
                        System.out.print("\nСколько Кругов создать? (1-5)");
                    }
                    //Объявление двумерного динамического массива объектов:
                    Circle[][] circle_arr = new Circle[5][5];
                    for (int i = 0; i < kolvo; i++)
                    {
                        for (int j = 0; j < 1; j++)
                        {
                            System.out.println("\nВведите данные: ");
                            circle_arr[i][j] = new Circle();
                            circle_arr[i][j].set(); //Установка значений
                            circle_arr[i][j].print();
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nВы выбрали Равносторонний Треугольник\n");
                    System.out.println("Пример");
                    EquilateralTriangle EqTr = new EquilateralTriangle(1);
                    System.out.println(EqTr);
                    System.out.println("\nВведите данные: ");
                    EqTr.set();
                    System.out.println(EqTr);
            }
        } while (N!=7);
    }
}