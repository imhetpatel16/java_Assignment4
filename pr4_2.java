public class prset4_2 {

        static void fun() throws IllegalAccessException
        {
            System.out.println("Inside fun(). ");
            throw new IllegalAccessException("demo");
        }
        public static void main(String args[])
        {
            try
        {
            fun();
        }
        catch (IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
            System.out.println("This programm is created by Het Patel- 21CE091");
        }
    }
