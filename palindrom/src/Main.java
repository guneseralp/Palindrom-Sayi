public class Main {

    static boolean isPalindrom(int number){
        int temp = number, rsNumber = 0,lNumber;

        while(temp != 0){
            lNumber = temp % 10;
            rsNumber = (rsNumber * 10) + lNumber;
            temp /= 10 ;
        }
        if (number == rsNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(4994));
    }
}