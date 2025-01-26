import javax.swing.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Demo {
    public static void main(String[] args) {

Car car=new Car();
car.start();
car.stop();

    }
}
interface Vehicle1{
    void start();
    default  void stop(){
        System.out.println("Vehicle1 is Stopped");
    }
}

interface Vehicle2{
    void start();
    default  void stop(){
        System.out.println("Vehicle2 is Stopped");
    }
}


class Car implements Vehicle1, Vehicle2{

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void stop(){
        Vehicle2.super.stop();    }
}














