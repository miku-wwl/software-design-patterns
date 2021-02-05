public class SingleObject{


    private volatile static SingleObject singleObject;
    
    private SingleObject(){}  

    public static SingleObject getSingleoObject(){
        if (singleObject == null){
            synchronized(SingleObject.class){
                singleObject = new SingleObject();
            }
        }
        return singleObject;
    }
   

    public void showMessage(){
        System.out.println("Hello World!");
    }

}