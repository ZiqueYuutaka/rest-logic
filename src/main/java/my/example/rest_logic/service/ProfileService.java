package my.example.rest_logic.service;

import java.util.List;

import my.example.rest_logic.entity.Profile;

/**
 * Data manipulation layer for profile objects
 * @author Izak Wood-Ferren
 *
 */
public interface ProfileService {
	
	public List<Profile> getAllProfiles();
	
	public Profile getProfileById(int id);
	
	public Profile getProfileByUserName(String userName);

}
