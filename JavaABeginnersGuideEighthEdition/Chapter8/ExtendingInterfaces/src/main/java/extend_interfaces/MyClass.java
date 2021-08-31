package extend_interfaces;

public class MyClass implements B {
    public String meth1() {
        return "Foo";
    }

    public String meth2() {
        return "Bar";
    }

    public String meth3() {
        return meth1() + meth2();
    }
}
