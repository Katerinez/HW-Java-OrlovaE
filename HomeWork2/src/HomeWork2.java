public class HomeWork2 {

    public static void main(String[] args) {

        System.out.println("Home Work 2");
        System.out.println("   ");
        System.out.println("Task-1");
        System.out.println(checkSum(20,-3));

        System.out.println("   ");
        System.out.println("Task-2");
        if (numSign(36)==true){
            System.out.println("Число положительное");
        } else{
            System.out.println("Число отрицательное");
        }

        System.out.println("   ");
        System.out.println("Task-3");
        System.out.println(numSign2(0));

        System.out.println("   ");
        System.out.println("Task-4");
        cycleStr("Believe in yourself...", 2);

        System.out.println("   ");
        System.out.println("Task-5");
        if (determineTheYear(800) ==true) {
            System.out.println("год високосный");
        } else {
            System.out.println("год  НЕ високосный");
        };

    }

    public static boolean checkSum(int a, int b){
        return (a+b)>=10 && (a+b)<=20;
    }

    public static boolean numSign(int c){
        return c>=0;
    }

    public static boolean numSign2(int d){
        return d<0;
    }

    public static void cycleStr(String str1, int a ){
        for (int i=0; i<a; i++){
            System.out.println(str1);
        }
    }

    public static boolean determineTheYear(int b){
        return b%4==0 && b%100!=0 ^ b%400==0;
    }
}

