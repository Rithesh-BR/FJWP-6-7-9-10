class Addition {
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println(c);
    }
}

class Demo {
    public static void main(String[] args) {
        Addition ref = new Addition();
        ref.add();
    }
}