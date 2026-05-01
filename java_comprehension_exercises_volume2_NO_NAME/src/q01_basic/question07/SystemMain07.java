package q01_basic.question07;

import java.io.IOException;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;

		try {
			ConsoleReader cr = new ConsoleReader();
			limit = cr.inputNumber();
			numberList.addFromOneTo(limit);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			limit = 0;
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < numberList.getNumbers().size(); i++) {
			if (i == 0) {
				System.out.print("[" + numberList.getNumbers().get(i));
			} else if (i == limit - 1) {
				System.out.print(" ," + numberList.getNumbers().get(i) + "]\n");
			} else {
				System.out.print(" ," + numberList.getNumbers().get(i));
			}
		}

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;

		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");

		numberList.doubleListEachValue();

		for (int i = 0; i < numberList.getNumbers().size(); i++) {
			if (i == 0) {
				System.out.print("[" + numberList.getNumbers().get(i));
			} else if (i == limit - 1) {
				System.out.print(" ," + numberList.getNumbers().get(i) + "]\n");
			} else {
				System.out.print(" ," + numberList.getNumbers().get(i));
			}
		}

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する

		numberList.removeIndexOfFirstHalf();

		for (int i = 0; i < numberList.getNumbers().size(); i++) {
			if (i == 0) {
				System.out.print("[" + numberList.getNumbers().get(i));
			} else if (i == numberList.getNumbers().size() - 1) {
				System.out.print(" ," + numberList.getNumbers().get(i) + "]\n");
			} else {
				System.out.print(" ," + numberList.getNumbers().get(i));
			}
		}

	}

}
