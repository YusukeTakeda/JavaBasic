/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {
		ArrayList<Player> array = new ArrayList<>();//Player型というところがポイント
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] params = line.split(",");
				//一行の選手情報を","で分割する。
				Player player = new Player();
				//while 一周ごとにPlayer インスタンスを作成している。
				player.setPosition(params[0]);
				player.setName(params[1]);
				player.setCountry(params[2]);
				player.setTeam(params[3]);
          
			
				//一周ごとにそれぞれのパラメーターを取得している。
				array.add(player);
				//Player型コレクションに各選手情報を追加している


			}
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
//
//		for(Player player : array) {//player型！！
//			System.out.println(player.toString());//オーバーライドしたとこ！
//		}
		
		

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		for(int i = array.size()-1; i >= 0 ; i --) {
			if(array.get(i).getTeam().equals("レアル・マドリード")||
					array.get(i).getTeam().equals("バルセロナ")) {
				array.remove(i);
			}
		}
		


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player player : array) {
			System.out.println(player.toString());
		
		}

	}
}
