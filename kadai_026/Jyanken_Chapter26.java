package kadai_026;


import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		
//		自分のじゃんけんの手を入力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);
		String myChoice = "";
		boolean check = false;
		do {
			myChoice = scanner.next();
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close();
				check = true;
			} else {
				System.out.println("正しい値を入力してください");
			}
		}while(!check);
		return myChoice;
	}
		
//		対戦相手のじゃんけんの手を乱数で選ぶ
		public String getRandom() {
			String[] handsPatern = {"r", "s", "p"};
			int random = (int)Math.floor(Math.random() * 3);
			String yourChoice = handsPatern[random];
			return yourChoice;
		}
		
//		じゃんけんを行う
		public void playGame(String mine, String yours) {
			HashMap<String, String> jyanken = new HashMap<String, String>();
			jyanken.put("r", "グー");
			jyanken.put("s", "チョキ");
			jyanken.put("p", "パー");
			String win = "自分の勝ちです";
			String lose = "自分の負けです";
			System.out.println("自分の手は" + jyanken.get(mine) + ",相手の手は" + jyanken.get(yours));
			if (jyanken.get(mine).equals(jyanken.get(yours))) {
				System.out.println("あいこです");
			} else if (jyanken.get(mine).equals("グー") && jyanken.get(yours).equals("チョキ")) {
				System.out.println(win);
			} else if (jyanken.get(mine).equals("グー") && jyanken.get(yours).equals("パー")) {
				System.out.println(lose);
			} else if (jyanken.get(mine).equals("チョキ") && jyanken.get(yours).equals("グー")) {
				System.out.println(lose);
			} else if (jyanken.get(mine).equals("チョキ") && jyanken.get(yours).equals("パー")) {
				System.out.println(win);
			} else if (jyanken.get(mine).equals("パー") && jyanken.get(yours).equals("グー")) {
				System.out.println(win);
			} else if (jyanken.get(mine).equals("パー") && jyanken.get(yours).equals("チョキ")) {
				System.out.println(lose);
			}
		}
		
}