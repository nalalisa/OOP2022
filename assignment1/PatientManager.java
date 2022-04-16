package assignment1;

import java.util.*;

public class PatientManager {
    private Patient[] patientList;

    public void mainPatientManager() {
        // �ý����� mainȭ��� �ý��� ����
        System.out.println("==========Welcome to patient management system================");
        System.out.println("1 - Add patient");
        System.out.println("2 - delete patient");
        System.out.println("3 - update patient");
        System.out.println("4 - find patient");
        System.out.println("5 - exit");
        System.out.println("Please enter your choice");

        Scanner keyboard = new Scanner(System.in);
        int menu = keyboard.nextInt();

        switch (menu) {
            case 1:
                addPatient();
                break;

            case 2:
                deletePatient();
                break;
            case 3:
                updatePatient();
                break;
            case 4:
                findAllPatient();
                break;
            case 5:
                break;
        }
    }

    public void addPatient() {
        // patient�� �߰�
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter Patient ID:");
        keyboard.next();

        System.out.println("Please enter patient name:");
        keyboard.next();

        System.out.println("Please enter patient age:");
        keyboard.nextInt();

        System.out.println("Please enter Patient status:");
        keyboard.next();

        System.out.println("Add patient complete, input 1 to continue.");
        keyboard.nextInt();
    }

    public void patientExist(String pid) {
        // patient�� pid �ߺ� Ȯ��
    }

    public void findAllPatient() {
        // ��� patient�� ������ ���
    }

    public void deletePatient() {
        // ������ patient�� ����
    }

    public void updatePatient() {
        // ������ patient�� ������ ����
    }

    public void delete(String pid) {
        // helper function
    }
}
