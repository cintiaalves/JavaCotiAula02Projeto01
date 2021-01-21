package repositories;

import java.io.FileWriter;

import entities.Funcionario;

public class FuncionarioRepository {
	
	public void exportarDados(Funcionario funcionario) throws Exception {
		
		FileWriter fileWriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
		
		fileWriter.write("\nId do Funcionário...: " + funcionario.getId());
		fileWriter.write("\nNome........: " + funcionario.getNome());
		fileWriter.write("\nCPF..........: " + funcionario.getCpf());
		fileWriter.write("\nMatrícula......: " + funcionario.getMatricula());
		fileWriter.write("\nSalário........: " + funcionario.getSalario());
		
		fileWriter.write("\n");
		
		fileWriter.write("\nId do Setor......: " + funcionario.getSetor().getId());
		fileWriter.write("\nNome do Setor......: " + funcionario.getSetor().getNome());
		
		fileWriter.write("\n");
		
		fileWriter.write("\nId da Função......: " + funcionario.getFuncao().getId());
		fileWriter.write("\nDescrição da Função......: " + funcionario.getFuncao().getDescricao());
		
		fileWriter.write("\n");
		
		fileWriter.flush();
		fileWriter.close();
		
	}
	
	
	

}
