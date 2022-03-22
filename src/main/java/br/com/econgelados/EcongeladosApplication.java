package br.com.econgelados;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.econgelados.application.ApplicationMain;
import javafx.application.Application;

@SpringBootApplication
public class EcongeladosApplication {

	public static void main(String[] args) {
		Application.launch(ApplicationMain.class, args);
	}
}
