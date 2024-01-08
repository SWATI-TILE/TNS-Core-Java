package com.amazon.product;

public class nested_for {

	public static void main(String[] args) {
		int a[] = {2,4,1,9,8,5},temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
