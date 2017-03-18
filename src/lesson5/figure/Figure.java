package lesson5.figure;

/**
 * Создаем класс Figure:

 Методы:
 - public void about();    //Описание фигуры
 - public void area();     //Площадь фигуры
 - public void perimeter();//Периметр фигуры

 На основе класса Figure, создаем классы:
 Rectangle (Прямоугольник)
 - Стороны А и В
 - Переопреляем методы about(), area(), perimeter();
 Circle (Kpyг):
 - Радиус R
 - Переопределяем методы about(), area(), perimeter();
 Square (Квадрат):
 - Сторона А
 - Переопределяем методы about(), area(), perimeter();
 Triangle (Треугольник)
 - Сторона А и В (Катеты)
 - Переопределяем методы about(), area(), perimeter();
 - Метод расчета гипотенузы hypo();

 */
public class Figure {



    private String name;

    public Figure(){

    }

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void about(){
        System.out.println(this.name);
    }




    public void area(){


    }

    public void perimeter(){

    }


}
