# AEDAssignment1 - Employee Create, Read, Update, Delete and Search
## Author - RajMehta
## NUID - 002743076

* Basic Decription - This repository contains Employee App where users can perform basic tasks like creation of a new Employee record, reading existing employees, updrading Employee details, deletion of particular Employee and searching of Employees based on certian criteria.

* Technical Dscription - In this Iteration I have used java Swing (https://docs.oracle.com/javase/tutorial/uiswing/) for the front-end of the application. Here I have used two packages viz: model which contains Employee.java file and EmployeeHistory.java and another package UI which contains MainFrame.jav, CreatePanel.java, ReadPanel.java, UpdatePanel.java and SearchPanel.java. No database have been used for this iteration I have stored Employee details (objects) in an ArrayList and same ArrayList is iterated for various CRUD and Search operations.
  
  *Package Model :
    * Employee.java - conatins all data variables like name, employee_id, age, Gender, joining Date, profile picture etc. This class just as constuctor, Getters and setters & a toString method (used to return string value of variables instead of address).
    
    * EmployeeHistory.java - contains ArrayList of DataType Employee and its stores employee details ~ basically employee objects. It also has addEmployeeDetails method.
  
  *Package Ui :
    * MainFrameUi - Contains main UI page, with 4 buttons for CRUD and Search operation. On click of button a panel is loaded on right.
    
    * CreatePanel - Contains Basic form for input of new Employee record. Validation functionality for EmployeeID, age, mobile number and Email is also added.
    
    * Read / Delete Panel - On submit, the table in read panel is populated. When selected a panel and clicking Delete button, the selected Employee is deleted from the ArrayList and populate function is called. Alse, when user wants to view recors one can select a record from table and click on View button. The Details will be displayed in the form below.
    
    * UpdatePanel - Here Employee Details can be updated based on criteria. The object for cretiria is first searched in obj arraylist and then update to user given new value and theread table is repopulated.
    
    * SearchPanel - Here Employee details is search on basis on cearch criteria. Multiple feilds are displayed if critea has multiple entries. Eg: if Employee has two records of name "John", if searched by name "John", multiple entries would be found.
    
    
* Softwares Used -  Apache NetBeans IDE 15
* Java Version - Java HotSpot(TM) 64-Bit Server VM 16.0.2+7-67Java(TM) SE 
* Runtime - Runtime Environment 16.0.2+7-67
* OS - Mac OS X version 10.16 running on x86_64; UTF-8; en_GB (nb)
