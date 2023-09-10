public class Mamals extends Animal {

    protected int c;

    public Mamals(){
       super(3);

    }
    public Mamals(int id){
     super(id);
    }
    public void tellAboutSelf(){
        System.out.println("Iam a Mamal");
    }
    public void speak(){
        System.out.println("I am a Mamal. i can't speak");
    }
}
