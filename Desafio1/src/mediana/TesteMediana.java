package mediana;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMediana {

	@Test
	public void test() {
		Mediana mediana = new Mediana();
		int vetor[] = {1,2,3};
	    int y=3;
	    if (y % 2 == 0) {
	    	System.out.println("� um vetor par");
	    }
	    else {
	    	System.out.println("� um vetor impar");
	    }
	    double expResult = 3;
	    double result = mediana.ordenaEidentifica (vetor, y);
	    assertEquals(expResult, result);
	}

}
