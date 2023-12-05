
public class Test1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int c = 0;
		
		if(a == 1) {
			System.out.println(a + b);
			c = a + b; //ifブロックで新たな変数cを宣言する
		}else {
			System.out.println(a - b);
		}
		
		System.out.println(c);
	}
}
