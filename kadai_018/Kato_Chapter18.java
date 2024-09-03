package kadai_018;

abstract public class Kato_Chapter18 {
	
	//姓を表すフィールド
		String familyName = "加藤";
		//名を表す
		String givenName = "";
		//住所を表す
		String address = "愛知県名古屋市〇×";

		//共通の紹介を出力
		public void commonIntroduce() {
			System.out.println("名前は" + familyName + givenName + "です。");
			System.out.println("住所は" + address + "です。");
		}
		
		//個別の紹介（抽象メソッド）
		abstract public void eachIntroduce();
		
		//紹介を実行するメソッド
		public void execIntroduce() {
			commonIntroduce();
			eachIntroduce();
		}

}
