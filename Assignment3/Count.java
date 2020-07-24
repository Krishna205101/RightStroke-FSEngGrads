public class Count{
    public static void main(String args[]){
        int k=0;
        String j=" ";
        int numcount=0;
        int charcount=0;
        try{
            while(k>=0){
                j=j+args[k];
                try{
                    int l=Integer.parseInt(args[k]);
                    numcount+=1;
                }
                catch(Exception e){
                    charcount+=1;
                }
                k++;
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds");
        }
        finally{
            System.out.println(numcount);
            System.out.println(charcount);
        }
    }
}