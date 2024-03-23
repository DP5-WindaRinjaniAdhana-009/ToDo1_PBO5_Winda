//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat mici = new Cat("Mici", 2.3, "3 Months" , "Orange", "Persia");
        Cat geo = new Cat("Geo", 3.0, "6 Months" , "Grey", "Anggora");
        Cat cowie = new Cat("Cowie", 4.7, "2 Years" , "Black & White", "Domestic");

        mici.eat();
        mici.eat();
        mici.sleep();

        System.out.println("1. Output Mici ");
        System.out.println("=================");
        System.out.println("Name            : " + mici.getCatName());
        System.out.println("Weight          : " + mici.getWeight());
        System.out.println("Age             : " + mici.getAge());
        System.out.println("Fur Color       : " + mici.getFurColor());
        System.out.println("Type            : " + mici.getType());

        System.out.println("\r\n");

        geo.eat();
        geo.sleep();
        geo.eat();
        geo.sleep();

        System.out.println("2. Output Geo ");
        System.out.println("=================");
        System.out.println("Name            : " + geo.getCatName());
        System.out.println("Weight          : " + geo.getWeight());
        System.out.println("Age             : " + geo.getAge());
        System.out.println("Fur Color       : " + geo.getFurColor());
        System.out.println("Type            : " + geo.getType());

        System.out.println("\r\n");

        cowie.eat();
        cowie.sleep();
        cowie.sleep();

        System.out.println("3. Output Cowie ");
        System.out.println("=================");
        System.out.println("Name            : " + cowie.getCatName());
        System.out.println("Weight          : " + cowie.getWeight());
        System.out.println("Age             : " + cowie.getAge());
        System.out.println("Fur Color       : " + cowie.getFurColor());
        System.out.println("Type            : " + cowie.getType());

    }
}