public class varargs{
    static int sum(int ...arr){
        int res=0;
        for(int a: arr){
            res+=a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 4and 5 is:"+sum(4,5));
        System.out.println("the sum of 4and 5 is:"+sum(4,5,6,7,8,9));
}
}

