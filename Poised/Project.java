package Poised;

public class Project {
	  // Info on New Project
	  private double totalAmount;
	  private String deadline;
	  private String buildingname;
	  private String type;
	  private double price;
	  private String customer;
	  private String buildingaddress;
	  private Architect name1;

	  // Method
	  public Project(int amount, String deadline, String buildingname, String type,
	    double price, String customer, String buildingaddress) {
	    this.totalAmount = amount;
	    this.deadline = deadline;
	    this.buildingname = buildingname;
	    this.type = type;
	    this.price = price;
	    this.customer = customer;
	    this.buildingaddress = buildingaddress;
	  }

		// getters  
		public double getAmount() {
		    return totalAmount;
		  }
		  public String getDeadline() {
		    return deadline;
		  }
		  public String getName() {
		    return buildingname;
		  }
		  public String getType() {
		    return type;
		  }
		  public double getPrice() {
		    return price;
		  }
		  public String getCustomer() {
		    return customer;
		  }
		  public String getbuildingaddress() {
			    return buildingaddress;
		  }
		  public Architect getname1() {
		    return name1;
		  }
		  // Setters
		  
		  public void setAmount(double newAmount ) {
	          this.totalAmount = newAmount;
	      }
	      public void setDeadline(String NewDeadline) {
	          this.deadline = NewDeadline;
	      }
	      public void setType(String NewType) {
	          this.type = NewType;
	      }
	      public void setAddress(String NewAddress) {
	          this.buildingaddress = NewAddress;
	      }
	      public void setName(String NewName) {
	          this.buildingname = NewName;
	      }
	      public void setPrice(double NewPrice) {
	          this.price = NewPrice;
	      }
	      public void setCustomer(String NewCustomer) {
	          this.customer = NewCustomer;
	      }
	      public void setArchitect (Architect NewArchitect) {
	          this.name1 = NewArchitect;
	      }

	public String toString() {
	    String output = "Name: " + this.buildingname;
	    output += "\nType:" + this.type;
	    output += "\nPrice:" + this.price;
	    output += "\nCustomer:" + this.customer;
	    output += "\nAddress:" + this.buildingaddress;
	    output += "\nAmount:" + this.totalAmount;
	    output += "\nArchitect:" + this.name1;
	    
	    return output;
	  }
	}
