package com.enroll.healthcare;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ReverseBinary {
	static void binaryReversal(int num)
	{
        String i = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println("Binary number For given number:::  "+i);
        System.out.println("Reverse Binary number For given number::: "+reverse(i));    
        System.out.println("Converted in to Decimal ::: "+Integer.parseInt(reverse(i), 2));  
    }
	public static String reverse(String string) {
        return Stream.of(string)
            .map(i->new StringBuilder(i).reverse())
            .collect(Collectors.joining(" "));
    }
	public static void main(String[] args)
    {
        int num = 47;
  
        binaryReversal(num);
    }
	
}
