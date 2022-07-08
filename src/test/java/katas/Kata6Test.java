package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata6Test {

    /*se ajusta el test para que compare una url y no un int*/
    @Test
    public void testExecute() {
        Assert.assertThat(Kata6.execute(), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg"));
    }
}
