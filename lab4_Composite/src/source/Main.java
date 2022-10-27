package source;


public class Main {
    public static void main(String[] args){

        Registry hr = Registry.getRegistry();

        Manager ceo = null;
        try{
            ceo = new Manager("Ahmad", "Shawawreh", 3000, 200, 0);
            ceo.printemployee();
            hr.addEmployee(ceo);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee salesHead = null;
        try{
            salesHead = new employee("Ahmad2", "Shawawreh", 2000, ceo.id);
            salesHead.printemployee();
            hr.addEmployee(salesHead);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee marketingHead = null;
        try{
            marketingHead = new employee("Ahmad3", "Shawawreh", 1000, ceo.id);
            marketingHead.printemployee();
            hr.addEmployee(marketingHead);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee emp1 = null;
        try{
            emp1 = new employee("Ahmad4", "Shawawreh", 700, salesHead.id);
            emp1.printemployee();
            hr.addEmployee(emp1);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        ceo.add(salesHead);
        ceo.add(marketingHead);

        salesHead.add(emp1);

        System.out.println("\nEmployee List:");
        ceo.printemployee();
        for (employee headEmployee : ceo.getBoss()) {
            System.out.print("  ");
            headEmployee.printemployee();

            for (employee emp : headEmployee.getBoss()){
                System.out.print("       ");
                emp.printemployee();
            }
        }

    }
}
