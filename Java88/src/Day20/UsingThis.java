package Day20;

public class UsingThis {

    public int outterField=10;
    
    class Inner{
       int innerField=20;
       
       void method() {
          //���ٽ�
          MyFunctionalInterface fi= ()->{
             System.out.println("outterField:"+outterField);
             System.out.println("outterField:"+UsingThis.this.outterField+"\n");
             System.out.println("innerField:"+innerField);
             System.out.println("innerField:"+this.innerField+"\n");

          };
          fi.method();
          
          MyFunctionalInterface fi2= new MyFunctionalInterface() {
          
          @Override
          public void method() {
              System.out.println("outterField:"+outterField);
                System.out.println("outterField:"+UsingThis.this.outterField+"\n");
                System.out.println("innerField:"+innerField);
                System.out.println("innerField:"+Inner.this.innerField+"\n");
          }
       };
       fi2.method();
       }
       
    }
}

