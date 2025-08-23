import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class vector implements Iterable<Double>,
    Cloneable{
    
private List<Double> coordinates;
   
   
public vector(List<Double> coordinates){
   this.coordinates = new ArrayList<>(coordinates);
   }
   
public double get(int i){
    return coordinates.get(i);
}
  
public void set(int i, double val){
    coordinates.set(i, val);
}
  
public int length(){
    return coordinates.size();
}
public vector add(vector other){
  if(this.coordinates.size() != other.coordinates.size()){
     throw new 
     IllegalArgumentException("Dimension must be same.");
  }
    List<Double> num = new ArrayList<>();
    for(int i = 0; i < coordinates.size(); i++){
        num.add(this.get(i) + other.get(i));
}
  return new vector(num);
}
public vector subtract(vector other){
  if(this.coordinates.size() != other.coordinates.size()){
    throw new 
    IllegalArgumentException("Dimension must be same");
  }
  List<Double> num = new ArrayList<>();
  for(int i = 0; i < coordinates.size(); i++){
    num.add(this.get(i) - other.get(i));
  }
  return new vector(num);
}
public double dotProduct(vector other){
  double num = 0.0;
  for(int i = 0; i < coordinates.size(); i++){
     num += this.get(i) * this.get(i);
  }
  return num;
}

public double magnitude(){
  return Math.sqrt(this.dotProduct(this));
}

public vector crossProduct(vector other){
  if(this.coordinates.size() != 3 || other.coordinates.size() != 3){
    throw new
     IllegalArgumentException("Dimension not match");
  }
  double x = this.coordinates.get(2) * other.coordinates.get(1) -
   this.coordinates.get(1) * other.coordinates.get(2);
  double y = this.coordinates.get(2) * other.coordinates.get(0) - 
  this.coordinates.get(0) * other.coordinates.get(2);
  double z = this.coordinates.get(1) * other.coordinates.get(0) - 
  this.coordinates.get(0) * other.coordinates.get(1);
  
    return new vector(List.of(x,y,z));
}
  @Override
public vector clone(){
    return new vector(coordinates);
}
  @Override
public String toString(){
    return coordinates.toString();
}
 @Override
public boolean equals(Object obj){
    if(!(obj instanceof vector))
    return false;
    vector other = (vector) obj;
    return this.coordinates.equals(other.coordinates);
}
public Iterator<Double> iterator(){
 return coordinates.iterator();
}
    }
