package javaBasics;

import java.util.Scanner;

public class ComplexNumber {
	
	int imag, real;
	public ComplexNumber(int r, int i) {
		this.real = r;
		this.imag = i;
	}
	public static ComplexNumber addComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
		
		ComplexNumber res = new ComplexNumber(0,0);
		res.imag = num1.imag + num2.imag;
		res.real = num1.real + num2.real;
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexNumber num1 = new ComplexNumber(1,4);
		ComplexNumber num2 = new ComplexNumber(2,3);
		ComplexNumber temp;
		
		temp = addComplexNumbers(num1, num2);
		
		System.out.println(temp.real + " + i" + temp.imag);

	}

}
