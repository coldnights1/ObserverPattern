public interface ObservableInterface {
    public void add(IphoneObserver obj);
    public void remove(IphoneObserver obj);
    public void notifyall();
    public void setData(Integer value);
}
