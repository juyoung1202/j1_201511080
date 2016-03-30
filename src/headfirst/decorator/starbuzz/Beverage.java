package headfirst.decorator.starbuzz;

public abstract class Beverage{ //한파일에 하느라 public지움
  String description = "Unknown bever age";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}