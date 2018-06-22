/*
 * PTra18_02.java
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

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */


	public static void main(String[] args) {

        ArrayList<Player> array = new ArrayList<>();//Player型というところがポイント
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                String[] params = line.split(",");
                Player player = new Player();
                player.setPosition(params[0]);
                player.setName(params[1]);
                player.setCountry(params[2]);
                player.setTeam(params[3]);
                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

        for(Player player : array) {//player型！！
        	System.out.println(player.toString());
        }






//        ArrayList<String> array = new ArrayList<>();
//        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
//            while (scanner.hasNext()) {
//                String line = scanner.nextLine();
//                // ★ 1行ごとにArrayListに格納してください
//                array.add(line);
//
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("ファイルが見つかりません");
//        }
//
//
//
//        for(String candidates : array) {
//        	String[]  = .split(",");
//        	System.out.println(candidates);
//        }

		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう



		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

	}
}
