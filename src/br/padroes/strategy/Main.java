package br.padroes.strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}
}
