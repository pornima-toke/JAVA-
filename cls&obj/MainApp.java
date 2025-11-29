import java.util.*;

class ServiceHistory {
    int id;
    String serviceDate;
    String description;
    double cost;

    ServiceHistory(int id, String serviceDate, String description, double cost) {
        this.id = id;
        this.serviceDate = serviceDate;
        this.description = description;
        this.cost = cost;
    }

    void showServiceHistory() {
        System.out.println("   Service ID: " + id + ", Date: " + serviceDate +
                ", Desc: " + description + ", Cost: " + cost);
    }
}

class Car {
    int id;
    String model;
    String regNo;
    List<ServiceHistory> serviceHistoryList = new ArrayList<>();

    Car(int id, String model, String regNo) {
        this.id = id;
        this.model = model;
        this.regNo = regNo;
    }

    void addService(ServiceHistory sh) {
        serviceHistoryList.add(sh);
    }

    void showCarDetails() {
        System.out.println(" Car ID: " + id + ", Model: " + model + ", RegNo: " + regNo);
        if (serviceHistoryList.isEmpty()) {
            System.out.println("   No service history yet.");
        } else {
            for (ServiceHistory sh : serviceHistoryList) {
                sh.showServiceHistory();
            }
        }
    }
}

class Customer {
    int id;
    String name;
    String contact;
    List<Car> carList = new ArrayList<>();

    Customer(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    void addCar(Car car) {
        carList.add(car);
    }

    void showCustomerDetails() {
        System.out.println("Customer ID: " + id + ", Name: " + name + ", Contact: " + contact);
        for (Car car : carList) {
            car.showCarDetails();
        }
    }
}

class Garage {
    List<Customer> customers = new ArrayList<>();

    // Case 2: Register customer
    void registerCustomer(Customer c) {
        customers.add(c);
        System.out.println("✅ Customer Registered Successfully!");
    }

    // Case 3: Show all customers
    void showAllCustomers() {
        for (Customer c : customers) {
            c.showCustomerDetails();
        }
    }

    // Case 4: Take car for servicing
    void takeCarForService(int custId, int carId, ServiceHistory sh) {
        for (Customer c : customers) {
            if (c.id == custId) {
                for (Car car : c.carList) {
                    if (car.id == carId) {
                        car.addService(sh);
                        System.out.println("✅ Service Added Successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("❌ Customer/Car not found!");
    }

    // Case 5: Show all cars with customer + service history
    void showAllCarsWithServiceHistory() {
        for (Customer c : customers) {
            c.showCustomerDetails();
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Garage garage = new Garage();

        while (true) {
            System.out.println("\n--- Car Garage Menu ---");
            System.out.println("1. Create Service History Card");
            System.out.println("2. Register Customer");
            System.out.println("3. Show All Customers");
            System.out.println("4. Take Car for Servicing");
            System.out.println("5. Show All Cars with Customer and Service History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("👉 Service History is created along with Car (when servicing).");
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    Customer c = new Customer(cid, name, contact);

                    System.out.print("Enter Car ID: ");
                    int carId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Car Model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter Reg No: ");
                    String reg = sc.nextLine();
                    Car car = new Car(carId, model, reg);
                    c.addCar(car);

                    garage.registerCustomer(c);
                    break;

                case 3:
                    garage.showAllCustomers();
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();
                    System.out.print("Enter Car ID: ");
                    int cId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Service ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Service Date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter Cost: ");
                    double cost = sc.nextDouble();

                    ServiceHistory sh = new ServiceHistory(sid, date, desc, cost);
                    garage.takeCarForService(custId, cId, sh);
                    break;

                case 5:
                    garage.showAllCarsWithServiceHistory();
                    break;

                case 6:
                    System.out.println("🚪 Exiting Application...");
                    return;

                default:
                    System.out.println("❌ Invalid Choice!");
            }
        }
    }
}
