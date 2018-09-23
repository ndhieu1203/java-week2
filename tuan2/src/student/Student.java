package student;

public class Student {
     private String name;
     		 String id;
     		 String group;
     		 String email;
     public Student() {
          this.name = "Student";
          this.id = "000";
          this.group = "K60CC";
          this.email = "uet@vnu.edu.vn";
     }
     public Student(String sid, String n, String em) {
          this.name = n;
          this.id = sid;
          this.email = em;
          this.group = "K60CC";
     }
     public Student(Student s) {
          this.id = s.getId();
          this.name = s.getName();
          this.group = s.getGroup();
          this.email = s.getEmail();
     }

     public void setName(String name) {
          this.name = name;
     }
     public String getName() {
          return this.name; 
     }
     public void setId(String id) {
          this.id = id;
     }
     public String getId() {
          return this.id; 
     }
     public void setGroup(String group) {
          this.group = group;
     }
     public String getGroup() {
          return this.group; 
     }
     public void setEmail(String email) {
          this.email = email;
     }
     public String getEmail() {
          return this.email; 
     }
     public String getInfo() {
          return "ID: " + this.id + "\nName: " + this.name + "\nGroup: " + this.group + "\nEmail: " + this.email;
     }
}