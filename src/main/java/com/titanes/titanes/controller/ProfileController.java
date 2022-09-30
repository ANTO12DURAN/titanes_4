package com.titanes.titanes.controller;

import com.titanes.titanes.model.Profile;
import com.titanes.titanes.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping("/profile")
    private void createProfile(@RequestBody Profile profile){
        profileService.createProfile(profile);
    }

    @GetMapping("/profile")
    private List<Profile> readProfile(){
        return profileService.readProfile();
    }

    @PutMapping("/profile")
    private void updateProfile(@RequestBody Profile profile){
        profileService.updateProfile(profile);
    }

    @DeleteMapping("/profile/{id}")
    private  void deleteProfile(@PathVariable("id") Long id){
        profileService.deleteProfile(id);
    }
}
