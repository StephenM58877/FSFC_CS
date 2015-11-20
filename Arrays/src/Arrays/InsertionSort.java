package Arrays;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[]args){
		final long startTimeIS = System.currentTimeMillis();
		int[]q=new int [1000];
		for(int x=0;x<1000;x++){
			int random = (int )(Math.random() * 10000 + 1);
			q[x]=random;
		}
		int tempVal=0;
		int currentPos=0;
		for (currentPos=1;currentPos<q.length;++currentPos){
			while(currentPos>0 && q[currentPos]<q[currentPos-1]){
				tempVal=q[currentPos];
				q[currentPos]=q[currentPos-1];
				q[currentPos-1]=tempVal;
				--currentPos;
			}
		}
		for(int i=0;i<q.length;++i){
			System.out.println(q[i] + " ");
		}
		long endTimeIS = System.currentTimeMillis();
		
		final long startTimeBS = System.currentTimeMillis();
		int[]b=new int [1000];
		for(int r=0;r<1000;r++){
			int random = (int )(Math.random() * 10000 + 1);
			b[r]=random;
		}
		int temp=0;
		for(int i=0;i<b.length-1;++i){
			for(int j=0;j<b.length-1;j++){
				if(b[j]>b[j+1]){
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(q));
		System.out.println(Arrays.toString(b));
		long endTimeBS = System.currentTimeMillis();

		System.out.println("Total execution time for insertion sort: " + (endTimeIS - startTimeIS) + " Milliseconds" );
		System.out.println("Total execution time for Bubble Sort: " + (endTimeBS - startTimeBS) + " Milliseconds" );
		}
	}

