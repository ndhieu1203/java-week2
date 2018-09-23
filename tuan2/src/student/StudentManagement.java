package student;

public class StudentManagement {
     private Student[] students = new Student[10];
     private int size = 10;

     public StudentManagement() {
          for (int i=0;i<10;i++) students[i] = new Student();
          students[2].setGroup("K61IE7");
          students[4].setGroup("K61IE7");
          students[6].setGroup("K61IE7");
          students[3].setGroup("K62IE6");
          students[9].setGroup("K62IE6");
          students[2].setId("001");
          students[4].setId("001");
          students[6].setId("001");
     }

     public static void main(String[] args) {
          Student sv1 = new Student();
          sv1.setId("17020741");
          sv1.setName("Nguyen Duc Hieu");
          sv1.setGroup("K62IE7");
          sv1.setEmail("hieunguyenduc1203@gmail.com");
          System.out.println(sv1.getName());
          System.out.println(sv1.getInfo() + '\n');

          Student sv2, sv3, sv4;
          sv2 = new Student();
          sv3 = new Student("17020798", "Ngo Duc Huy", "huy@gmail.com");
          sv4 = new Student(sv2);

          System.out.println(sv2.getInfo() + '\n');
          System.out.println(sv3.getInfo() + '\n');
          System.out.println(sv4.getInfo() + '\n');

          Student sv5, sv6, sv7;
          sv5 = new Student(); sv5.setGroup("K60CA");
          sv6 = new Student(); sv6.setGroup("K60CA");
          sv7 = new Student(); sv7.setGroup("K60CB");

          StudentManagement check = new StudentManagement();
          if(check.sameGroup(sv5, sv6)) System.out.println("sv5 cung lop sv6");
          else System.out.println("sv5 khong cung lop sv6");
          if(check.sameGroup(sv5, sv7)) System.out.println("sv5 cung lop sv7");
          else System.out.println("sv5 khong cung lop sv7");
          if(check.sameGroup(sv6, sv7)) System.out.println("sv6 cung lop sv7");
          else System.out.println("sv6 khong cung lop sv7");


          System.out.println("\nlist student sort by group:\n");
          check.removeStudent("001");
          check.studentsByGroup();
     }

     public boolean sameGroup(Student s1, Student s2) {
          return ((s1.getGroup()).equals(s2.getGroup())) ? true : false;
     }

     public void studentsByGroup() {
          boolean[] checkStudent = new boolean[10];
          for (int i = 0;i < this.size; i++) checkStudent[i] = false;
          for (int i = 0; i < this.size; i++) {
               if (checkStudent[i] == false) {
                    System.out.println(students[i].getInfo() + '\n');
                    for (int j = i + 1; j < 10; j++) {
                         if (students[i].getGroup().equals(students[j].getGroup())) {
                              System.out.println(students[j].getInfo() + '\n');
                              checkStudent[j] = true;
                         }
                    }
                    checkStudent[i] = true;
               }
               
          }
     }

     public void removeStudent(String id) {
          for (int i=0;i<this.size;i++) {
               if (students[i].getId().equals(id)) {
                    for (int j = i;j < this.size - 1; j++) {
                         students[j] = students[j+1];
                    }
                    this.size--;
               }
          }
     }
}