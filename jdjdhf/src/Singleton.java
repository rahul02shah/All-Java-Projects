public class Singleton {
    private static Singleton Instance;
    private String Data;
    private Singleton(String data){
        this.Data = data;
    }
    public static  Singleton GetInstance(String Data){
        synchronized (Singleton.class) {
            if (Instance == null) {
                Instance = new Singleton(Data);
            }
        }
        return Instance;
    }
}
