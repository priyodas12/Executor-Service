package io.multithreading.ReentrantLockImpl;

public class TestDisplay extends Thread{

    Display display;
    String name;

    public TestDisplay(String name, Display display) {
        //super(name);
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.showMessage(name);
    }

    public static void main(String[] args) {

        Display d=new Display();

        TestDisplay t1=new TestDisplay("Priyo",d);
        TestDisplay t2=new TestDisplay("Priya",d);
        t1.start();
        t2.start();
    }
}
