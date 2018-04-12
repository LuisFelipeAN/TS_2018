import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculadoraTest {
		/*assertEquals(esperado,resultado)
		 * assertSame(esperado,resultado)mesmo ponteiro
		 */ 
		public static Calculadora c;
		@BeforeClass
		public static void Antesdoteste(){
			c = new Calculadora();
			System.out.println("BeforeClass");
		}
		@Before
		public void depois(){
			System.out.println("Before");
			System.out.println(c.resultado);

		}
		@After
		public void antes(){
			System.out.println("After");


			System.out.println(c.resultado);
		}
		

		@Test
		public void testasoma(){
		
			int soma = c.soma(4, 6);
			assertEquals(10,soma);
			soma = c.soma(0, 6);
			assertEquals(6,soma);
			soma = c.soma(0,0);
			assertEquals(0,soma);

		}
		@Test
		public void testaDivisao(){
			int div = c.divisao(10, 0);
			assertEquals(0,div);
		}
		@Test
		public void testamult(){
			int mul = c.multiplicacao(10, 0);
			assertEquals(0,mul);
		}
		@Test
		public void testasubitracao(){
			int sub = c.subtracao(10, 0);
			assertEquals(10,sub);
		}
		
		@Test
		public void testamaiorque(){
			boolean sub = c.maiorque(10, 0);
			assertTrue(sub);
		}
		
		@AfterClass
		public static void depoisTestes(){
			System.out.println("AfterClass");
		}
		
}
