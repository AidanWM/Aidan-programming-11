public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        for(int i = 0;i < s.length(); i++){

            if(s.substring(i,i + 1).equals("a")){
                answer = answer +1;
            }
            if(s.substring(i,i + 1).equals("e")){
                answer = answer +1;
            }
            if(s.substring(i,i + 1).equals("i")){
                answer = answer +1;
            }
            if(s.substring(i,i + 1).equals("o")){
                answer = answer +1;
            }
            if(s.substring(i,i + 1).equals("u")){
                answer = answer +1;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        for(int i = 0;i < s.length(); i++){
            if(i == s.length()-2){
                break;
            }
            if(s.substring(i,i + 3).equals("bob")){
                answer = answer +1;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        char letter0 = s.charAt(0);
        char letter1 = s.charAt(1);
        char letter2 = s.charAt(2);
        char letter3 = s.charAt(3);
        char letter4 = s.charAt(4);
        char letter5 = s.charAt(5);
// I had no idea what to do here.
        boolean alphaOrder = letter1 < letter0;
        if(alphaOrder){
            s.substring(0,s.length()-1);
        }
        boolean alphaOrder1 = letter2 < letter1;
        if(alphaOrder1){
            s.substring(1,s.length()-1);
        }
        boolean alphaOrder2 = letter3 < letter2;
        if(alphaOrder2){
            s.substring(2,s.length()-1);
        }
        boolean alphaOrder3 = letter4 < letter3;
        if(alphaOrder3){
            s.substring(3,s.length()-1);
        }
        boolean alphaOrder4 = letter5 < letter4;
        if(alphaOrder4){
            s.substring(4,s.length()-1);
        }

        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
