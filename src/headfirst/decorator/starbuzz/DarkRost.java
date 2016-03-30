package headfirst.decorator.starbuzz;

class DarkRost extends Beverage{
  public DarkRost(){
   description = "Dark Rost Coffee";
  }
  public double cost(){
   return .99; 
  }
}