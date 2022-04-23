package com.manal.repository;

import com.manal.model.Speaker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{

  @Autowired
  private Calendar cal;

  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();

    Speaker speaker = new Speaker();

    speaker.setFirstName("Manal");
    speaker.setLastName("EL RHEZZALI");
    System.out.println("cal: " + cal.getTime());
    speakers.add(speaker);

    return speakers;
  }
}
