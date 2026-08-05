class Animal {
    final void sound() {
        System.out.println("Animal makes sounds");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}