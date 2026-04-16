package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemName = { "a", "b", "c", "d", "e" };
		int[] Price = { 0, 0, 0, 0, 0 };

		System.out.println("商品1を入力してください：＞");
		itemName[0] = reader.readLine();

		System.out.println("商品2を入力してください：＞");
		itemName[1] = reader.readLine();

		System.out.println("商品3を入力してください：＞");
		itemName[2] = reader.readLine();

		System.out.println("商品4を入力してください：＞");
		itemName[3] = reader.readLine();

		System.out.println("商品5を入力してください：＞");
		itemName[4] = reader.readLine();

		System.out.println("\n各商品の単価を順に入力してください。\n");

		System.out.println(itemName[0] + "の単価：＞");
		String itemPrice1 = reader.readLine();
		Price[0] = Integer.parseInt(itemPrice1);

		System.out.println(itemName[1] + "の単価：＞");
		String itemPrice2 = reader.readLine();
		Price[1] = Integer.parseInt(itemPrice2);

		System.out.println(itemName[2] + "の単価：＞");
		String itemPrice3 = reader.readLine();
		Price[2] = Integer.parseInt(itemPrice3);

		System.out.println(itemName[3] + "の単価：＞");
		String itemPrice4 = reader.readLine();
		Price[3] = Integer.parseInt(itemPrice4);

		System.out.println(itemName[4] + "の単価：＞");
		String itemPrice5 = reader.readLine();
		Price[4] = Integer.parseInt(itemPrice5);

		System.out.println("登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemName[i] + "：" + Price[i] + "円");
		}

	}

}
