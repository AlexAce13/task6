public class MyMath {
    public static final int RADIUS = 25;
    public static final int HEIGHT = 12;
    public static final double MY_CONST_PI = Math.PI;


    static double circleSquare(){
        double square;
        square = MY_CONST_PI * (RADIUS * RADIUS);
//        System.out.println("Площа круга = " + square);
        return square;
    }

    static double cylinderSideSquare(){
        double square;
        square = 2 * MY_CONST_PI * RADIUS * HEIGHT;
        return square;
    }

    static double circleLength(){
        double length;
        length = MY_CONST_PI * 2 * RADIUS;
        return length;
    }

    public static void main(String[] args){
        Pet cow = new Cow();
        Pet cat = new Cat();
        Pet dog = new Dog();

        cow.voice();
        cat.voice();
        dog.voice();

        System.out.println("Довжина кола = " + circleLength());
        System.out.println("Площа круга = " + circleSquare());
        System.out.println("Бічна площа циліндра = " + cylinderSideSquare());
    }
}
