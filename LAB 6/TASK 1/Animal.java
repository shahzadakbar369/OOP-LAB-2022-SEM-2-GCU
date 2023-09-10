public class Animal {
    protected int id;



    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public Animal(){
    this.id=0;
    }
    public Animal(int id){
     this.id=id;
    }
    public void tellAboutSelf(){
        System.out.println("Iam a Animal");
    }
    public void speak(){
        System.out.println("I am an Animal. i can't speak");
    }


}
