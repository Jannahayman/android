public abstract class Car
{
    protected String CarType;
    protected String Color;
    protected String ProductionDate;
    protected String FuelType;
    protected int WarrantyYears;
    private static int countObjects = 0;

    public String getCarType()
    {
        return CarType;
    }
    public void setCarType(String carType)
    {
        CarType = carType;
    }

    Car()
    {
        CarType = "KIA";
        Color = "Black";
        ProductionDate = "10/10/2020";
        FuelType = "95";
        WarrantyYears = 10;
    }
    Car(String color, String prodDate, String fuelType, int warrantyYears, String carType)
    {
        Color = color;
        ProductionDate = prodDate;
        FuelType = fuelType;
        WarrantyYears = warrantyYears;
        CarType = carType;
    }

    public static int getCountObjects() {
        return countObjects;
    }

    public static void setCountObjects(int countObjects) {
        Car.countObjects = countObjects;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setProductionDate(String productionDate) {
        ProductionDate = productionDate;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public void setWarrantyYears(int warrantyYears) {
        WarrantyYears = warrantyYears;
    }

    public String getColor() {
        return Color;
    }

    public String getProductionDate() {
        return ProductionDate;
    }

    public int getWarrantyYears() {
        return WarrantyYears;
    }

    public abstract String getFuelType();



    public static void main (String [] args)
    {
        BMW bmw1 = new BMW("19/4/2002", "92",5,true);
        Mercedes m1 = new Mercedes("12/7/2020","Rechargable", 7,false);
        System.out.println(bmw1.getFuelType());
        System.out.println(m1.getFuelType());
        System.out.println(getCountObjects());
    }
}

class BMW extends Car
{
    private String BMWVersion;
    private boolean IsConvertible;

    BMW(String color, String version)
    {
        this.Color = color;
        this.BMWVersion = version;
        this.ProductionDate = "Standard";
        this.FuelType = "Standard";
        this.WarrantyYears = 10;
        setCountObjects(getCountObjects() + 1);
    }
    BMW(String prodDate, String fuelType, int warrantyYears, boolean isConvertible)
    {
        this.ProductionDate = prodDate;
        this.FuelType = fuelType;
        this.WarrantyYears = warrantyYears;
        this.BMWVersion = "Standard";
        this.Color = "Black";
        IsConvertible = isConvertible;
        setCountObjects(getCountObjects() + 1);
    }
    @Override
    public String getFuelType()
    {
        return  "This BMW's Fuel type is " + super.FuelType;
    }

    public String getBMWVersion() {
        return BMWVersion;
    }

    public void setBMWVersion(String BMWVersion) {
        this.BMWVersion = BMWVersion;
    }

    public boolean isConvertible() {
        return IsConvertible;
    }

    public void setConvertible(boolean convertible) {
        IsConvertible = convertible;
    }
}

class Mercedes extends Car
{
    private String MercVersion;
    private boolean IsConvertible;
    @Override
    public String getFuelType()
    {
        return  "This Mercedes' Fuel type is " + super.FuelType;
    }
    Mercedes(String color, String version)
    {
        this.Color = color;
        this.MercVersion = version;
        this.ProductionDate = "Standard";
        this.FuelType = "Standard";
        this.WarrantyYears = 10;
        IsConvertible = false;
        setCountObjects(getCountObjects() + 1);
    }
    Mercedes(String prodDate, String fuelType, int warrantyYears, boolean isCon)
    {
        this.ProductionDate = prodDate;
        this.FuelType = fuelType;
        this.WarrantyYears = warrantyYears;
        this.MercVersion = "Standard";
        this.Color = "Blue";
        IsConvertible = isCon;
        setCountObjects(getCountObjects() + 1);
    }

    public String getMercVersion() {
        return MercVersion;
    }

    public void setMercVersion(String mercVersion) {
        MercVersion = mercVersion;
    }

    public boolean isConvertible() {
        return IsConvertible;
    }

    public void setConvertible(boolean convertible) {
        IsConvertible = convertible;
    }
}
