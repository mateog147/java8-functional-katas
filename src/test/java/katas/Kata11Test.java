package katas;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata11Test {

    @Test
    public void testExecute() {

        Logger logger = Logger.getLogger("logger");
        logger.info(Kata11.execute().toString());
        Assert.assertThat(Kata11.execute().size(), equalTo(2));
    }
}
