class Addition{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    void add(){
        System.out.println("Nothing");
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        Addition ad =new Addition();
        System.out.println(ad.add(23, 44));
        System.out.println(ad.add(34.5,56.7));
        ad.add();
    }
}
