package sidmeyer.sayhello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Stas.
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger("Main");
    public static void main(String[] args) {
        LOG.info("Start main");
        SayHello.sayHello();
        LOG.info("End main");
    }
}
