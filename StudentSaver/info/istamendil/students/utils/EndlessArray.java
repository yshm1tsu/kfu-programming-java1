package info.istamendil.students.utils;

import java.util.Arrays;

/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class EndlessArray {
  private static final int INIT_CAPACITY = 10;
  private static final float RESIZE_FACTOR = 1.5f;
  
  private Object[] data;
  private int size = 0;
  
  public EndlessArray(){
    this.data = new Object[INIT_CAPACITY];
  }
  public EndlessArray(int initCapacity){
    this.data = new Object[initCapacity];
  }
  
  public void add(Object obj){
    // Check if this.data is full
    if(this.size >= this.data.length){
      int newCapacity = new Double(Math.floor(this.data.length*RESIZE_FACTOR)).intValue();
      Object[] temp = new Object[newCapacity];
      System.arraycopy(this.data, 0, temp, 0, this.data.length);
      this.data = temp;
    }
    this.data[this.size] = obj;
    this.size++;
  }
  
  public Object get(int i){
    if(size < i){
      return null;
    }
    return this.data[i];
  }
  
  public String toString(){
    return Arrays.toString(this.data);
  }
  
}
