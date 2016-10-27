/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class Rating {
  private int[] points;
  private int size;
  
  public Rating(){
    this.points = new int[100];
    this.size = 0;
  }
  
  public void addClassesPoints(int p){
    this.points[size] = p;
    size++;
  }
  
  public int getPoints(int i){
    return this.points[i];
  }
  
  public float getAverage(){
    if(size == 0){
      return 0;
    }
    float summ = 0;
    for(int i =0; i<size; i++){
      summ += this.points[i];
    }
    return summ/size;
  }
}
