package com.stackroute.muzixtrack.service;

import com.stackroute.muzixtrack.domain.Track;
import com.stackroute.muzixtrack.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrackServiceImpl implements TrackService {
  private TrackRepository trackRepository;

  @Autowired
  public TrackServiceImpl(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }

  @Override
  public Track save(Track track) {
    Track savedTrack = trackRepository.save(track);
    return savedTrack;
  }

  @Override
  public Track getById(int id) {
    Track retriveTrack = trackRepository.findById(id).get();
    return retriveTrack;
  }


 @Override
  public List<Track> getAllTracks(Track track) {
    return trackRepository.findAll();

  }

  @Override
  public Track deleteTrackById(int id) {
    return null;
  }

  @Override
  public Track updateTrack(int id) {
    return null;
  }
}

