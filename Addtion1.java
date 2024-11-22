class Addition1 {
    int c;

    void add(int x, int y) {
        c = x + y;
        System.out.println(c);
    }
}

class Demo {
    public static void main(String[] args) {
        Addition ref = new Addition();
        int a, b;
        a = 10;
        b = 20;
        ref.add(a, b);
    }
}