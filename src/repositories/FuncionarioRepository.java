package repositories;

import java.io.FileWriter;

import entities.Funcionario;

public class FuncionarioRepository {
	
	public void exportarDados(Funcionario funcionario) throws Exception {
		
		FileWriter fileWriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
		
		fileWriter.write("\nId do Funcion�rio...: " + funcionario.getId());
		fileWriter.write("\nNome........: " + funcionario.getNome());
		fileWriter.write("\nCPF..........: " + funcionario.getCpf());
		fileWriter.write("\nMatr�cula......: " + funcionario.getMatricula());
		fileWriter.write("\nSal�rio........: " + funcionario.getSalario());
		
		fileWriter.write("\n");
		
		fileWriter.write("\nId do Setor......: " + funcionario.getSetor().getId());
		fileWriter.write("\nNome do Setor......: " + funcionario.getSetor().getNome());
		
		fileWriter.write("\n");
		
		fileWriter.write("\nId da Fun��o......: " + funcionario.getFuncao().getId());
		fileWriter.write("\nDescri��o da Fun��o......: " + funcionario.getFuncao().getDescricao());
		
		fileWriter.write("\n");
		
		fileWriter.flush();
		fileWriter.close();
		
	}
	
	
	

}
