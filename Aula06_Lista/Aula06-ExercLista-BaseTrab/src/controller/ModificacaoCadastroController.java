package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//import br.com.leandrocolevati.Lista.Lista;
import model.Cliente;

public class ModificacaoCadastroController {


//	public ModificacaoCadastroController() {
//
//	}
//
//	private void novoArquivo(Lista l, String nomeArquivo) {
//
//	}
//
//	public void novoCadastro(int idadeMin, int idadeMax, Double limiteCredito) {
//		
//	}

	public void leArquivo(String caminho, String nome) throws IOException {
		File arq = new File(caminho, nome);		
		if(arq.exists() && arq.isFile()) {			
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);			
			String linha = buffer.readLine();
			
			while (linha != null) {
				Cliente c = new Cliente();
				String[] partes = linha.split(";");
													
				System.out.print(partes[0] + "---" + partes[1] + "---" + partes[2] + "---" + partes[3] + "---");												
				
				System.out.println();
				c.cpf = partes[0];
				c.nome = partes[1];
				c.idade = Integer.parseInt(partes[2]);
				String[] p = partes[3].split(",");
				c.limiteCredito = Double.parseDouble(p[0]);
				
				linha = buffer.readLine();
			}			
			System.out.println(linha);
			
			buffer.close();
			leitor.close();
			fluxo.close();			
		}else {
			throw new IOException ("Arquivo Inválido");
		}	
	}

//	public void abreArquivo(String caminho, String arquivo) throws IOException {
//		Desktop desktop = Desktop.getDesktop();
//		File arq = new File(caminho, arquivo);
//		if (arq.exists() && arq.isFile()) {
//			desktop.open(arq);
//		}
//	}
//	
//	
//	private String geraConteudo() {
//		StringBuffer buffer = new StringBuffer();
//		String linha = "";
//		while (!linha.equals("fim")) {
//			leAquivo();
//			if (!linha.equals("fim")) {
//				buffer.append(linha+"\r\n");
//			}
//		}
//		return buffer.toString();
//	}
//	
//	
//	public void leArquivo(String caminho, String arquivo) throws IOException {
//		File arq = new File(caminho, arquivo);
//		if (arq.exists() && arq.isFile()) {
//			FileInputStream fluxo = new FileInputStream(arq);
//			InputStreamReader leFluxo = new InputStreamReader(fluxo);
//			BufferedReader buffer = new BufferedReader(leFluxo);
//			String linha = buffer.readLine();
//			while (linha != null) {
//				if (linha.contains(";")) {
//					String[] vetLinha = linha.split(";");
//					System.out.print(vetLinha[0]+"\t");
//					if (vetLinha[1].length() > 7) {
//						System.out.println(vetLinha[1]+"\t");
//					} else {
//						System.out.println(vetLinha[1]+"\t\t");
//					}
//					System.out.println(vetLinha[2]);
//				}
//				linha = buffer.readLine();
//			}
//			buffer.close();
//			leFluxo.close();
//			fluxo.close();
//		} else {
//			throw new IOException("Arquivo inválido");
//		}
//	}

}
