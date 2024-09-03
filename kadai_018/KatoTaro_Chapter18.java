package kadai_018;

//継承：サブクラスextendsスーパークラス
public class KatoTaro_Chapter18 extends Kato_Chapter18{	
	//名を表すフィールドの値に太郎をセットし表示させる
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	//	個別の紹介
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です。");
		System.out.println();
	}
	
}