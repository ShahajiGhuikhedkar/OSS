class Volume
{
   private int height,width,depth,volume;
   public void displayVol()
   {
      System.out.println("The volume is:"+volume);
    }
     public void calculateVol(int h,int l,int d)
    {
       volume=h*l*d;
     }
   public void set(int h,int l,int d)
   {
    height=h;
    width=l;
    depth=d;
   }
}

public class Box
 {
     public static void main(String [] args)
    {
     Volume b1=new Volume();
      b1.calculateVol(10,4,20);
      b1.displayVol();
     }
}
