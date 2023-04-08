package q0c21;

import java.util.HashSet;
import java.util.Set;

public class PropertyCollection {
  private final Set<Property> properties;

  public PropertyCollection() {
    properties = new HashSet<>();
  }

  // Add a property to the collection
  public void addProperty(Property p) {
    properties.add(p);
  }

  // Return the set of all houses in the collection
  public Set<House> getHouses() {
    Set<House> result = new HashSet<>();
    for (Property p : properties) {
      if (p instanceof House) {
        result.add((House) p);
      }
    }
    return result;
  }

  // Return the set of all bungalows in the collection
  public Set<Bungalow> getBungalows(){
    Set<Bungalow> result = new HashSet<>();
    for (Property p : properties) {
      if (p instanceof Bungalow) {
        result.add((Bungalow) p);
      }
    }
    return result;
  }


  // Return the set of all flats in the collection
  public Set<Flat> getFlats() {
    Set<Flat> result = new HashSet<>();
    for (Property p : properties) {
      if (p instanceof House) {
        result.add((Flat) p);
      }
    }
    return result;
  }

  // Return the set of all maisonettes in the collection
  public Set<Maisonette> getMaisonettes() {
    Set<Maisonette> result = new HashSet<>();
    for (Property p : properties) {
      if (p instanceof House) {
        result.add((Maisonette) p);
      }
    }
    return result;
  }

  // Return the set of all terraced houses in the collection
  public Set<TerracedHouse> getTerracedHouses() {
    Set<TerracedHouse> result = new HashSet<>();
    for (Property p : properties) {
      if (p instanceof House) {
        result.add((TerracedHouse) p);
      }
    }
    return result;
  }
}
