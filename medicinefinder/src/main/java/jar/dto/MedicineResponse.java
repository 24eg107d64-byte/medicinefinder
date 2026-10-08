package jar.dto;

public class MedicineResponse {

    private String medicineName;
    private Double price;
    private Integer quantity;
    private String pharmacyName;

    public MedicineResponse() {
    }

    public MedicineResponse(String medicineName,
                            Double price,
                            Integer quantity,
                            String pharmacyName) {

        this.medicineName = medicineName;
        this.price = price;
        this.quantity = quantity;
        this.pharmacyName = pharmacyName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }
}