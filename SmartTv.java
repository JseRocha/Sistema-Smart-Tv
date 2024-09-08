package projeto.smart;

public class SmartTv {
	boolean ligada=false;//mostra se a tv esta desligada ou ligada
	int canal=1;//exibe o canal atual da tv a o ligar
	int volume=25;//exibe o volume atual da tv a o ligar
	
	public void escolherCanal() {//esse metodo escolhe o canal da tv
		canal=50;
	}
	
	public void aumentarVolume() {//esse metodo aumenta o volume da tv em 1 ponto
		volume ++;
	}
	
	public void diminuirVolume() {//esse metodo diminui o volume da tv em 1 ponto
		volume --;
	}
	
	public void pularCanal() {//esse metodo aumenta um canal da tv em 1 ponto
		canal ++;
	}
	
	public void descerCanal() {//esse metodo diminui o canal da tv em 1 ponto
		canal --;
	}
	
	public void ligar() {//esse metodo liga a tv
		ligada = true;
	}
	public void desligar() {//esse metodo desliga a tv
		ligada = false;
	}
}
