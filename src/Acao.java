interface Ola{
	void show();
}
class OlaI implements Ola{//não é necessário criar essa classe, da pra usar a interface anônima...economizando memória;
	public void show() {
		System.out.println("Olá");
	}
}

public class Acao{
	public static void main(String[] args) {
		new Acao().executar();
	}
	public void executar() {
		realizarAcao(new OlaI(){ //CLASSE ABSTRATA ANÔNIMA;
			public void show() {
				System.out.println("Olá sou uma interface anônima"); //objeto anônimo;
			}
		});//precisa passar um parâmetro dentro(classe nova criada), pois nao é possivel criar um objeto apartir da interface;
		realizarAcao(new OlaI(){//objeto anônimo;
			public void show() {
				System.out.println("Olá de novo");
			}
		});
	}
	
	public void realizarAcao(Ola o) {
		o.show();
	}
}