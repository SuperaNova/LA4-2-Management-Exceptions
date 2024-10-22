package Management_Exc;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
        boolean MFound = false, EFound = false, ENameFound = false, MNameFound = false, PFound = false;
        for (Person p: persons) {
            if (manager.equals(p.getName()) || employee.equals(p.getName())) {
                PFound = true; // manager or person name is found in list;
                if (p instanceof Employee) {
                    EFound = true; // found employee name
                    for (Person p2: persons) { // look for employee manager
                        if (manager.equals(p.getName())) {
                            MNameFound = true; // found manager name
                            if (p2 instanceof Manager) {
                                MFound = true; // manager is found
                                ((Manager) p2).giveRaise((Employee) p, salary);
                            }
                        }
                    }
                }
            }
        }
        if (!PFound) throw new NoSuchElementException("name does not exist");
        else if (PFound && !EFound) throw new ClassCastException("name is not an employee");
        else if (PFound && ENameFound && !MNameFound) throw new ClassCastException("name is not a manager");
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {

    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws IllegalArgumentException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        return null;
    }
}
