class Pai{
	public void show() {
		System.out.println("Eu sou o pai");
	}
}

class Filho extends Pai{
	public void show() { // ele não sobrescreve o método pai, só reposiciona na frente do método pai;
		//super.show(); // ainda é possível chamá-lo usando a super classe.
		System.out.println("Eu sou o filho");
	}
	
	public void baguncar() {
		System.out.println("Eu bagunço a casa");
	}
}

public class Familia{
	public static void main(String[] args) {
		new Familia().arvore();
	}
	public void arvore() {
		Pai p = new Pai();
		p.show();
		Filho f = new Filho();
		f.show();
		
		Pai f2 = new Filho();//o objeto é construido com características de pai;
		f2.show();
	}
}