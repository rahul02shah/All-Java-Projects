public class Singleton {
    private static Singleton instance;
    private String data;
    Singleton(String data){
        this.data = data;
    }
    public static Singleton getInstance(String data) {
        synchronized (Singleton.class){
            if(instance==null){
                instance = new Singleton(data);
            }
        }
        return instance;
    }
}
