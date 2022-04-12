import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20,"20.02.2000"));
      s.addStudent(new Student("Janusz", 40,"31.06.2021"));

      //Commit 3_1
      String imie;
      int wiek;
      String data;
      System.out.println("Witaj w programie!");
      int i=0;
      while(i==0){
      System.out.println("Aby dodac studenta do listy wybierz liczbe 1");
      System.out.println("Aby wyswietlic liste studentow wybierz liczbe 2");
        System.out.println("Aby zakonczyc program wybierz 3");
         System.out.println("Twoj wybor: ");
      int wybor;
      Scanner wpisz=new Scanner(System.in);
      wybor=wpisz.nextInt();
      switch(wybor)
        {
          case 1:
              System.out.println("Podaj imie studenta: ");
              imie=wpisz.next();
            System.out.println("Podaj wiek: ");
              wiek=wpisz.nextInt();
            System.out.println("Podaj date: ");
              data=wpisz.next();
            s.addStudent(new Student(imie, wiek, data));  
            break;
        
      case 2:
    {
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    break;
        }
      case 3:
    {
      i=1;
      
    break;
        }
      default:
        System.out.println("Nie ma takiego wyboru");
        }
        }
    } catch (IOException e) {

    }
  }
}