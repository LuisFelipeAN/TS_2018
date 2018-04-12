
public class Calculadora {
	public int resultado;
	public int soma(int a, int b){
		resultado=a+b;
		return a+b;
	}
	public int multiplicacao(int a, int b){
		resultado=a*b;
		return a*b;
	}
	public int divisao(int a, int b){
		resultado=a/b;
		return a/b;
	}
	public int subtracao(int a, int b){
		resultado=a-b;
		return a-b;
	}
	public boolean maiorque(int a, int b){
		return a>b ? true : false;
	}

}
