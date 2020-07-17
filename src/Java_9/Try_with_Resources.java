package Java_9;

public class Try_with_Resources {
    public static void main(String[] args) {
        //Before jdk 9 new enhancement
        try(MyResource myResource=new MyResource()) {
            myResource.doProcess();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(" ");
        //jdk 9 new enhancement
        MyResource myResource=new MyResource();
        MyResource myResource1=new MyResource();
        MyResource myResource2=new MyResource();
        MyResource myResource3=new MyResource();

        try(myResource;myResource1;myResource2;myResource3) {
            myResource.doProcess();
            myResource1.doProcess();
            myResource2.doProcess();
            myResource3.doProcess();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyResource implements AutoCloseable{
    MyResource(){
        System.out.println("Process started");
    }
    public void doProcess(){
        System.out.println("Processing file");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing process");
    }
}