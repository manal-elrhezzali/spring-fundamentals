package com.manal.repository;

import com.manal.model.Speaker;
import java.util.List;

public interface SpeakerRepository {
  List<Speaker> findAll();
}
