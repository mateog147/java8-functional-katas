package katas;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata10Test {

    @Test
    public void testExecute() {
        Logger logger = Logger.getLogger("logger");
        logger.info(Kata10.execute().toString());
        Assert.assertThat(Kata10.execute().size(), equalTo(2));
    }
}
