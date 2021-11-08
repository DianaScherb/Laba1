package lab1;


public class ContainerArray extends Main {
	
	private int size = 10;
	private Integer[] arr = new Integer[size];
	
	public void initArr() {
		System.out.println("Input arr");
		for(int i=0;i< arr.length;i++) {
			arr[i] = in.nextInt();
			}
	}
	public void getObj(int index) {
		index--;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++)  {     
	        if (i == index) {
	        	System.out.println(arr[index]);
	        	flag = true;
	        }
		}
		if(!flag)
			System.out.println("No elem");
	}
	public void addObj(int num) {
		Integer[] tmp = new Integer[size+1];
		for(int i = 0; i < arr.length; i++) {
			tmp[i]= arr[i];
		}
		tmp[size] = num;
		arr = tmp;
		size++;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void delobj(int num) {
		int j = 0;
		for (j = 0; j < arr.length; j++)  {     
	        if (arr[j] == num)
	            break;
		}
		for (int k = j; k < arr.length - 1; k++)
	        arr[k] = arr[k + 1];
		size--;
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
}