package com.Patterns;

public class Mletter {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4) {
					System.out.print("M ");
				} else if (i == 1 && j == 1 || i == 2 && j == 2 || i == 1 && j == 3) {
					System.out.print("M ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 0 || i == 2) {
					System.out.print("A ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 2) {
					System.out.print("H ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < 5; j++) {
				if (j == 0 || i == 0 || i == 2 || i == 4) {
					System.out.print("E ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");

			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || i == 2) {
					System.out.print("S ");
				} else if (i == 1 && j == 0 || i == 3 && j == 4) {
					System.out.print("S ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 2) {
					System.out.print("H ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		}
	}

