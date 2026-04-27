interface MyInterface {
    void method1();
    void method2();
    void method3();
}

class MyClass implements MyInterface {

    public void method1() {
        System.out.println("Method 1 called");
    }

    public void method2() {
        System.out.println("Method 2 called");
    }

    public void method3() {
        System.out.println("Method 3 called");
    }
}

class Main {
    public static void main(String[] args) {

        MyInterface obj = new MyClass();

        obj.method1();
        obj.method2();
        obj.method3();
    }
}