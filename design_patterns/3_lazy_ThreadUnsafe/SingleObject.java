public class SingleObject {
    private static SingleObject instance;
    private SingleObject(){}  //构造函数private 这个类就不会被实现

    public static SingleObject getInstance(){
        if (instance ==null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}