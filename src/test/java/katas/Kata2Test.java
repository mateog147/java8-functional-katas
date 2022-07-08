package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata2Test {

    @Test
    /*solo hay 2 peliculas con ranking de 5*/
    public void testExecute() {
        Assert.assertThat(Kata2.execute().size(), equalTo(2));
    }
}
