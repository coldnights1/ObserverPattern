public class IphoneObserver implements ObserverInterface{
    Integer iphoneStockCount;
    String ObserverName;
    IphoneObservable obj;
    IphoneObserver(String ObserverName,IphoneObservable obj){
        this.ObserverName=ObserverName;
        this.obj=obj;
    }
    public void update(){
         iphoneStockCount=obj.totalStock;
         System.out.println("Information updated for "+ObserverName+" "+iphoneStockCount);
        }
}
