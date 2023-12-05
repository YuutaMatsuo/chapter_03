
public class Exercise3_3 {

	public static void main(String[] args) {
		int isHungry = 1;
		String food = "ハンバーグ";
		
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		
		System.out.println("ごちそうさまでした");
	}

}
