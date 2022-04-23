package com.manal.repository;

import com.manal.model.Speaker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{

  @Autowired
  private Calendar cal;

  //use SpEL to grab a value from the java.lang.Math library
  @Value("#{ T(java.lang.Math).random() * 100}")
  private double seedNum;


  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();

    Speaker speaker = new Speaker();

    speaker.setFirstName("Manal");
    speaker.setLastName("EL RHEZZALI");
    speaker.setSeedNum(seedNum);
    System.out.println("cal: " + cal.getTime());
    speakers.add(speaker);

    return speakers;
  }
}
