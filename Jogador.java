package PPT_Pack;

public class Jogador {
	String jogador;
	
		private String nome;
		private int escolha1;
		private int escolha2;
		
		
		
		
		public Jogador(String jogador, String nome, int escolha1, int escolha2) {
			super();
			this.jogador = jogador;
			this.nome = nome;
			this.escolha1 = escolha1;
			this.escolha2= escolha2;
		}

		public int getEscolha1() {
			return escolha1;
		}

		public void setEscolha1(int escolha1) {
			this.escolha1 = escolha1;
		}
		public int getEscolha2() {
			return escolha2;
		}

		public void setEscolha2(int escolha2) {
			this.escolha2 = escolha2;
		}

		public Jogador(String nome) {

			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Jogador(String jogador, String nome) {
			this.jogador = jogador;
			this.nome = nome;
		}

	}
