public class ques4 {

    public static void main(String args[])
    {
      int population=80000;
      int year=0;
      while(population<150000)
      {
        population=population+ ((population*5)/100);
        year++;
      }
      System.out.println("The population first Exceed in "+ year+"th year");

    }
    
}
