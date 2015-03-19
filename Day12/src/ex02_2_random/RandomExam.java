package ex02_2_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {
	
	public static void main(String[] args) {
		
		// ���ù�ȣ
		int[] selectedNumbers = new int[6];
		Random random = new Random();
		/*
		System.out.print("���� ��ȣ: ");
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
		System.out.print("���� ��ȣ: ");
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
		
		
		// �ζ� ��ȣ ��÷
		int[] winningNumbers = new int[6];
		random = new Random();
		System.out.print("��÷ ��ȣ: ");
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
		
		// ��÷ ���� Ȯ��
		Arrays.sort(selectedNumbers);
		Arrays.sort(winningNumbers);
		boolean win = Arrays.equals(selectedNumbers, winningNumbers);
		if (win) {
			System.out.println("1�� ��÷!!!");
		} else {
			System.out.println("1� ��÷���� �ʾҽ��ϴ�.");
		}
		
	}
	
}
