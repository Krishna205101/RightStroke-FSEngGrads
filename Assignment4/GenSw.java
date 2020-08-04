class Pair<T> {
    T f;
    T s;
}
 public class GenSw <T> {
	 public static <T> void swap(Pair<T> p) {
		   T temp = p.f;
		   p.f = p.s;
		   p.s = temp;
		}
	 public static void main(String args[]){
		 Pair<Integer> p=new Pair<>();
		 p.f=7;
		 p.s=18;
		 swap(p);
		 System.out.println(p.f+" "+p.s);
	 }
 }
