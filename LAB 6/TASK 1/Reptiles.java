public class Reptiles extends Animal {

    protected int a;


    public Reptiles(){
        super(1);
    }
    public Reptiles(int id){
     super(id);


    }
    public void tellAboutSelf(){
        System.out.println("Iam a reptile");
    }
    public void speak(){
        System.out.println("I am a reptile . i can't speak");
    }
}
