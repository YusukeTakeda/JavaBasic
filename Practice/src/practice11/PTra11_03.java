package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

	public class PTra11_03 {
		private static final String PTra11_03 = null;
		int number;

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
		PTra11_03(){
			number += 1;
	}

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */

	public static void main(String[] args) {
	sum(5,4);

		// ★ sumメソッドを呼び出してください

	}

	public static void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber："+(PTra11_03)/* + ★ クラスフィールドnumberの出力をしてください */);
	}
}
