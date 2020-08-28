package com.example.UploadBySang.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UploadBySang.entity.Student;

public interface StudentRespository extends JpaRepository<Student, String>{

}
