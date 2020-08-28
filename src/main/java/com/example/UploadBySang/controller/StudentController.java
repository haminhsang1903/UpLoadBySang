package com.example.UploadBySang.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.UploadBySang.entity.Student;
import com.example.UploadBySang.respository.StudentRespository;

@Controller
public class StudentController {

//	@Autowired
//	StudentRespository respository;
//
//	@RequestMapping({ "/getAll", "/" })
//	public String getAll(Model model) {
//		model.addAttribute("student", new Student());
//		model.addAttribute("getAll", respository.findAll());
//		return "index";
//	}
//
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public String save(@ModelAttribute("student") Student stu, @RequestParam("file") MultipartFile file)
//			throws IOException {
//
//		String filename = StringUtils.cleanPath(file.getOriginalFilename());
//		stu.setLogo(filename);
//		respository.save(stu);
//		String uploadDir = "/uploads/";
//		Path uploadPath = Paths.get(uploadDir).normalize();
//		try {
//			Path filePath = uploadPath.resolve(filename);
//			Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//
//		return "index";
//	}

}
