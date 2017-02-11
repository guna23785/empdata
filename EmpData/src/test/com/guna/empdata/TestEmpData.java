package test.com.guna.empdata;

import com.guna.empdata.EmpData;

public class TestEmpData {

	public static void main(String[] args) {
		EmpData empdata = new EmpData();
		empdata.setId(001);
		empdata.setName("guna");
		empdata.setPhnumber(66682);
		empdata.setBaselocation("STP1");
		System.out.println(empdata);
		
		EmpData empdata1 = new EmpData();
		empdata1.setId(001);
		empdata1.setName("guna");
		empdata1.setPhnumber(66682);
		empdata1.setBaselocation("STP1");
		System.out.println(empdata1);
	}

}
