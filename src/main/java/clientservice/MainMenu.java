package clientservice;

import XmlBuilder.ObjectXmlTransformer;

import java.util.Scanner;

public class MainMenu {
    private Scanner in;
    private RequestBuilder reqBuilder;
    private Citizen citizen;
    private ObjectXmlTransformer transformer;
    static final String home = "http://10.0.0.8:8000/home";
    static final String test = "http://10.0.0.8:8000/test";
    static final String newCitizen = "http://10.0.0.8:8000/new_citizen";



    private String name;
    private String surname;
    private String fathername;
    private int age;

    public void run() {
        int enteredNum = 0;
        in = new Scanner(System.in);
        System.out.println("Добро пожаловать!");
        System.out.println("Для регистрации в системе введите 1");

        if(in.hasNextInt() && ((enteredNum = in.nextInt()) > 0)) {
            in.nextLine();
            switch (enteredNum) {
                case 1:
                    registerCitizen();
                    break;
                default:
                    System.out.println("Вы не выбрали число!");
            }
        }
        else System.out.println("Введите целое положительное число");
    }

    public void registerCitizen() {
        citizen = new Citizen();
        //in = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        citizen.setName(in.nextLine());
        System.out.println("Введите фамилию");
        citizen.setSurname(in.nextLine());
        System.out.println("Введите ваше отчество");
        citizen.setFatherName(in.nextLine());
        System.out.println("Введите серию и номер паспорта");
        citizen.setPassport(in.nextLine());

        reqBuilder = new RequestBuilder();
        transformer = new ObjectXmlTransformer();
        System.out.println("Отправка данных на сервер...");
        reqBuilder.makePostRequest(newCitizen, transformer.objectToXml(citizen));
        System.out.println("Данные успешно отправлены!");

    }
}
