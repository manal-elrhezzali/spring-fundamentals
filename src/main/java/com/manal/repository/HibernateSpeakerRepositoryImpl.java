package com.manal.repository;

import com.manal.model.Speaker;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();

    Speaker speaker = new Speaker();

    speaker.setFirstName("Manal");
    speaker.setLastName("EL RHEZZALI");

    speakers.add(speaker);

    return speakers;
  }
}
