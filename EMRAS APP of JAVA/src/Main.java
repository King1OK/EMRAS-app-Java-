public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to EMRAS application !");
 use c= new use();
 c.choice();
 c.select();

bundle d=new bundle();
d.bundle();

act z= new activate();
z.activates();

process sys =new process();
sys.setLoading("Process finishing");
        System.out.println(""+sys.getLoading());

        sys.setWait("Wait for decreasing money!");
        System.out.println(sys.getWait());

        sys.setWorking("Your process completed !");
        System.out.println(sys.getWorking());


        comment o;
        o=new poly();
        o.thanks();
        o=new morphism();
        o.thanks();
        o=new simple();
        o.thanks();
    }
}