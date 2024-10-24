class k {
    public void show(){

        System.out.println("in A show");
    }
}
public class Anonymous{
    public static void main(String args[]){
        k obj = new k()
        {
            public void show(){
                System.out.println("in new show");
        }
        };
        obj.show();
    }
}