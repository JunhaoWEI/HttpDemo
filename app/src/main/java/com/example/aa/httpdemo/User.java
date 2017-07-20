package com.example.aa.httpdemo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by aa on 2017/7/20.
 */

public class User {


        /**
         * yesterday : {}
         * city : 涓婃捣
         * aqi : 125
         * forecast : [{"date":"20鏃ユ槦鏈熷洓","high":"楂樻俯 39鈩�","fengli":"寰绾�","low":"浣庢俯 30鈩�","fengxiang":"瑗垮崡椋�","type":"鏅�"},{"date":"21鏃ユ槦鏈熶簲","high":"楂樻俯 39鈩�","fengli":"寰绾�","low":"浣庢俯 30鈩�","fengxiang":"瑗垮崡椋�","type":"鏅�"},{"date":"22鏃ユ槦鏈熷叚","high":"楂樻俯 40鈩�","fengli":"寰绾�","low":"浣庢俯 31鈩�","fengxiang":"瑗垮崡椋�","type":"鏅�"},{"date":"23鏃ユ槦鏈熷ぉ","high":"楂樻俯 38鈩�","fengli":"寰绾�","low":"浣庢俯 29鈩�","fengxiang":"涓滃崡椋�","type":"鏅�"},{"date":"24鏃ユ槦鏈熶竴","high":"楂樻俯 39鈩�","fengli":"4-5绾�","low":"浣庢俯 29鈩�","fengxiang":"涓滃崡椋�","type":"鏅�"}]
         * ganmao : 鍚勯」姘旇薄鏉′欢閫傚疁锛屽彂鐢熸劅鍐掓満鐜囪緝浣庛€備絾璇烽伩鍏嶉暱鏈熷浜庣┖璋冩埧闂翠腑锛屼互闃叉劅鍐掋€�
         * wendu : 38
         */

        private YesterdayBean yesterday;
        private String city;
        private String aqi;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
        }

        public static class ForecastBean {
            /**
             * date : 20鏃ユ槦鏈熷洓
             * high : 楂樻俯 39鈩�
             * fengli : 寰绾�
             * low : 浣庢俯 30鈩�
             * fengxiang : 瑗垮崡椋�
             * type : 鏅�
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

    @Override
    public String toString() {
        return "User{" +
                "yesterday=" + yesterday +
                ", city='" + city + '\'' +
                ", aqi='" + aqi + '\'' +
                ", ganmao='" + ganmao + '\'' +
                ", wendu='" + wendu + '\'' +
                ", forecast=" + forecast +
                '}';
    }
}

