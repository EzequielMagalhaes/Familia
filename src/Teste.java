public class Teste {
	
	private	static int s; //static
	
	private int ns;//no-static
	
	static {//coisas estaticas
		s = 10; //#1
	}
	static { //polimorfismo nao se aplica as estas coisas estáticas
		s += 10; //#2
	}
	{//coisas nao estaticas
		ns = 20; // #3
	}
	{
		ns += 20; // #4 ... 
				  //pode trocar a ordem, mas o java vai compilar na ordem em que foram criados;
	}
	
	
	
	public static void main(String[] args) {
		new Teste().executar();
	}
		public void executar(){
			System.out.println("Olá teste");
			System.out.println(s + ns);
		}
	}