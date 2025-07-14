class Exercise6_22 {

    static boolean isNumber(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c>='0' && c<='9') {
                check++;
            } else {check =0;}
        }
        if(check == str.length()) {return true;}
        else{return false;}
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
    }
}

