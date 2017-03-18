package sidmeyer.sayhello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Stas.
 */
public class Main {
    static final Logger log = LogManager.getLogger("Main");
    public static void main(String[] args) {
        log.info("Start main");
        SayHello.sayHello();
        log.info("End main");
    }
}
