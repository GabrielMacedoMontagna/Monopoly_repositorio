package cartas_do_jogo;

public class ServicoPublico extends Propriedade {
	private int multiplicador;

	//construtor.
	public ServicoPublico(int preco, int aluguel, int posicao, String nome, String descricao, TipoCarta tipo, int multiplicador) {
		super(preco, aluguel, posicao, nome, descricao, tipo);
		this.multiplicador = multiplicador;
	}
	
	@Override
	public int calcularAluguel() {
		//multiplica o aluguel base pelo multiplicador da propriedade.
		return super.getAluguel() * multiplicador;
	}
	
	public String toString() {
		String out = "";
		
		 out += "SERVIÇO PÚBLICO\n";
		 out += "Nome: " + super.getNome() + "\n";
		 out += "Descrição: " + super.getDescricao() + "\n";
		
		 if (super.getDono() == null) {
			 out += "Dono: não possui dono\n";
		 }
		 else {
			 out += "Dono: " + super.getDono().getNome() + "\n";
		 }
		
		 out += "Preço: " + super.getPreco() + " reais.\n";
		 out += "Aluguel: " + super.getAluguel() + " reais.\n";
		 
		 return out;
	}
	
}