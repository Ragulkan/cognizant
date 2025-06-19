package DatastructureAlgorithm;

public class ForeCaste {
  public static void main(String[] args) {
    double initialAmount = 1000.0; 
    double growthRate = 0.10;      
    int years = 5;
    double ans=amountCalculation(initialAmount, growthRate, years);
    System.out.println(ans);
    
  }
  public static double amountCalculation(double amount, double growthRate, int years) {
    if (years == 0) {
        return amount;
    }
    return amountCalculation(amount * (1 + growthRate / 100), growthRate, years - 1);
}
  
}
