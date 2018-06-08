package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {
		Book[] bookL = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String input = new java.util.Scanner(System.in).nextLine();

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		for(int i = 0; i < bookL.length; i++) {
//			if (bookL[i].title.matches(".*"+input+".*")) {
			if (bookL[i].title.contains(input)) {
				System.out.println(bookL[i].dispBookInfo());
			}
		}




	}

}