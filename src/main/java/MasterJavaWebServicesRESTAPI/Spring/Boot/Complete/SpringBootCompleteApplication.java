package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete;

import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.GameRunner;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.MarioGame;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.PacmanGame;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCompleteApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCompleteApplication.class, args);
//		MarioGame game0 = new MarioGame();
//		SuperContraGame game2 = new SuperContraGame();
//		PacmanGame game1 = new PacmanGame();
//		GameRunner runner = new GameRunner(game0);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
