package fr.glechelon.veilleTechno.java9.core.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MyHttpClientTest {

    private MyHttpClient myHttpClient = new MyHttpClient();


    @Test
    public void test() throws IOException, InterruptedException {

        //GIVEN

        //WHEN
        String out = myHttpClient.call();

        //THEN
        System.out.println(out);
        Assertions.assertNotNull(out);

    }
}
