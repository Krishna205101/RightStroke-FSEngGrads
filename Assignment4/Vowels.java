
package file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vowels
{

   public static void main(String[] args) throws IOException 
   {
      File f1=new File("input.txt"); 
      String[] words=null;    
      FileReader fr = new FileReader(f1);   
      BufferedReader br = new BufferedReader(fr);  
      String s;
      int count=0;  
      while((s=br.readLine())!=null)
      {   
         words=s.split(" ");   
         for(int i=0;i<words.length;i++)
         {
            for(int j=0;j<words[i].length();j++)
            {
               char ch=words[i].charAt(j);   
               if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')   //Checking for vowels
               {
                      count+=1;
                 }
            }
         }     
      }   
      System.out.println(count);  
   }      

} 
