package wildflyswarm.addalldependencies;

import org.wildfly.swarm.container.Container;

public class App {

  public static void main(String[] args) throws Exception {
    MyContainer.newContainer()
      .start()
      .deploy(MyDeployment.createDeployment());
  }

}
