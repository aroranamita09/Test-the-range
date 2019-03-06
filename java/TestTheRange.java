 package com.stackroute;
 class TestTheRange {
     int checkTomJerry(int num) {
        if (num >= 20 && num <= 30) {
            if (num % 2 != 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return 2;
    }
    String checkItOut(int num) {
        if (checkTomJerry(num) == 1)
            return "Tom";
         else if (checkTomJerry(num) == 0) return "Jerry";
         else return "Not Found";
    }
}
