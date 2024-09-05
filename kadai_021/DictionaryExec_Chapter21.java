package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスのインスタンス作成		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセット
		dictionary.searchWord("apple");
		
		dictionary.searchWord("banana");
		
		dictionary.searchWord("grape");
		
		dictionary.searchWord("orange");

	}

}