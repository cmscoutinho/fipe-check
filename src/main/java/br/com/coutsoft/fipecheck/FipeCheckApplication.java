package br.com.coutsoft.fipecheck;

import br.com.coutsoft.fipecheck.main.Main;
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
		new Main().main();
	}
}
