package com.chainsys.doc_appoint.entry;

//import com.chainsys.doc_appoint.ui.AppointmentUI;
//import com.chainsys.doc_appoint.dao.DoctorDao;
//import com.chainsys.doc_appoint.test.TestDoctorDao;
import com.chainsys.miniproject.test.TestEmployeeDao;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {

public static void main(String[] args) {
//loadMenu();
loadDoctorMenu();
//loadAppointmentMenu();
   }

   private static void loadMenu() {
       System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
       java.util.Scanner sc = new java.util.Scanner(System.in);
     try {
       int call = sc.nextInt();
       switch (call) {
       case 1:
           loadEmployeeMenu();
           break;
       case 2:
           loadDoctorMenu();
           break;
//        case 3:
//            loadAppointmentMenu();
//            break;
       }
     }finally {
         sc.close();
     }
   }

   private static void loadEmployeeMenu() {
       System.out.println(
               "Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee ,4=getEmployeeById,5=getAllEmployee");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       try {
       int call = sc.nextInt();
       
       switch (call) {
       case 1:
           EmployeeUi.addNewEmployee();
           break;

       case 2:
           EmployeeUi.getEmployeeById();
           break;
       case 3:
           EmployeeUi.updateEmployee();
           break;
       
       case 4:
           EmployeeUi.getEmployeeById();
           break;
       case 5:
           EmployeeUi.getAllEmployeesDetails();
           break;
       }
       }finally {
           sc.close();
       }
   }

   private static void loadDoctorMenu() {
       System.out.println(
               "Enter Doctor Method : 1=addNewDoctor ,2=getDoctorById ,3=updateNewDoctor ,4=getAllDoctors, 5=deleteDoctorById ");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       try {
       int call = sc.nextInt();
       switch (call) {
       case 1:
           DoctorUi.addNewDoctor();
           break;
       case 2:
           DoctorUi.getDoctorById();
           break;
       case 3:
           DoctorUi.updateNewDoctor();
           break;
       case 4:
           DoctorUi.getAllDoctor();
           break;
       case 5:
           DoctorUi.deleteDoctorById();
           break;
       }
       }finally {
           sc.close();
       }
   }

   /*private static void loadAppointmentMenu() {
       System.out.println(
               "Enter Method : 1=addNewAppointment ,2=updateAppointments ,3=deleteAppointmentById ,4=getappointmentsById ,5=getAllAppointments");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       try {
       int call = sc.nextInt();
       switch (call) {
       case 1:
           AppointmentUi.addNewAppointments();
           break;
       case 2:
           AppointmentUi.updateAppointments();
           break;
       case 3:
           AppointmentUi.deleteAppointmentsById();
           break;
       case 4:
           AppointmentUi.getAppointmentsById();
           break;
       case 5:
           AppointmentUi.getAllAppointments();;
           break;
       }
       }finally {
           sc.close();
       }
   }*/

}

