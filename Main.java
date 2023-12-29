public class Main {
    public static void main(String[]args){
        int checkNumber = 10;
        String message;
        
        for (int i = 1; i <= checkNumber; i++){
            message = (i%2==0) ? i+ " is even number" : i+" is odd number";
            System.out.println(message);
        }
        

        

    }

}
