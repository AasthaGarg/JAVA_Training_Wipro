package com.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
@Transactional
public class StudentDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public boolean insertStudent(Student student) {
		hibernateTemplate.persist(student);
		return true;
	}

}
