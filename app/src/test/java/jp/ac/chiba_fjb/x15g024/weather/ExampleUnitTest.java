package jp.ac.chiba_fjb.x15g024.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;


import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test   //←これを書いたメソッドが実行される
    public void Main(){
        try {
            URL url = new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=400040");
            ObjectMapper mapper = new ObjectMapper();
            WeatherData wd = mapper.readValue(url,WeatherData.class);
            System.out.println(wd.publicTime);
            System.out.println(wd.title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}