//1. Класс Phone.
//a) Создайте класс Phone, который содержит
//переменные number, model и weight.
//б) Создайте три экземпляра этого класса.
//в) Выведите на консоль значения их переменных.
//г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//возвращает номер телефона. Вызвать эти методы для каждого из
//объектов.
//д) Добавить конструктор в класс Phone, который принимает на вход три
//параметра для инициализации переменных класса - number, model и weight.
//е) Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//ж) Добавить конструктор без параметров.
//з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
//и) Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//метод.
//к) Создать метод sendMessageс аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов.
//л) Изменить класс Phone в соответствии с концепцией JavaBean.

public class Phone {
     int number;
     int model;
     int weight;


    public Phone (int n, int m, int w){

    }

    public Phone (int number, int model){

    }

    public Phone(){}






/*
    public void receiveCall(String name){
        System.out.println("Звонит " +this.name);
    }

 */

    public int getNumber(int number) {
        return this.number;
    }
}
