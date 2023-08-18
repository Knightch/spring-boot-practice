package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete;

import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.GameRunner;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.MarioGame;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCompleteApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootCompleteApplication.class, args);
		MarioGame game = new MarioGame();
		SuperContraGame game2 = new SuperContraGame();
		GameRunner runner = new GameRunner(game2);
		runner.run();
	}

}
