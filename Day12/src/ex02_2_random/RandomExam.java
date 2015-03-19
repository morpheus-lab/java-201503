package ex02_2_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {
	
	public static void main(String[] args) {
		
		// 선택번호
		int[] selectedNumbers = new int[6];
		Random random = new Random();
		/*
		System.out.print("선택 번호: ");
		for (int i = 0; i < 6; i++) {
			int temp = random.nextInt(45) + 1;
			boolean duplicated = false;
			for (int j = 0; j < i; j++) {
				if (temp == selectedNumbers[j]) {
					duplicated = true;
					break;
				}
			}
			if (duplicated) i--;
			else {
				selectedNumbers[i] = temp;
				System.out.print(selectedNumbers[i] + " ");
			}
		}
		System.out.println();
		*/
		System.out.print("선택 번호: ");
		for (int i = 0; i < 6; i++) {
			selectedNumbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (selectedNumbers[i] == selectedNumbers[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(selectedNumbers));
		
		
		// 로또 번호 추첨
		int[] winningNumbers = new int[6];
		random = new Random();
		System.out.print("당첨 번호: ");
		for (int i = 0; i < 6; i++) {
			int temp = random.nextInt(45) + 1;
			boolean duplicated = false;
			for (int j = 0; j < i; j++) {
				if (temp == winningNumbers[j]) {
					duplicated = true;
					break;
				}
			}
			if (duplicated) i--;
			else {
				winningNumbers[i] = temp;
				System.out.print(winningNumbers[i] + " ");
			}
		}
		System.out.println();
		
		// 당첨 여부 확인
		Arrays.sort(selectedNumbers);
		Arrays.sort(winningNumbers);
		boolean win = Arrays.equals(selectedNumbers, winningNumbers);
		if (win) {
			System.out.println("1등 당첨!!!");
		} else {
			System.out.println("1등에 당첨되지 않았습니다.");
		}
		
	}
	
}
