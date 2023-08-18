package MasterJavaWebServicesRESTAPI.Spring.Boot.Complete;

import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.enterprise.example.web.MyWebController;
import MasterJavaWebServicesRESTAPI.Spring.Boot.Complete.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCompleteApplication {

	public static void main(String[] args) {

//		MarioGame game0 = new MarioGame();
//		SuperContraGame game2 = new SuperContraGame();
//		PacmanGame game1 = new PacmanGame();
//		GameRunner runner = new GameRunner(game0);
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCompleteApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
