package my.example.rest_logic.entity;

//@Entity
//@Table(name="profile")
public class Profile {
	
	private int id;
	private String userName;
	private String status;
	
	public Profile(){
		
	}

	public Profile(int id, String userName, String status) {
		this.id = id;
		this.userName = userName;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", userName=" + userName + ", status=" + status + "]";
	}
	
	

}
