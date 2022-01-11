package Poised;

public class Architect {
	  // Enter the Architect info
	  private String name;
	  private int number;
	  private String email;
	  private String address;

	  // Constructor
	  public Architect(String name, int number, String email, String address) {
	    this.name = name;
	    this.number = number;
	    this.email = email;
	    this.address = address;
	  }

	    // setters   
	    public void setName(String NewName) {
	      this.name = NewName;
		}
	    
	    public void setNumber(int newNumber) {
	      this.number = newNumber;
	    }
	    
	    public void setEmail(String NewEmail) {
	      this.email = NewEmail;
	    }
	    
	    public void setAddress(String NewAddress) {
	      this.address = NewAddress;
	    }

	    // Getters
	    public String getName() {
	      return name;
	    }
	    public int getNumber() {
	      return number;
	    }
	    public String getEmail() {
	      return email;
	    }
	    public String getAddress() {
	      return address;

	    }
	    // Methods
	    public String toString() {
	      String output = "Name: " + this.name;
	      output += "\nNumber:" + this.number;
	      output += "\nEmail:" + this.email;
	      output += "\nAddress:" + this.address;
	      
	      return output;
	    }
	  }

