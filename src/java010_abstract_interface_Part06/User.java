package java010_abstract_interface_Part06;

public class User {
	   private String name;

	   public User() {

	   }

	   public User(String name) {
	      this.name = name;
	   }

	   @Override
	   public String toString() {
	      return name;
	   }
	}