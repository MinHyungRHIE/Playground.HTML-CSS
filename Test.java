class A {
    public void testMethod() {
        System.out.println("test test test");
    }
}

class Test extends A {

    public static void main(String[] args) {
        System.out.println("hello world");
        Test t = new Test();
        t.testMethod();
    }
}