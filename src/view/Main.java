package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String dirTemp = "C:\\TEMP";
		String nome ="generic_food.csv";
		
		try {
			arqCont.readDir(dirTemp, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
