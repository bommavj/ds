public class basic {
    public static void main(String[] args) {
        int total = add(201, 199);
        System.out.println(total);

        //SelectAllCustomers("hyd");
    }

    private static int add(int a, int b) {

        int asqbsq = (a * a) - (b*b);
        System.out.println(asqbsq);

        /*int formula = (a * a) - (2 * a * b) - (b*b);
        System.out.println(formula);*/

        return a + b;
    }

    /*CREATE PROCEDURE SelectAllCustomers @City nvarchar(30)
    AS
    SELECT * FROM Customers WHERE City = @City
            GO;*/

    //CALL SelectAllCustomers('London')

    /*private static void SelectAllCustomers(String city){
        retrun repo.getStation(city);
    }*/
}
