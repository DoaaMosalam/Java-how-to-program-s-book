    package Exercise;

    public class HugeInteger {
        // declare variables Array and size array.
        private static final int HUGE_INTEGER_LIMIT = 40;
        private int[] hugeInteger = new int[HUGE_INTEGER_LIMIT];
        private int hiLength;   // store length to avoid truncating trailing zero's


        // constructor
        public HugeInteger(String strInteger){
            if(strInteger.length() <= 0)
                throw new IllegalArgumentException("length must be greater than zero");

            parse(strInteger);
        }
        public HugeInteger(int[] hugeInteger){
            this.hugeInteger = hugeInteger;
        }
        // GETTERS
        public int[] getHugeInteger(){
            return this.hugeInteger;
        }
        public int getLength(){
            return this.hiLength;
        }
        // parse
        // add to array starting at HUGE_INTEGER_LIMIT - length to avoid truncating
        // trailing zero's
        private void parse(String strOriginal){
            String strHugeInteger = "";

            // build String composed of only digits
            for(int i=0; i<strOriginal.length(); i++){
                Character c = strOriginal.charAt(i);

                if(Character.isDigit(c))
                    strHugeInteger += c;
            }

            // ensure String length does not exceed hugeInteger size
            hiLength = (strHugeInteger.length() > hugeInteger.length) ?
                    hugeInteger.length : strHugeInteger.length();

            // add to array
            int c = 0;

            for(int i=HUGE_INTEGER_LIMIT - hiLength; i<HUGE_INTEGER_LIMIT; i++){
                hugeInteger[i] = strHugeInteger.charAt(c++) - 48;
            }
        }
        // parse to string for printing
        private String parseToString(){
            String strHugeInteger = "";

            for(int i=HUGE_INTEGER_LIMIT - hiLength; i<HUGE_INTEGER_LIMIT; i++){
                strHugeInteger += hugeInteger[i];
            }

            return strHugeInteger;
        }
        public static HugeInteger add(HugeInteger hi1, HugeInteger hi2){
            int[] temp1 = hi1.getHugeInteger();
            int[] temp2 = hi2.getHugeInteger();
            String strTemp ="";

            int count = ((hi1.getLength() > hi2.hiLength)) ? hi1.getLength() : hi2.getLength();
            for (int i = HUGE_INTEGER_LIMIT-count; i < HUGE_INTEGER_LIMIT ; i++) {
                strTemp+= temp1[i] + temp2[i];
            }
            return new HugeInteger(strTemp);
        }

        public static HugeInteger subtract(HugeInteger hi1, HugeInteger hi2){
            int[] temp1 = hi1.getHugeInteger();
            int[] temp2 = hi2.getHugeInteger();
            String strTemp ="";
            int count = ((hi1.getLength()) > hi1.getLength()) ? hi1.getLength() : hi2.getLength();
            for (int i = HUGE_INTEGER_LIMIT -count; i < HUGE_INTEGER_LIMIT ; i++) {
                strTemp+= temp1[i] + temp2[i];
            }
            return new HugeInteger(strTemp);
        }

        public static boolean isEqualTo(HugeInteger hi1, HugeInteger hi2){
            int[] temp1 = hi1.getHugeInteger();
            int[] temp2 = hi2.getHugeInteger();
            for (int i = 0; i <HUGE_INTEGER_LIMIT ; i++) {
                if (temp1[i] != temp2[i])
                    return false;
            }
            return true;
        }

        public static boolean isNotEqualTo(HugeInteger hi1,HugeInteger hi2){
            if (isEqualTo(hi1,hi2))
                return false;
            return true;
        }

        public static boolean isGreaterThan(HugeInteger hi,HugeInteger hi2){
            if (isEqualTo(hi,hi2))
                return false;
            return true;
        }

        public static boolean isLessThan(HugeInteger hi1,HugeInteger hi2){
            return true;

        }

        public static boolean isGreaterThanOrEqualTo(HugeInteger hi1,HugeInteger hi2){
            if (isGreaterThan(hi1,hi2) || isEqualTo(hi1,hi2))
                return true;
            return false;
        }
        public static boolean isLessThanOrEqualTo(HugeInteger hi1,HugeInteger hi2){
            if (isLessThan(hi1,hi2) || isEqualTo(hi1,hi2))
                return true;
            return false;
        }

        public boolean isZero(){
            for (int i: getHugeInteger()) {
                if (i != 0)
                    return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return String.format("%s",parseToString());
        }

        public static void ShowData(){
            HugeInteger hi1 = new HugeInteger("1234567800911");
            HugeInteger hi2 = new HugeInteger("1234567800911");
            HugeInteger hiAdd = HugeInteger.add(hi2, hi2);
            HugeInteger hiSub = HugeInteger.subtract(hi2, hi2);
            System.out.println("hi1 " + hi1.toString());
            System.out.println("hi2 " + hi2.toString());
            System.out.println("add " + hiAdd.toString());
            System.out.println("sub " + hiSub.toString());
            System.out.println("isEqualTo " + HugeInteger.isEqualTo(hi1, hi2));
            System.out.println("isNotEqualTo " + HugeInteger.isEqualTo(hi1, hi2));
            System.out.println("isGreaterThan " + HugeInteger.isGreaterThan(hi1, hi2));
            System.out.println("isLessThan " + HugeInteger.isLessThan(hi1, hi2));
            System.out.println("isGreaterThanOrEqualTo " +
                    HugeInteger.isGreaterThanOrEqualTo(hi1, hi2));
            System.out.println("isLessThanOrEqualTo " +
                    HugeInteger.isLessThanOrEqualTo(hi1, hi2));
            System.out.println("hi1 isZero " + hi1.isZero());
            System.out.println("hi1 isZero " + hi2.isZero());


        }
    }
