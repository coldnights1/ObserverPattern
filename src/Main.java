// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
   IphoneObservable observable=new IphoneObservable();
    IphoneObserver observer1= new IphoneObserver("Prajit",observable);
    IphoneObserver observer2= new IphoneObserver("Rajesh",observable);
    IphoneObserver observer3= new IphoneObserver("Rahul",observable);
    observable.observers.add(observer1);
    observable.observers.add(observer2);
    observable.observers.add(observer3);
    observable.setData(100);

    }
}