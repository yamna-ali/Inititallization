public class Main {

    public static void main(String[] args) {
      /*
      Number of days: 10
Health Scale: 8.5
Are you ready to power up? true
Total Assessment: It has been 10 days since you've started working out.
You evaluate at 8.5 out of 10 on the health scale.
It is true that you are ready to power up your workout!
       */




        int workOutDays = 10;
        double health = 8.5;
        boolean powerUp = true;
        System.out.println("Number of days: "+ workOutDays +"\n" + "Health Scale: "+ health+ "\n"+ "Are you ready to power up?"+ powerUp);
        System.out.println("Total Assessment: It has been "+ workOutDays+ " days since you have started working out."+ "\n" + "You evaluate at "+ health +
                " out of 10 on the health scale.");
        System.out.println("It is true that you are ready to power up your workout");
    } }
