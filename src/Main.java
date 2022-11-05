import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" PERSON дукун коруу учун [ Person ] деп жазыныз " +
                "\n CAR дыкын коруу учун [ Car ] деп жазыныз \n" +
                    "UNIVERSITY дикин коруу учун [ Uni ] деп жазыныз\n" +
                    "SCHOOL дукуе коруу учун [ Sch ] деп жазыныз");
        String name=scanner.nextLine();
        while(true){
            switch (name) {
                case "Person" -> Person();
                case "Car" -> Car();
                case "Uni" -> University();
                case "Sch" -> School();
                default -> System.out.println("Mundai san jok");
            }

        }


    }

    public static void Person() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the ID");
        Person person = new Person();
        person.setId(1);
        person.setName("Amir Alymkulov");
        person.setAge((byte) 20);

        Person person1 = new Person();
        person1.setId(2);
        person1.setName("Bektur Duyshenbek  uulu");
        person1.setAge((byte) 21);

        Person person2 = new Person();
        person2.setId(3);
        person2.setName("Zalkar Ismandiyrov");
        person2.setAge((byte) 22);
        Person[] persons = {person1, person2, person};
        long id = scanner.nextLong();
        findById(id, persons);

    }

    public static void findById(long id, Person[] persons) {
        for (Person person : persons) {
            if (person.getId() == id) {
                System.out.println("ID: " + person.getId());
                System.out.println("Name: " + person.getName());
                System.out.println("Age: " + person.getAge());
            }

        }
    }

    public static void Car() {
        Scanner scanner1 = new Scanner(System.in);
        Car car = new Car();
        car.setId(1);
        car.setName("BMW ");
        car.setModel(" E34 ");
        car.setYear(1995);

        Car car1 = new Car();
        car1.setId(2);
        car1.setName("BMW ");
        car1.setModel(" E39 ");
        car1.setYear(2001);

        Car car2 = new Car();
        car2.setId(3);
        car2.setName("Mersedes ");
        car2.setModel(" W124");
        car2.setYear(1992);
        Car[] cars = {car, car2, car1};
        long id = scanner1.nextLong();
        CarId(id, cars);
    }

    public static void CarId(long id, Car[] cars) {
        for (Car car : cars) {
            if (car.getId() == id) {
                System.out.println("ID: " + car.getId());
                System.out.println("Name: " + car.getName());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());

            }

        }

    }
    public static void University(){
        Scanner scanner2 = new Scanner(System.in);
        University university = new University();
        university.setId(1);
        university.setName("International Ala-Too University");
        university.setAddress("1/8 st. Ankara, Bishkek");
        university.setFoundationDate(1996);
        university.setWebsite(" iaau.edu.kg");

        University university1 = new University();
        university1.setId(2);
        university1.setName("American University of Central Asia");
        university1.setAddress("7/6, Aaly Tokombaev, Bishkek");
        university1.setFoundationDate(1993 );
        university1.setWebsite(" www.auca.kg");

        University university2 = new University();
        university2.setId(3);
        university2.setName("Kyrgyz-Turkish Manas University");
        university2.setAddress("56 Ave. Mira, Bishkek 720044");
        university2.setFoundationDate(1995 );
        university2.setWebsite(" manas.edu.kg");
        University[]universities={university,university1,university2};
        long id = scanner2.nextLong();
        UniverID(id,universities);

    }
    public static void UniverID(long id, University[] universities){
        for (University university:universities) {
            if(university.getId()==id){
                System.out.println("ID: "+university.getId());
                System.out.println("Name: "+university.getName());
                System.out.println("Address: "+university.getAddress());
                System.out.println("Foundation Date: "+university.getFoundationDate());
                System.out.println("Website: "+university.getWebsite());
            }

        }
    }
    public static void School(){
        Scanner scanner3 = new Scanner(System.in);
        School school = new School();
        school.setId(1);
        school.setName("ШГ №24 им. А.Токомбаева");
        school.setAddress("Бишкек, Первомайский район Тыныстанова, 110");

        School school1 = new School();
        school1.setId(2);
        school1.setName("Школа-гимназия №72 им. А.Сыдыкова");
        school1.setAddress("Бишкек, Ленинский район мкрн. Джал, ул.Курчатова, 71");

        School school2 = new School();
        school2.setId(3);
        school2.setName("СШ №2");
        school2.setAddress("Бишкек, Ленинский район 720001 Пушкина, 125");
        School[]schools={school1,school2,school};
        long id = scanner3.nextLong();
        SchoolID(id,schools);

    }
    public static void SchoolID(long id, School[] schools){
        for (School school:schools) {
            if(school.getId()==id){
                System.out.println("ID: "+school.getId());
                System.out.println("Name: "+school.getName());
                System.out.println("Address: "+school.getAddress());
            }

        }
    }

    }


