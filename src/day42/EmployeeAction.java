package day42;

import java.util.ArrayList;

public class EmployeeAction {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name="Ruslan";
		e1.age=36;
		e1.title="Tester";
		e1.salary=110000;
		e1.printAllInfo();
		
		Employee e2 = new Employee();
		e2.name="alpi";
		e2.age=20;
		e2.title="QA engineer";
		e2.salary=90000;
		e2.printAllInfo();
		
		ArrayList<Employee>myPeople = new ArrayList<>();
		myPeople.add(e1);
		myPeople.add(e2);
		myPeople.add(new Employee());
		
		
		System.out.println(myPeople.size());
		
		
		Employee firstItem = myPeople.get(0);
		firstItem.printAllInfo();
		Employee secondItem = myPeople.get(1);
		secondItem.printAllInfo();
		Employee thirdItem = myPeople.get(2);
		thirdItem.printAllInfo();
		
		for(int i=0;i<myPeople.size();i++) {
			
			Employee each = myPeople.get(i);
			
			if(each.age<30)
				each.printAllInfo();
			
			if(each.salary>100000)
				each.printAllInfo();
			
			//each.printAllInfo();
			
		}

		
	}

}
