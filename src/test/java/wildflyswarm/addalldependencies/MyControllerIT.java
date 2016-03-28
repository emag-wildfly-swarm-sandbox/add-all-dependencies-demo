package wildflyswarm.addalldependencies;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.ContainerFactory;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

@RunWith(Arquillian.class)
public class MyControllerIT implements ContainerFactory {

  @Deployment(testable = false)
  public static JAXRSArchive createDeployment() throws Exception {
    return MyDeployment.createDeployment();
  }

  @Override
  public Container newContainer(String... strings) throws Exception {
    return MyContainer.newContainer();
  }

  @Test
  public void doNothing() throws Exception {}

}
