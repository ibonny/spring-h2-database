package spring.h2.database;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {
    // protected final Log logger = LogFactory.getLog(getClass());

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Ian", "Bonnycastle");

        logger.info("Created user.");

        userService.save(user);

        List<User> users = userService.findAll();

        for (User u: users) {
            logger.info(u.toString());
        }
    }
}