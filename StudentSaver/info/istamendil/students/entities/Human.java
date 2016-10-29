package info.istamendil.students.entities;

/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class Human extends Object{

  private final String name;
  private float weight;

  public Human(String name, float weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

}
