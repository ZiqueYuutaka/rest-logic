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

}
