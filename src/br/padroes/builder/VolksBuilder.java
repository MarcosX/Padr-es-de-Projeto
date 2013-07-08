package br.padroes.builder;

public class VolksBuilder extends CarroBuilder {
		@Override
		public void buildPreco() {
			carro.preco = 1000.00;
		}

		@Override
		public void buildDscMotor() {
			carro.dscMotor = "1.0 Flex";
		}

		@Override
		public void buildAnoDeFabricacao() {
			carro.anoDeFabricacao = 2010;
		}

		@Override
		public void buildModelo() {
			carro.modelo = "Gol";
		}

		@Override
		public void buildMontadora() {
			carro.montadora = "VolskWagem";
		}

}
