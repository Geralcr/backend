
import com.digitalhouse.test.TestLog;
import com.digitalhouse.week1.class1Student.Circle;
import com.digitalhouse.week1.class1Student.Square;
import com.digitalhouse.week1.class1Teacher.People;
import com.digitalhouse.week1.class1Teacher.Person;
import com.digitalhouse.week1.class2Student.Menu;
import com.digitalhouse.week1.class2Student.MenuChild;
import com.digitalhouse.week1.class2Student.MenuClassic;
import com.digitalhouse.week1.class2Student.MenuVeggy;
import com.digitalhouse.week1.class2Teacher.FixedEmployee;
import com.digitalhouse.week1.class2Teacher.HiredEmployee;
import com.digitalhouse.week1.class2Teacher.LiquidatorFixedEmployee;
import com.digitalhouse.week1.class2Teacher.LiquidatorHiredEmployee;
import com.digitalhouse.week1.class3Student.Affiliated;
import com.digitalhouse.week1.class3Student.Employee;
import org.apache.log4j.Logger;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

       logger.info("holaaaaaaaaaaaaaa");
       logger.error("holis");

        //Clase 1 Profesor
//            class1Teacher();
        //Clase 1 Mesitas de trabajo
//            class1Student();
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Clase 2 Profesor
//            class2Teacher();
        //Clase 2 Mesitas de trabajo
//            class2Student();
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Clase 3 Mesitas de trabajo
//            class3Student();
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Clase 4 Profesor
//            class4Student();
        //Clase 4 Mesitas de trabajo
//            class4Teacher();
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Clase 5 Profesor
//            class5Teacher();
        //Clase 5 Mesitas de trabajo
//            class5Student();
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Clase 6 Mesitas de trabajo
//            class6Student();
    }

    public static void class1Teacher(){
        Person Juan = new Person("Juanito","Digital",18);
        Person Pedro = new Person("Pedro","Digital",17);
        Person Ana = new Person("Ana","Digital",22);
        Person Luz = new Person("Luz","Digital",14);
        Person Julian = new Person("Julian","Digital",32);
        People personasClase = new People();
        personasClase.addPerson(Juan);
        personasClase.addPerson(Pedro);
        personasClase.addPerson(Ana);
        personasClase.addPerson(Luz);
        personasClase.addPerson(Julian);
        personasClase.getPeopleCount();
    }
    public static void class1Student(){
        Circle circulo = new Circle(5.0);
        Square cuadrado = new Square(10.0);
        System.out.println(circulo.areaPerUnits());
        System.out.println(cuadrado.areaPerUnits());
    }

    public static void class2Teacher(){
        FixedEmployee fixedEmployee = new FixedEmployee("Martín","Martini",12345,400.0,40.0,60);
        LiquidatorFixedEmployee liquidatorFixedEmployee = new LiquidatorFixedEmployee();
        System.out.println(liquidatorFixedEmployee.liquidatorSalary(fixedEmployee));
        HiredEmployee hiredEmployee = new HiredEmployee("Pompilia ","Pompini",67890,40,100.0);
        LiquidatorHiredEmployee liquidatorHiredEmployee = new LiquidatorHiredEmployee();
        System.out.println(liquidatorHiredEmployee.liquidatorSalary(hiredEmployee));}

    public static void class2Student(){
        Menu.setBasePrice(200.00);
        MenuChild menuNene = new MenuChild(4);
        menuNene.priceCalcuation();
        MenuVeggy menuVeg = new MenuVeggy(true,2);
        menuVeg.priceCalcuation();
        MenuClassic menuNormal = new MenuClassic();
        menuNormal.priceCalcuation();
    }

    public static void class3Student(){
        Employee empleado = new Employee("Geraldine",20,2,5);
        Affiliated afiliado = new Affiliated("Jade",30);
        System.out.println("Empleado");
        System.out.println(empleado.showCategory());
        System.out.println("Afiliado");
        System.out.println(afiliado.showCategory());
    }

    public static void class4Teacher(){}
    public static void class4Student(){}

    public static void class5Teacher(){}
    public static void class5Student(){}

    public static void class6Student(){}

}

