public class Main {
    public static void main(String args[]){
        Reptiles r1=new Reptiles();
        Birds b1=new Birds();
        Mamals m1=new Mamals();
        Snake s1=new Snake();
        r1.tellAboutSelf();
        b1.tellAboutSelf();
        m1.tellAboutSelf();
        s1.tellAboutSelf();
        b1.speak();
        r1.speak();
        m1.speak();
        s1.speak();
    }
}