package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete;

import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.GameRunner;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCompleteApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootCompleteApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
