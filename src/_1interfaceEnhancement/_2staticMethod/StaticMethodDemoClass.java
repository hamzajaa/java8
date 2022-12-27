package _1interfaceEnhancement._2staticMethod;

public class StaticMethodDemoClass implements StaticMethodDemo {

    public static void show() {
        StaticMethodDemoClass obj = new StaticMethodDemoClass();
        String className = obj.getClass().getSimpleName();
        System.out.println("I am a normal method of this class: " + className);
    }


    public static void main(String[] args) {

        StaticMethodDemoClass obj = new StaticMethodDemoClass(); // can not access the static method by obj

        StaticMethodDemo.show1(); // but we can access by Interface
        StaticMethodDemo.show2(); // static method can be called by the name of the interface
        show();
    }


}
