package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {

	public ArquivosController() {
		super();
	}

	@Override
	public void readDir(String path, String nome) throws IOException {
		File dir = new File(path);
		if(dir.exists() && dir.isDirectory()){
			readFile(path, nome);
		}else {
			throw new IOException("Diretório Inexistente");
		}		
	}

	@Override
	public void createFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path,nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String fruta = "";
			String nomeC = "";
			String SGrupo = "";
			while(linha != null) {
				if (linha.contains("Fruits")) {
					fruta = linha.split(",") [0].trim();
					nomeC = linha.split(",") [1].trim();
					SGrupo = linha.split(",") [3].trim();

					System.out.println(fruta +"\t" + nomeC+"\t" + SGrupo);
				}
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo Inexistente");
		}
		
	}

	@Override
	public void openFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
