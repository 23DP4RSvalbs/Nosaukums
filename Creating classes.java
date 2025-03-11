public class A {
    public void a() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        C c = new C();

        c.a();  // Inherited from class A
        c.b();  // Inherited from class B
        c.c();  // Method from class C
    }
}

class B extends A {
    public void b() {
        System.out.println("B");
    }
}

class C extends B {
    public void c() {
        System.out.println("C");
    }
}
