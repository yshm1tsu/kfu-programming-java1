/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class Student {
  private final String NAME_SUFFIX = " Student";
  
  private final String name;
  private float weight;
  private final int height;
  private University uni;
  private final Rating rating;
  
  public Student(String name, float weight, int height, Rating rating){
    if(name.length() < 2){
      name = name + NAME_SUFFIX;
    }
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.rating = rating;
  }
  
  public Rating getRating(){
    return this.rating;
  }

  public University getUni() {
    return uni;
  }

  public void setUni(University uni) {
    this.uni = uni;
  }

  public String getName() {
    return name;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    if(weight >= 0){
      this.weight = weight;
    }
  }

  public int getHeight() {
    return height;
  }
  
  public void shoutAboutWeight(){
    System.out.println(this.weight);
  }  
  public void getFood(float foodWeight){
    weight += foodWeight;
  }
  public void learn(){
    weight -= 0.01f;
  }
}
