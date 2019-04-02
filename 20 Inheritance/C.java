public class C extends B{
  protected String x;
  public C(){
    this("still default");
  }
  public C(String x){
    super();
    this.x = x;
  }
}