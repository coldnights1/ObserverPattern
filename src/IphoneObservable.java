import java.util.*;
public class IphoneObservable implements ObservableInterface{
    List<IphoneObserver> observers;
    Integer totalStock;
    IphoneObservable(){
        observers=new ArrayList<IphoneObserver>();
        totalStock=0;
    }
    public void add(IphoneObserver obj){
        observers.add(obj);
    }
    public void remove(IphoneObserver obj){
         observers.remove(obj);
    }
    public void notifyall(){
       for(int i=0;i<observers.size();i++){
           observers.get(i).update();
       }
    }
    public void setData(Integer totalStock){
        this.totalStock=totalStock;
        if(totalStock>0) notifyall();
    }


}
