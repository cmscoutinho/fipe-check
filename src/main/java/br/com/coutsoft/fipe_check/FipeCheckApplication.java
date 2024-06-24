package br.com.coutsoft.fipe_check;

import br.com.coutsoft.fipe_check.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeCheckApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FipeCheckApplication.class, args);
    }


	@Override
	public void run(String... args) throws Exception{
		Main main = new Main();
	}
}
