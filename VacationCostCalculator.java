public class VacationCostCalculator{
       public static double calculatorTotalCost(double accommodationCost, double mealCost, double activityCost){
           return accommodationCost + mealCost + activityCost;
}
           public static void main(String[]args){
            double accommodation=900.25;
            double meals=250.50;
            double activities=300.00;
            double TotalCost= calculateTotalCost(accommodation,meals,activities);
            System.out.println("total Vacation cost:$" + totalCost);
           }
        }

