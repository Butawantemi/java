public class Test1 {
    public static void main(String[] args) throws ExceptionInterrupted
    {
        Test  t1 = new Test();
        Test t2 = new Test();

        t1 = null;

        System.gc();

        t2 = null;

        Runtime.getRuntime().gc();
    }

    @Override
    protected void finalized() throws Throwable {
         System.out.println("Garbage collection");
         
    }
}
