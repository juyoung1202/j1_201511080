package headfirst.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{
  public abstract String getDescription(); // 자식이 다시 정의하도록만
}