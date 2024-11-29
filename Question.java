public class Question {
    public static void main(String[] args) {
        int steps = findSteps(123);
        System.out.println(steps);
    }

    static int findSteps(int a)
    {
        return  helper(a, 0);
    }

    static int helper(int a, int steps)
    {
        if(a == 0)
        {
            return steps;
        }
        if(a%2 == 0)
        {
            a /= 2;
        }
        else {
            a -= 1;
        }
//        System.out.println("Steps : "+ steps + "Value : "+a);
        return helper(a, ++steps);
    }
}
