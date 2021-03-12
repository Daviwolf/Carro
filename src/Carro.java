
public class Carro {
	/**
	 * <ul>
	 * 
	 * 
	 * 
	 * </ul>
	 * @author Daviw
	 * 
	 */
	  
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 
/**
 * Consulta o consumo
 * @return  Consultar o consumo do carro
 */
	public static double getConsumo() {
		return consumo;
	}
/**
 * Consulta o combustivel
 * 
 * @return Consultar a quantidade de combustivel
 */
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
/**
 *
 * @return Consultar a capacidade do tanque de combustivel
 */
	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	/**
	 * Serve para colucar combustivel no carro
	 * 
	 * @param quantidade A quantidade de combustivel que se vai por no carro
	 */
	
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o dep�sito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	// M�todos 
	/**
	 * 
	 * Atesta o combustivel
	 * @param quantidade A quantidade de combustivel
	 */
	// atestar o dep�sito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * Vai simular a movimenta��o do carro
	 * @param distancia � a dist�ncia percorrida pelo carro
	 * @return Se est� a andar ou n�o
	 */
	// distancia em klm
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente n�o percorre qualquer distancia 
			// ou anda at� parar porque fica sem combust�vel 
			return false;
		}
			
			
	}
	/**
	 * Serve para parar o carro
	 * 
	 * @return Carro parado
	 */
	public boolean parar() {
		
		// se estiver a andar p�ra 
		// falta a flag que indica se o carro est� em andamento
		return true;
	}
	/**
	 * Serve para calclar a autonomia do carro
	 * 
	 * @return Quantos km se pode fazer com o combustivel atual
	 */
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
