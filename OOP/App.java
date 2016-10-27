/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class App {
  public static void main(String[] args) {
    University kfu = new University("Kazan Federal University");
    
    Rating r1 = new Rating();
    Student s1 = new Student("U", 60.0f, 190, r1);
    s1.setUni(kfu);
    s1.getRating().addClassesPoints(76);
    s1.getRating().addClassesPoints(89);
    s1.getRating().addClassesPoints(98);
    
    Rating r2 = new Rating();
    Student s2 = new Student("K", 65.0f, 195, r2);
    s2.setUni(kfu);
    
    System.out.println(s1.getName());
    System.out.println(s1.getRating().getPoints(1));
    System.out.println(s1.getRating().getAverage());
    System.out.println(s2.getName());
    System.out.println(s2.getRating().getAverage());
  }
}
