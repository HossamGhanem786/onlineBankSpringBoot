package com.onlineBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineBank.domain.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	List<Appointment> findAll();
}
