public class Dog extends Animal implements Canine{
    void sitPretty() {
        System.out.println(getName() + " sit pretty!");

    }

    @Override
    public void bark() {
        System.out.println("HAŁ HAŁ");

    }
}
