package kadai_018;
//継承
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	//名を表すフィールドの値に一郎をセットし表示させる
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	//	個別の紹介
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです。");
		System.out.println();
	}
}