package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class duplicateTaskTest {
	
	@Test
	public void testValidTask() {

		Assertions.assertTrue(duplicateTask.validatetaskName("Taskplay"));

	}

	@Test
	public void testInValidTask() {

		try {
			duplicateTask.validatetaskName(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("TaskName cannot be null or empty", ex.getMessage());
		}

		try {
			duplicateTask.validatetaskName("a");
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The  task name should be  minimum 2 letters and maximum 200 letters", ex.getMessage());
		}

	}
	
	
	
	
	
	@Test
	public void testValidDate() {
		 LocalDate currentDate = LocalDate.now();
	        LocalDate futureDate = currentDate.plusDays(7);

		Assertions.assertTrue(duplicateTask.validateTaskDate(futureDate));

	}
	
	@Test
	public void testInValidDate() {
		
		
		try {
			duplicateTask.validateTaskDate(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task date cannot be null", ex.getMessage());
		}
		 LocalDate currentDate = LocalDate.now();
	        LocalDate lastDate = currentDate.minusDays(7);
	        
	    	try {
	    		duplicateTask.validateTaskDate(lastDate);
				Assertions.fail("Validatepriority failed");
			} catch (IllegalArgumentException ex) {
				Assertions.assertEquals("Task date cannot be in the past.", ex.getMessage());
			}
	        


	}
	
	
	
	
	
	@Test
	public void testValidTaskMethod() {

		ArrayList<duplicateTask> taskList = new ArrayList<>();
		taskList.add(new duplicateTask(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new duplicateTask(1, "tasklearn", LocalDate.of(2023, 7, 17)));
		taskList.add(new duplicateTask(3, "tasklearntwo", LocalDate.of(2023, 7, 19)));

		Assertions.assertTrue(duplicateTask.validateDuplicatemethod(taskList));

	}
	
	
	
	@Test
	public void testInValidTaskMethod() {

		ArrayList<duplicateTask> taskList = new ArrayList<>();
		duplicateTask t1 = new duplicateTask(1, "taskplay", LocalDate.of(2023, 7, 15));
		taskList.add(t1);
		taskList.add(t1);
		taskList.add(new duplicateTask(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new duplicateTask(3, "tasklearn", LocalDate.of(2023, 7, 17)));
		try {
		Assertions.assertTrue(duplicateTask.validateDuplicatemethod(taskList));
		Assertions.fail("Validatepriority failed");
		}
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("duplicate task found", e.getMessage());
		}
	}
	
	
	
	
}