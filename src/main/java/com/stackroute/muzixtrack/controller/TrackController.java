package com.stackroute.muzixtrack.controller;

import com.stackroute.muzixtrack.domain.Track;
import com.stackroute.muzixtrack.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class TrackController {
  private TrackService trackService;
  public TrackController() {
  }
  @Autowired
  public TrackController(TrackService trackService){
   this.trackService=trackService;
  }
  @PostMapping("track")
  public ResponseEntity<?> saveTrack(@RequestBody Track track){
    Track savedTrack=trackService.save(track);
    return new ResponseEntity<>(savedTrack, HttpStatus.OK);
  }

  @GetMapping("track/{id}")
  public ResponseEntity<?> getTrackById(@PathVariable int id) {
    System.out.println(id);
    Track trackDetails=trackService.getById(id);
    return new ResponseEntity<>(trackDetails,HttpStatus.OK);
  }
 /* @GetMapping("track")
  public ResponseEntity<?> getAllTracks(@PathVariable Track track){
    Track allTracks=trackService.getAllTracks(track);

  }
  @DeleteMapping("user/{id}")
  public ResponseEntity<?> deleteUserById(@PathVariable("id") int id) {
    List<Track> trackList = trackService.deleteTrackById(id);
    return new ResponseEntity<>(trackList,HttpStatus.OK);
  }*/
}
