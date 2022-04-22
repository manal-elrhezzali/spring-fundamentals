package com.manal.service;

import com.manal.model.Speaker;
import com.manal.repository.HibernateSpeakerRepositoryImpl;
import com.manal.repository.SpeakerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService{

  //hard-coded SpeakerRepository instance
//  private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

  private SpeakerRepository repository;
  public List<Speaker> findAll() {
    return repository.findAll();
  }

  //setter to convert SpeakerServiceImpl to be injected rather than have
  // hard-coded instances in here
  //after adding Autowired, Spring is going to automatically inject the SpeakerRepository
  // bean into this setter
  @Autowired
  public void setRepository(SpeakerRepository repository) {
    System.out.println("SpeakerServiceImpl setter");
    this.repository = repository;
  }

  public SpeakerServiceImpl() {
    System.out.println("SpeakerServiceImpl no args constructor");
  }

  public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
    System.out.println("SpeakerServiceImpl repository constructor");
    this.repository = speakerRepository;
  }
}
