package jp.ac.chiba_fjb.x15g024.weather;

import android.media.Image;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Created by x15g024 on 2017/06/15.
 */

@JsonIgnoreProperties(ignoreUnknown=true) //クラス定義に含まれていないものは読み飛ばす
class WeatherData{
    public Date publicTime;
    public String title;
    static class Description{
        public String text;
        public Date publicTime;
    }
    public Description description;

    static class Forecasts{
        public String dateLabel;
        public String telop;
        public Date date;
        static class Temperature{
            static class A {
                public int celsius;
                public double fahrenheit;
            }
            public A min;
            public A max;
        }
        public Temperature temperature;
        static class Image{
            public int width;
            public String url;
            public String title;
            public int height;
        }
        public Image image;

    }
    public Forecasts[] forecasts;

}
