public class UtilPessoa {//uma classe pode ter mais de um método contrutor
	
	public UtilPessoa() {
		
	}
	public UtilPessoa(int z) {
			
	}
	public UtilPessoa(int z, int t) {
		
	}
	public int UtilPessoa(int z) {// NAO É UM MÉTODO CONSTRUTOR, POIS ELE TEM UM RETORNO!
		
	}
	
	public int checarCpf(int x) {
		// Calculo o digito verificador e devolvo;
	}
	protected boolean checarCpf(int num, byte dig) {
		// Calcular e verificar se o digito está correto;
	}
	protected boolean checarCpf(byte dig, int num) {//a ordem dos fatores altera o resultado. nesse caso os parâmetros podem "se repetir"
		// Calcular e verificar se o digito está correto;
	}
	public int checarCpf/*checarCpfStr*/(String x) {
		// Calculo o digito verificador e devolvo;
	}
	public int checarCpf /*checarCpfLng*/(long x) {
		// Calculo o digito verificador e devolvo;
	}
}

/*
	POLIMORFISMO - POR OVERLOAD
Os métodos da classe podem ter nomes iguais para funções parecidas, pra não precisar
escrever um nome diferente pra cada método...basta que tenham não tenham parâmetros,
repetidos, devem ser diferentes todas as vezes, como ser um int, byte, String, long...

	POLIMORFISMO - POR OVERRIDE
Você modifica diretamente o método da classe pai. Porem tem "regras":
- Não pode ser mais restritivo que o método pai;
- 

	MÉTODO CONSTRUTOR
- Mesmo nome que a classe.
- Não tem retorno. 
*/