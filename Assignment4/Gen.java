public class Gen<T> {
	private T t;
	public <E> void print(E[] arr){
		for(E a:arr){
			System.out.println(a);
		}
	}
	public void add(T t){
		this.t=t;
	}
	
	public T get(){
		return t;
	}

	public static void main(String[] args) {
		Gen<Integer> p=new Gen<Integer>();
		Gen<String> q=new Gen<String>();
		q.add(new String("Hello"));
		p.add(new Integer(10));
		Integer[] intarr={1,2,3,4};
		String[] strarr={"A","B","C","D"};
		p.print(intarr);
		q.print(strarr);
		System.out.println(p.get()+" "+q.get());

	}

}
