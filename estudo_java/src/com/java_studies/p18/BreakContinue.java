package com.java_studies.p18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		// Loop com break:
		Scanner scanner1 = new Scanner(System.in); //

		System.out.println("Insira um número:");
		int numero1 = scanner1.nextInt();

		System.out.println("Insira um número limite:");
		int limite1 = scanner1.nextInt();

		for (int i = numero1; i <= limite1; i++) {

			if (i % 7 == 0) {
				break;
			} else {
				System.out.println(i);
			}
		}

		// Loop com continue:
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("Insira um número:");
		int numero2 = scanner2.nextInt();

		System.out.println("Insira um número limite:");
		int limite2 = scanner2.nextInt();

		for (int i = numero2; i <= limite2; i += 1) {

			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}

		// GO TO:
		for (int i = 0; i <= 5; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("rotulo 3");
					}
					System.out.println("rotulo 2");
				}
				System.out.println("rotulo 1");
			}
			System.out.println(i);
		}

	}
}
