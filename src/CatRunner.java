public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("John",4, 12.00);
        cat1.printCatInfo();
        cat1.introduce();


        Cat cat2 = new Cat("Ray", 9, 14.5);
        cat2.printCatInfo();
        cat2.introduce();

    }
}
