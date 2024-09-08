package projeto.smart;

public class Usuario {
	
	public static void main(String[] args) throws Exception{
		
	
	SmartTv smartTv = new SmartTv();//pega o objeto tv e o "rotula" para pode ser referenciado
	
	smartTv.diminuirVolume();//decresce o volume em 1
	smartTv.diminuirVolume();//decresce o volume em 1
	smartTv.diminuirVolume();//decresce o volume em 1
	smartTv.diminuirVolume();//decresce o volume em 1
	smartTv.aumentarVolume();//aumenta o volume em 1
	smartTv.escolherCanal();//muda o canal para o predterminado (50)
	smartTv.pularCanal();//sobe canal em 1
	smartTv.pularCanal();//sobe o canal em 1
	smartTv.descerCanal();//desce o canal em 1
	
	System.out.println("Tv ligada? " + smartTv.ligada);//mostra se a tv esta ligada
	System.out.println("Canal atual: " + smartTv.canal);//mostra o canal atual
	System.out.println("Volume atual: " + smartTv.volume);//mostra o nivel de volume da tv
	
	smartTv.ligar();
	System.out.println("Novo status Tv Ligada: " + smartTv.ligada);//atualiza o status da tv
	
	smartTv.desligar();
	System.out.println("Novo statusTv Ligada: " + smartTv.ligada);//atualiza o status da tv
	}
}
