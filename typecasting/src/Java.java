public class Java {
    int age ;
    float height;
    float weight;
    Java (int a,float h,float w){
        age = a;
        height = h;
        weight = w;
    }

    public static void main(String[] args) {

        Java j = new Java(20,5.6f,60.5f);
        System.out.println(j.age);
        System.out.println(j.height);
        System.out.println(j.weight);

    }
}
