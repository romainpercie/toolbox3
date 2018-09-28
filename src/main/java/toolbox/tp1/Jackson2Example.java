package toolbox.tp1;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  Point d'entrée pour améliorer la Javadoc:
 * <a href="https://en.wikipedia.org/wiki/Javadoc">https://en.wikipedia.org/wiki/Javadoc</a>
 *
 *  @author ABC
 */
public class Jackson2Example {

  /**
  *  Point d'entrée pour améliorer la Javadoc: <a href="https://en.wikipedia.org/wiki/Javadoc">https://en.wikipedia.org/wiki/Javadoc</a>
  *
  */
  public static void main(String[] args) {
    Jackson2Example obj = new Jackson2Example();
    // obj.run(args[0]);
    obj.run("C:\\Users\\Romain\\eclipse-workspace\\my-app\\src\\main\\java\\toolbox\\tp1\\staff.json");
  }

  /**
  *  Transforme une  JSON vers un objet de la classe 
  * 
  *  @param input le chemin vers le fichier où sera stocké le résultat. Ne doit pas être null.
  */
  public void run(String input) {
    ObjectMapper mapper = new ObjectMapper();

    Staff staff = createDummyObject();

    try {
      // Convert object to JSON string and save into a file directly
      mapper.writeValue(new File(input), staff);

      // Convert object to JSON string
      String jsonInString = mapper.writeValueAsString(staff);
      System.out.println(jsonInString);

      // Convert object to JSON string and pretty print
      jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
      System.out.println(jsonInString);

    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
  *  Renvoie un objet de la classe Staff généré automatiquement.
  * 
  * @return l'objet créé
  */
  public Staff createDummyObject() {

    Staff staff = new Staff();

    staff.setName("mkyong");
    staff.setAge(33);
    staff.setPosition("Developer");
    staff.setSalary(new BigDecimal("7500"));

    List<String> skills = new ArrayList<String>();
    skills.add("java");
    skills.add("python");

    staff.setSkills(skills);

    return staff;

  }

}