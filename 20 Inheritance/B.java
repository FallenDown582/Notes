public class B extends A{
  protected String x;
  public B(){
    this("also default");
  }
  public B(String x){
    super();
    this.x = x;
  }
}