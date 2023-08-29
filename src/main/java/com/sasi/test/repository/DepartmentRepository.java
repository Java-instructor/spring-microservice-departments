package com.sasi.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasi.test.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}