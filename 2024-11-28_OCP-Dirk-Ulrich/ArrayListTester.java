import java.util.*;

public class ArrayListTester {
  public static void main(String... args) {
    List<String> list = new ArrayList<String>();
    list.add("SD");
    list.add(0, "NY");
    list.set(1, "FL");
    System.out.println(list.get(0));
    list.remove("NY");
    list.remove(0);
    list.set(0, "FL");
  }
}

