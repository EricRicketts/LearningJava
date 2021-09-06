package a_and_b;

public class Foo {
    String bar;
    A obA;

    Foo(String s) {
        bar = s;
        obA = new A(1, 2);
    }
}

/*
    Here we can access the default methods of class A from class Foo because event though Foo is not a subclass of A,
    it is in the same package.
*/
