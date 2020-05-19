package day06;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		/*
		//예제 1.
		int[][] arr = new int[][] {
			{10,20,30},
			{40,50,60},
			{70,80,90}
		};
		System.out.println("arr[0][0] : " + arr[0][0]);
		System.out.println("arr[0][1] : " + arr[0][1]);
		System.out.println("arr[0][2] : " + arr[0][2]);
		System.out.println("arr[1][0] : " + arr[1][0]);
		System.out.println("arr[1][1] : " + arr[1][1]);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//예제 2.
		//반복문을 이용해 모든 공간에 입력받은 후 모든 값 출력하시오.
		
		Scanner input = new Scanner(System.in);
		int arr[][] = new int[2][3];
		int i, j;
		for(i = 0; i<arr.length; i++) {
			for(j = 0; j<arr[i].length;j++) {
				System.out.print(i + " : " + j + " 번째 입력 : ");
				arr[i][j] = input.nextInt();
			}
		}
		System.out.println("입력 받은 값 출력");
		for(i = 0; i<arr.length; i++) {
			for(j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//예제 3.
		int[][] arr = new int[5][5];
		int cnt = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}
		System.out.println("저장 값 출력");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//예제 4.
		int[][] arr = new int[5][5];
		int cnt = 25;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt--;
			}
		}
		System.out.println("저장 값 출력");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//예제 5.
		int[][] arr = new int[5][5];
		int cnt = 1;
		for(int i = arr.length-1; i>arr.length-6; i--) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = cnt++;
				
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		
		//예제 6.
		int[][] arr = new int[5][5];
		int cnt = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr[i].length - 1; j > arr[i].length-6; j--) {
				arr[j][i] = cnt++;
				//if(cnt==26)break;
			}
		}
		int[][] arr2 = new int[5][5];
		for(int i = arr2.length-1; i>arr2.length-6; i--) {
			for(int j = 0; j < arr[i].length; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		
		for(int i = arr.length; i< arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}System.out.println();
		}
		
	}
}
