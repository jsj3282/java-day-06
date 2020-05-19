package day06;

public class Test02 {
	public static void main(String[] args) {
		
		/*
		//예제 1.
		int ls[] = new int[] {4, 8, 7, 2, 6};
		int i = 0, j = 0, temp = 0;
		for(; i<ls.length; i++) {
			for(j = i+1; j<ls.length; j++) {
				if(ls[i]>ls[j]) {
					temp = ls[i];
					ls[i] = ls[j];
					ls[j] = temp;
				}
			}
		}
		for(i = 0; i < ls.length; i++) {
			System.out.print(ls[i] + " ");
		}
		
		
		//예제 2.
		int[] score = new int[] {82, 85, 76, 79, 96};
		int i = 0, j = 0, temp = 0;
		for(;i<score.length;i++) {
			for(j=i+1;j<score.length;j++) {
				if(score[j]>score[i]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp;
				}
			}
		}
		for(i = 0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		*/
		
		int[] jumSu = new int[] {82, 85, 76, 79, 96};
		int[] rank = new int[] {1, 1, 1, 1, 1};
		int i = 0, j = 0;
		for(; i<jumSu.length; i++) {
			for(j = 0; j < jumSu.length; j++) {
				if(jumSu[i]<jumSu[j])
					rank[i] += 1;
			}
		}
		i = 0;
		System.out.println("점수\t등수");
		while(i<5) {
			System.out.println(jumSu[i] + "\t" + rank[i]);
			i+=1;
		}
	}
}
