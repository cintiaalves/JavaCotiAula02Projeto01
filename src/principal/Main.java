package principal;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import repositories.FuncionarioRepository;
import utils.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		Setor setor = new Setor();
		Funcao funcao = new Funcao();
		
		try {
		
		funcionario.setId(ScannerUtil.lerInteiro("Informe o ID fo funcion�rio:"));
		funcionario.setNome(ScannerUtil.lerTexto("informe o nome do funcion�rio:"));
		funcionario.setCpf(ScannerUtil.lerTexto("informe o CPF do funcion�rio:"));
		funcionario.setMatricula(ScannerUtil.lerTexto("informe a matr�cula do  funcion�rio:"));
		funcionario.setSalario(ScannerUtil.lerDecimal("informe o sal�rio do funcion�rio: "));
		
		setor.setId(ScannerUtil.lerInteiro("informe o ID do funcion�rio"));
		setor.setNome(ScannerUtil.lerTexto("informe o nome do funcion�rio"));
		
		funcao.setId(ScannerUtil.lerInteiro("informe o ID do setor:"));
		funcao.setDescricao(ScannerUtil.lerTexto("informe a descri�ao da fun��o"));
		
		setor.setId(1);
		setor.setNome("Desenvolvimento de Sistemas");
		
		funcao.setId(1);
		funcao.setDescricao("programador");
		
		funcionario.setSetor(setor);
		funcionario.setFuncao(funcao);
		
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		
			
			funcionarioRepository.exportarDados(funcionario);
			
			System.out.println("\nArquivo gravado com  Sucesso");
			
		}
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		
		
	}

}
