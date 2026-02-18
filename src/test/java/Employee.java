
class Parent {
    void m1() {
        System.out.println("Parent - Class - m1() Called");
    }

    void m2() {
        System.out.println("Parent - Class - m2() called");
    }
}

class Child extends Parent {

    public int hashCode() {
        return 101;
    }

    void m1() {
        System.out.println("Child - Class - m1() Called");
    }

    void m2() {
        System.out.println("Child - Class - m2() called");
        super.m2();
    }
}



class Employee {


    public static void main(String[] args) {

            Child c = new Child();
            c.m1();
            c.m2();
            int hashcode = c.hashCode();
            System.out.println("Hash Code :: " + hashcode);

    }
}