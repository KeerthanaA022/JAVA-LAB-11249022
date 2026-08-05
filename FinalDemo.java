class FinalDemo {

    public static void main(String[] args) {

        final int MAX = 100;

        System.out.println("Value of MAX = " + MAX);

        // Uncommenting the below line will cause a compile-time error
        // MAX = 200;
    }
}