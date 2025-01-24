package educationCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    // Attributes 
    private double fee; // Course fee
    private double discount; // Discount percentage

    // Constructor 
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalPrice() {
        return fee - (fee * (discount / 100));
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + ", Fee: $" + fee + ", Discount: " + discount + "%, Final Price: $" + getFinalPrice();
    }
}
