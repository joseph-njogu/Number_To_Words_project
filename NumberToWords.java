import java.util.*;
public class NumberToWords{
        static int numberToConvert;
        static String tens,ones,hundreds,thousands,placeholder,placeholder2;
     public static void main(String args[]){
        Scanner inputNum = new Scanner(System.in);
        //System.out.println("");
        System.out.println("Number to Words Converter");
        System.out.println("=========================");
        while(0==0){
        numberToConvert = inputNum.nextInt();
        if(numberToConvert>9999){
            System.out.println("sorry this can only convert numbers between 9999 and 0");
        } 
        if(numberToConvert==0){
        System.out.println("Zero");
        }   
        if(numberToConvert<10){
        ones=onesConverter(numberToConvert);
        System.out.println(ones);
        }
        if(numberToConvert>10 && numberToConvert<20){
        int num1 = (int)numberToConvert-10;
        tens=tricky(num1);
        System.out.println(tens);
        }
        if(numberToConvert>19 && numberToConvert<100){
        n19_100();
        }
        else if(numberToConvert>99 && numberToConvert<1000) {
         n99_1000();
        }
        else if(numberToConvert>999 && numberToConvert<10000) {
        n999_10000();        
        }
        else if(numberToConvert>9999 && numberToConvert<999999){
        
        }

        }
    }
    static void n19_100(){
        int num1 = (int)numberToConvert/10;
        tens=tensConverter(num1);
        int num2 =(int)numberToConvert-(num1*10);
        ones = onesConverter(num2);
        System.out.println(tens+" "+ones);
    }
    static void n99_1000(){
        int num1=(int)numberToConvert/100;
        hundreds=onesConverter(num1);
        hundreds=hundreds+" hundred";
        int num2 = (int)(numberToConvert-(num1*100))/10;
        if(num2==1){
        int num3 =(int)(numberToConvert-((num1*100)+(num2*10)));
        tens=tricky(num3);
        ones="";
        }
        else{
        tens=tensConverter(num2);
        int num3 =(int)(numberToConvert-((num1*100)+(num2*10)));
        ones = onesConverter(num3);
        }
        if(numberToConvert%100==0){
        placeholder = " ";
        }
        else{
        placeholder= " and ";
        }
        System.out.println(hundreds+""+placeholder+""+tens+""+ones);
    }
    static void n999_10000(){
        int num1=(int)numberToConvert/1000;
        thousands=onesConverter(num1);
        thousands=thousands+" thousand";
        int num2=(int)((numberToConvert)-(num1*1000))/100;
        hundreds=onesConverter(num2);
        if(numberToConvert%100==0){
        placeholder = " ";
        }
        else{
        placeholder= " and ";
        }
        if(numberToConvert%1000==0){
        placeholder2 = " ";
        }
        else{
        placeholder2= " and ";
        }
        if(num2!=0){
            hundreds=hundreds+" hundred";
        }
        else{
           placeholder = ""; 
        }
        int num3 = (int)(numberToConvert-((num1*1000)+(num2*100)))/10;
        if(num3==1){
        int num4 =(int)(numberToConvert-((num1*1000)+(num2*100)+(num3*10)));
        tens=tricky(num4);
        ones="";
        }
        else{
        tens=tensConverter(num3);
        int num4 =(int)(numberToConvert-((num1*1000)+(num2*100)+(num3*10)));
        ones = onesConverter(num4);
        }
        System.out.println(thousands+""+placeholder2+""+hundreds+""+placeholder+""+tens+""+ones);
    }
    static String onesConverter(int number){
        int numberReceived = number;
        String onesWords;
        switch(numberReceived){
            case 1:{onesWords="one";};break;
            case 2:{onesWords="two";};break;
            case 3:{onesWords="three";};break;
            case 4:{onesWords="four";};break;
            case 5:{onesWords="five";};break;
            case 6:{onesWords="six";};break;
            case 7:{onesWords="seven";};break;
            case 8:{onesWords="eight";};break;
            case 9:{onesWords="nine";};break;
            default:onesWords="";
        }
        return onesWords;
    }
 static String tensConverter(int number){
        int numberReceived = number;
        String tensWords;
        switch(numberReceived){
            //case 7:{tens="Seventy"};break;
            case 9:{tensWords="Ninety ";};break;
            case 8:{tensWords="Eighty ";};break;
            case 7:{tensWords="Seventy ";};break;
            case 6:{tensWords="Sixty ";};break;
            case 5:{tensWords="Fifty ";};break;
            case 4:{tensWords="Forty ";};break;
            case 3:{tensWords="Thirty ";};break;
            case 2:{tensWords="Twenty ";};break;
            default:tensWords="";
        }
        return tensWords;
    }
     static String tricky(int number){
        int numberReceived = number;
        String tensWords;
        switch(numberReceived){
            //case 7:{tens="Seventy"};break;
            case 9:{tensWords="Nineteen ";};break;
            case 8:{tensWords="Eighteen ";};break;
            case 7:{tensWords="Seventeen ";};break;
            case 6:{tensWords="Sixteen ";};break;
            case 5:{tensWords="Fifteen ";};break;
            case 4:{tensWords="Fourteen ";};break;
            case 3:{tensWords="Thirteen ";};break;
            case 2:{tensWords="Twelve ";};break;
            case 1:{tensWords="Eleven ";};break;
            default:tensWords="";
        }
        return tensWords;
    }
       
}