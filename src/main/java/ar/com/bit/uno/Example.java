package ar.com.bit.uno;

import java.util.ArrayList;
import java.util.Collection;

public class Example {

	public static void main(String[] args) {
		Collection<Integer> pares = new ArrayList<Integer>();
		pares.add(new Integer(2));
		pares.add(new Integer(4));
		pares.add(new Integer(6));
		pares.add(new Integer(8));
		pares.add(new Integer(10));
		pares.stream().forEach( n -> System.out.println(n) );
	}

}
