package lesson6.telephone;

/**
 написать класс телефон
 марка
 модель
 симкарта
 - метод смены симкарты, проверяет установлена ли симкарта,
 если нет устанавливает, если есть спрашивает «точно ли установить»

 Интерфейс Сим-карта
 - проверка баланса
 - пополнение счета
 - информация про оператора

 Классы - реализуют интерфейс симкарта
 -Лайфсел
 -Вудафон
 -Киевстар
 - предусмотреть разную стартовую сумму на счете


 Создать телефон, подключить симкарту, проверить с телефона
 счет, оператора, пополнить счет

 реализовать класс  телефона на две симкарты
 - реализовать метод звонка, с учетом баланса по симкарте и
 выбором симкарты с которой звонить

 */
public class Phone {

    private String brand;
    private String model;
    Sim sim0;


    public Phone(String brand, String model, Sim sim0) {
        this.brand = brand;
        this.model = model;
        this.sim0 = sim0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void aboutPhone(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(sim0.getOpName());


    }





}
