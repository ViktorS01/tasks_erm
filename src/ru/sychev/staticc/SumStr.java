package ru.sychev.staticc;

public class SumStr extends Number{
        String str;

                            public SumStr (String str){
            this.str = str;
        }

            @Override
        public int intValue() {
            int res = 0;
            char [] strToChar = str.toCharArray();
            for (char x: strToChar){
                res += x;
            }
            return res;
        }

        @Override
        public long longValue() {
            return intValue();
        }

        @Override
        public float floatValue() {
            return intValue();
        }

        @Override
        public double doubleValue() {
            return intValue();
        }
}
