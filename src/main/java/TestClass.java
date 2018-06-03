public class TestClass {
    private int x;

    public TestClass(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int power(int n) {
        if (n == 0) return 1;
        else return x * power(n - 1);
    }

    public static void main(String[] args) {
        TestClass test = new TestClass(5);
        int y = test.power(2);
        System.out.println(y);

        test.setX(6);
        y = test.power(3);
        System.out.println(y);
    }

}

