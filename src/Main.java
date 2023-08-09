
public class Main {
    public static void main(String[] args) {
/*
#1 Создать класс Car со следующими полями (String brand, String color, String licensePlate
 MyDate registrationDate, Engine engine}
 Обратите внимание, поля registrationDate и engine - это тоже объект.
 Engine - содержмт информация о мощности двигателя и о типе (бензин, дизель, электро).
 Реализуйте метод toString в каждом классе.
 Реализуйте метод конструктор в каждом классе.
 Создайте два объекта автомобтля.
 */
        Brand car1 = new Brand("Opel");
        Engine engine1 = new Engine("Petrol", " Engine power: 150 ");
        MyDate car =new MyDate( 5, 10, 2010);
        LicensePlate LicensePlate1=new LicensePlate("123-34");
        Color Color1 = new Color("Blue");
        System.out.println("Brand car: " + car1 + "\nEnginesType: " + engine1 +"\nEngine Power:"
                + car +"\nLicensePlate :" + LicensePlate1 +" \nColor Cars :"+ Color1);

        System.out.println();
        Brand car2 = new Brand("Reno");
        Engine engine2 = new Engine("Diesel", " Engine power: 120 ");
        MyDate cars =new MyDate( 8, 12, 2008);
        LicensePlate LicensePlate2=new LicensePlate("45-476");
        Color Color2 = new Color("Black");
        System.out.println("Brand car: " + car2 + "\nEnginesType: " + engine2 +"\nEngine Power:"
                + cars +"\nLicensePlate :" + LicensePlate2 +" \nColor Cars :"+ Color2);


    }
}