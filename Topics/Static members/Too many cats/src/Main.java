class Cat {

    protected String name;
    protected int age;

    public static int counter;

    public Cat(String name, int age) {
        counter++;
        this.name = name;
        this.age = age;

        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}