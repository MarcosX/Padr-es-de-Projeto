package br.padroes.strategy;

public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int DBA = 3;
	protected double salarioBase;
	protected int cargo;
	protected CalculaImposto estrategiaDeCalculo;

	public Funcionario(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		switch (cargo) {
		case DESENVOLVEDOR:
			estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
			cargo = DESENVOLVEDOR;
			break;
		case DBA:
			estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
			cargo = DBA;
			break;
		case GERENTE:
			estrategiaDeCalculo = new CalculoImpostoVinteOuQuinze();
			cargo = GERENTE;
			break;
		default:
			throw new RuntimeException("Cargo não encontrado :/");
		}
	}

	public double calcularSalarioComImposto() {
		return estrategiaDeCalculo.calculaSalarioComImposto(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
}
