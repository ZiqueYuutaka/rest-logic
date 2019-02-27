package my.example.rest_logic.dao;

import java.util.List;

import my.example.rest_logic.entity.Profile;

public interface ProfileDao {

	public List<Profile> getAllProfiles();
	
	public Profile getProfileById(int id);
	
	public Profile getProfileByUserName(String userName);
	
	public Profile saveProfile(Profile profile);
	
	public Profile updateProfile(Profile profile);
	
	public Profile deleteProfile(int profileId);
}
