class Varargs{
    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4));
    } 
    static double avg(double... number){
        double sum = 0;
        for(double num : number){
            sum = sum + num;
        }
        double average = sum/number.length; 
        return average;
    }
}