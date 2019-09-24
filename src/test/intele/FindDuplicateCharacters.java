package test.intele;

import java.util.Scanner;

public class FindDuplicateCharacters {
	void getDuplicateCharacters() {
		System.out.print("Please enter any string to find the number of repeated word: ");
		Scanner sc = new Scanner(System.in);
		String inputSting = sc.next();
		sc.close();
		
		int cnt = 0;
		char[] inp = inputSting.toCharArray();
		System.out.print("Duplicate Characters are: ");
		for (int i = 0; i < inputSting.length(); i++) {
			for (int j = i + 1; j < inputSting.length(); j++) {
				if (inp[i] == inp[j]) {

					System.out.print(inp[j] + " ");
					cnt++;
					break;
				}				
			}
		}
		System.out.println();
		System.out.print("Total repeated characters are: "+ cnt);
	}
}
