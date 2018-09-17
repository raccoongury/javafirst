package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.DeptMapper;
import vo.Dept;

@Service

public class DeptService {
	@Autowired
	private DeptMapper deptMapper;
	
	//데이터를 삽입하는 메소드
	@Transactional
	public void insertdept() {
		Dept dept = new Dept();
		dept.setDeptno(12);
		dept.setDname("총무");
		dept.setLoc("광주");
		
		deptMapper.insertdept(dept);
		deptMapper.insertdept(dept);
	}
}
