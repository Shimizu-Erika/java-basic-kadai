package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {	
	
	public void searchWord(String word) {
	//HashMapの宣言	
		HashMap<String,String> map = new HashMap<String,String>();
	
		//putメソッドで要素を追加
		map.put("apple","りんご");
		map.put("peach","桃");
		map.put("banana","バナナ");
		map.put("lemon","レモン");
		map.put("pear","梨");
		map.put("kiwi","キウイ");
		map.put("strawberry","いちご");
		map.put("grape","ぶどう");
		map.put("muscat","マスカット");
		map.put("cherry","さくらんぼ");
	
		    
			if (map.containsKey(word)) {
				System.out.println(word + "の意味は" + map.get(word));
			}else {
				System.out.println(word + "は辞書には存在しません");
			 }
			
	}
}