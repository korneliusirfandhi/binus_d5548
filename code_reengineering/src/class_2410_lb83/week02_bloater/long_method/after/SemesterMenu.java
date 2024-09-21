package class_2410_lb83.week02_bloater.long_method.after;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;


public class SemesterMenu {
	private Vector<Semester> semesters;
	private Scanner scan;

	public SemesterMenu() {
		semesters = new Vector<Semester>();
		scan = new Scanner(System.in);
	}

	public void open() {
		while(menu()) {}
	}

	private boolean menu(){
		showSemesters();
		int input = printAndGetMenu();
		switch(input){
		case 1: create(); break;
		case 2: delete(); break;
		case 3: return false;
		}
		return true;
	}

	private void showSemesters() {
		for(int i = 0; i < semesters.size(); i++) {
			Semester s = semesters.elementAt(i);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

			System.out.print((i+1) + ". ");
			showSemester(s, format);
			System.out.println("");
		}
		System.out.println("");
	}

	private void showSemester(Semester s, SimpleDateFormat format) {
		System.out.print(s.getLabel());
		System.out.print(" - ");
		System.out.print(format.format(s.getStart()));
		System.out.print(" - ");
		System.out.print(format.format(s.getEnd()));
	}

	private int printAndGetMenu() {
		System.out.println("1. Create");
		System.out.println("2. Delete");
		System.out.println("3. Exit");
		return getIntInput("Input", 1, 3);
	}

	private int getIntInput(String message, int min, int max) {
		int input = 0;
		do{
			System.out.printf("%s [%d-%d]: ", message, min, max);
			try {
				input = scan.nextInt();
			} catch (Exception e) {
				input = 0;
			} finally {
				scan.nextLine();
			}
		}while(input < min || input > max);
		return input;
	}

	private String getStringInput(String message, int min, int max) {
		String input = "";
		do {
			System.out.printf("%s [%d-%d chars]: ", message, min, max);
			input = scan.nextLine().trim();
		} while(input.length() < min || input.length() > max);
		return input;
	}

	private Date getDateInput(String message, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		simpleDateFormat.setLenient(false);
		Date date = null;
		do {
			try {
				System.out.printf("%s [%s]: ", message, format);
				String input = scan.nextLine().trim();
				date = simpleDateFormat.parse(input);
			} catch (Exception e) {
				date = null;
			}
		} while(date == null);
		return date;
	}

	private void delete() {
        int input = getIntInput("Choose semester", 1, semesters.size());
		semesters.removeElementAt(input-1);
	}

	private void create() {
		String label = "";
		do {
			label = getStringInput("Input label", 3, 20);
		} while(!isLabelUnique(label));

		Date startDate = null;
		Date endDate = null;

		do {
			startDate = getDateInput("Input start date", "yyyy-MM-dd");
			endDate = getDateInput("Input end date", "yyyy-MM-dd");
		}while(startDate.after(endDate));

		semesters.add(new Semester(label, startDate, endDate));
	}

	private boolean isLabelUnique(String label) {
		for(Semester s : semesters) {
			if(s.getLabel().equalsIgnoreCase(label)) return false;
		}
		return true;
	}
}
