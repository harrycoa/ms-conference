package com.conferencedemo.repositories;

import com.conferencedemo.models.Session;
import com.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
