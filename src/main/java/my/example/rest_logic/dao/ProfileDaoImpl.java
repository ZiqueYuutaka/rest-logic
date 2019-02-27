package my.example.rest_logic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import my.example.rest_logic.entity.Profile;

@Repository
public class ProfileDaoImpl implements ProfileDao {

	//Stand in for database session factory
	private ArrayList<Profile> profiles;

	/**
	 * Demo list
	 */
	@PostConstruct
	public void buildProfileList() {
		profiles = new ArrayList<>();
		profiles.add(new Profile(1, "stevia", "Feeling good"));
		profiles.add(new Profile(2, "beautyMan002", "Feeling awful"));
		profiles.add(new Profile(3, "HoneySuckle", "Feeling meh"));
	}

	@Override
	public List<Profile> getAllProfiles() {
		//TODO: query database
		return profiles;
	}

	@Override
	public Profile getProfileById(int id) {
		//TODO: query database by id
		for(Profile profile: profiles){
			if(profile.getId()==id){
				return profile;
			}
		}
		return null;
	}

	@Override
	public Profile getProfileByUserName(String userName) {
		// TODO: query database by name
		for(Profile profile: profiles){
			if(profile.getUserName().equals(userName)){
				return profile;
			}
		}
		return null;
	}

	@Override
	public Profile saveProfile(Profile profile) {
		
		//simulate automatic database id generation
		if(profile.getId()==0){
			profile.setId(profiles.size()+1);
		}
		
		profiles.add(profile);
		
		return profile;
	}

	@Override
	public Profile updateProfile(Profile profile) {
		Profile temp=null;
		for(Profile p: profiles){
			if(p.getId() == profile.getId()){
				p.setUserName(profile.getUserName());
				p.setStatus(profile.getStatus());
				temp = p;
				break;
			}
		}
		
		if(temp == null){
			//TODO throw custom exception about update error
			temp = new Profile(0, "UPDATE ERROR", "Error updating profile " + profile);
		}

		return temp;
	}

	@Override
	public Profile deleteProfile(int profileId) {
		Profile temp=null;
		for(Profile p: profiles){
			if(p.getId() == profileId){
				System.out.println("===>>>profile to delete: " + p);
				String username = p.getUserName();
				p.setUserName("DELETED USER");
				p.setStatus(username + " successfully deleted");
				temp = p;
				break;
			}
		}
		
		if(temp == null){
			//TODO throw custom exception about update error
			temp = new Profile(0, "DELETE ERROR", "Error deleting profile at " + profileId);
		}
		return temp;
	}

}
