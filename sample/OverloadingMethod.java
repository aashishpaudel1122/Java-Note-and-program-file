class Addition{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class OverloadingMethod {
    public static void main(String[] args) {
        Addition ad=new Addition();
        System.out.println(ad.add(12,60));
        System.out.println(ad.add(23.4,45.5));
    }
}
