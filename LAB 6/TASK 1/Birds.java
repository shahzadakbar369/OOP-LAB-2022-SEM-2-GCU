public class Birds extends Animal {

    protected int b;

    public Birds(){
        super(2);
    }
    public Birds(int id){
     super(id);
    }
    public void tellAboutSelf(){
        System.out.println("Iam a Bird");
    }
    public void speak(){
        System.out.println("I am a Bird. i can't speak");
    }
}
