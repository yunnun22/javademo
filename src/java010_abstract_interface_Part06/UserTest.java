package java010_abstract_interface_Part06;

public class UserTest extends User implements Score, Print {
	   int s;

	   public UserTest() {

	   }

	   public UserTest(String name, int s) {
	      super(name);
	      this.s = s;

	   }

	   @Override
	   public String toPaint() {
	      return String.format("ė´í: %s\nė ė: %d\n", toString(), getScore());
	   }

	   @Override
	   public int getScore() {
	      return sol * s;
	   }

	}