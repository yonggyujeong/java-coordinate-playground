public class RentCompany {

    private static RentCompany rentCompany;

    private RentCompany() {

    }

    public static RentCompany create() {
        if (rentCompany == null) {
            rentCompany = new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(Car car) {

    }
}
